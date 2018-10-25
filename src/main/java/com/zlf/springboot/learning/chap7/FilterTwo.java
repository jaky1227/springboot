package com.zlf.springboot.learning.chap7;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class FilterTwo implements Filter {

    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
        log.info("filter 2 : 初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("Filter 2 : doFilter 请求处理");
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("Filter 2 After Filter chain");
    }

    @Override
    public void destroy() {
        log.info("Filter 2 : filter 销毁");
    }


}
