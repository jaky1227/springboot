package com.zlf.springboot.learning.chap7;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class FilterConfig {
    @Bean
    public Filter customFilter(){
        return new CustomFilter();
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean1(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(customFilter());
        registration.setName("customFilter");
        registration.addUrlPatterns("/fruit");
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public Filter filterTwo(){
        return new FilterTwo();
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean2(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(filterTwo());
        registration.setName("filterTwo");
        registration.addUrlPatterns("/*");
        registration.setOrder(2);
        return registration;
    }

}
