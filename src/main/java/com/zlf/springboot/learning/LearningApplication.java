package com.zlf.springboot.learning;

import com.zlf.springboot.learning.chap3.Fruit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@SpringBootApplication
public class LearningApplication {

    @Resource
    Fruit fruit;

    @RequestMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @RequestMapping("/fruit")
    public String getFruit(){
        return fruit.getName()+" "+fruit.getColor();
    }


	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}
}
