package com.fdemo.fdemo.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.fdemo.fdemo.common.JwtUtils;
import com.fdemo.fdemo.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandle....");
        // 1, 获取请求头的令牌(token)
        String jwt = request.getHeader("token");
        // 2, 判断令牌是否存在，如果不存在，则报错（未登录）
        if (!StringUtils.hasLength(jwt)) {
            log.info("token === null");
            Result error = Result.error("unauthenticated");
            String errorJson = JSONObject.toJSONString(error);
            response.getWriter().write(errorJson);
            return false;
        }
        // 3, 解析token,如果解析失败,则报错
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("解析失败，应该过期了,");
            Result error = Result.error("unauthenticated");
            String s = JSONObject.toJSONString(error);
            response.getWriter().write(s);
            return false;
        }
        //放你过去,我对你好吧
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("postHandle....");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion....");
    }
}
