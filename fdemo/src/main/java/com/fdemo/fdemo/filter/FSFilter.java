package com.fdemo.fdemo.filter;

import com.alibaba.fastjson.JSONObject;
import com.fdemo.fdemo.common.JwtUtils;
import com.fdemo.fdemo.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(urlPatterns = "/*")
@Slf4j
public class FSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截到了数据");
        // 数据类型强转
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // 1, 获取url
        String url = request.getRequestURI().toString();
        log.info("获取url：{}", url);

        // 2, 判断请求的url中是否包含login，如果包含则放行
        if (url.contains("login")) {
            log.info("login 放行...");
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        // 3, 获取请求头的令牌(token)
        String jwt = request.getHeader("token");
        // 4, 判断令牌是否存在，如果不存在，则报错（未登录）
        if (!StringUtils.hasLength(jwt)) {
            log.info("token === null");
            Result error = Result.error("unauthenticated");
            String errorJson = JSONObject.toJSONString(error);
            response.getWriter().write(errorJson);
            return;
        }
        // 5, 解析token,如果解析失败,则报错
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("解析失败，应该过期了,");
            Result error = Result.error("unauthenticated");
            String s = JSONObject.toJSONString(error);
            response.getWriter().write(s);
            return;
        }
        //放你过去,我对你好吧
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
