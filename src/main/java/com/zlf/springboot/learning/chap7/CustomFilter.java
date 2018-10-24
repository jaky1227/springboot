package com.zlf.springboot.learning.chap7;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class CustomFilter implements Filter {

    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
        log.info("filter 1 : 初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        log.info("Filter 1 : doFilter 请求处理");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        log.info("Filter 1 : filter 销毁");

    }

}