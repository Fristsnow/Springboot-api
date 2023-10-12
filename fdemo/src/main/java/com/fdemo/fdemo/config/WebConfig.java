package com.fdemo.fdemo.config;

import com.fdemo.fdemo.interceptor.LoginCheckInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Slf4j
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;

//    @Override
//    public void addCorsMappings(CorsRegistry registry){
//        log.info("拦截{}", registry);
//        registry.addMapping("/**")
//                //是否发送Cookie
//                .allowCredentials(true)
//                //放行哪些原始域
////                .allowedOrigins("*")
//                .allowedOriginPatterns("*")
//                .allowedMethods(new String[]{"GET","POST","PUT","DELETE"})
//                .allowedHeaders("*")
//                .exposedHeaders("*");
//    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginCheckInterceptor)
                .addPathPatterns("/**");
    }


}
