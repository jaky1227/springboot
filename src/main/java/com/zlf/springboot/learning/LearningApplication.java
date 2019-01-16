package com.zlf.springboot.learning;

import com.zlf.springboot.learning.chap3.Fruit;
import com.zlf.springboot.learning.chap8.DemoReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@SpringBootApplication
@ServletComponentScan
@Slf4j
public class LearningApplication {

    @Resource
    Fruit fruit;

    @RequestMapping("/")
    public List<String> sayHello(){
        log.info("say hello world");
        List<String> list = Arrays.asList("aaa","ddd","dddd");
//        list.add("a");
        return list;
    }

    @RequestMapping("/fruit")
    public String getFruit(){
        log.info("get Fruit name and color");
        return fruit.getName()+" "+fruit.getColor();
    }

    @GetMapping("/demo/valid")
    public String demovalid(@Valid DemoReq req){
        return req.getCode()+", "+req.getName();

    }


	public static void main(String[] args) {
        SpringApplication.run(LearningApplication.class, args);
        log.info("chapter7 服务启动");
	}
}
