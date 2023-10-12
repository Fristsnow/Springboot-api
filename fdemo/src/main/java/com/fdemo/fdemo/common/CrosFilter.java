package com.fdemo.fdemo.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
//@Component
@Slf4j
public class CrosFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) {

	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
//		HttpServletRequest request = (HttpServletRequest) req;
//		HttpServletResponse response = (HttpServletResponse) res;
//
//		response.setContentType("text/html;charset=UTF-8");
//		response.setHeader("Access-Control-Allow-Origin", "*");
//		response.setHeader("Access-Control-Allow-Methods",
//				"PUT,POST, GET, OPTIONS, DELETE");
//		response.setHeader("Access-Control-Max-Age", "0");
//		response.setHeader(
//						"Access-Control-Allow-Headers",
//						"Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
//		response.setHeader("Access-Control-Allow-Credentials", "true");
//		response.setHeader("XDomainRequestAllowed", "1");

//		response.setHeader("Access-Control-Allow-Origin", "*"); // 允许所有来源访问
//		response.setHeader("Access-Control-Allow-Credentials", "true");
//		response.setHeader("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS");
//		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
//		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
//		// 内容类型：如果是post请求必须指定这个属性
//		response.setHeader("Content-Type", "text/html;charset=utf-8");//application/json
//
//		String curOrigin = request.getHeader("Origin");
//		System.out.println("跨域过滤器被执行，当前访问来源者为：" + curOrigin);

//		chain.doFilter(request, response);
	}


	@Override
	public void destroy() {

	}

}
