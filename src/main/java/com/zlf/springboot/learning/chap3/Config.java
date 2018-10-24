package com.zlf.springboot.learning.chap3;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@PropertySource(value = "classpath:my.properties",encoding = "utf-8")
@ConfigurationProperties(prefix = "config")
@Data
public class Config {
    String code;
    String name;
    List<String> hobby;
}
