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
        /*
        这个拦截器的问题
        先进的拦截器
        直接就false了
        可以理解为这里的拦截器和咱们配置的跨域有冲突
        在这里加上这几行就没问题了其他的也
         */
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Methods",
//                "PUT,POST, GET, OPTIONS, DELETE");
//        response.setHeader("Access-Control-Max-Age", "0");
//        response.setHeader(
//                "Access-Control-Allow-Headers",
//                "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        response.setHeader("XDomainRequestAllowed", "1");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");

        if (request.getRequestURI().toString().contains("/login")) {
            log.info("login我放行了.....");
            return true;
        }
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
