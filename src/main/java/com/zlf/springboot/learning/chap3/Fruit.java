package com.zlf.springboot.learning.chap3;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "fruit")
@Data
public class Fruit {
    private String name;
    private String color;
}
