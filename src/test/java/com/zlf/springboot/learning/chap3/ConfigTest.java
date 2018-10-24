package com.zlf.springboot.learning.chap3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigInfo.class)
//@SpringBootTest
public class ConfigTest {

    @Resource
    Config config;
    @Test
    public void testConfig(){
        System.out.println(config.getCode());
        System.out.println(config.getHobby());
    }

}