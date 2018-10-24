package com.zlf.springboot.learning.chap3;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = Config.class)
@PropertySource(value = "classpath:my.properties",encoding = "utf-8")
public class ConfigInfo {
}
