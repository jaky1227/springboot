package com.zlf.springboot.learning;

import com.zlf.springboot.learning.chap3.Fruit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

@RestController
@SpringBootApplication
@ServletComponentScan
@Slf4j
public class LearningApplication {

    @Resource
    Fruit fruit;

    @RequestMapping("/")
    public String sayHello(){
        log.info("say hello world");
        return "Hello World!";
    }

    @RequestMapping("/fruit")
    public String getFruit(){
        log.info("get Fruit name and color");
        return fruit.getName()+" "+fruit.getColor();
    }


	public static void main(String[] args) {
        SpringApplication.run(LearningApplication.class, args);
        log.info("chapter7 服务启动");

	}
}
