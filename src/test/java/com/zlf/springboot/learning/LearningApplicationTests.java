package com.zlf.springboot.learning;

import com.zlf.springboot.learning.chap3.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearningApplicationTests {

	@Resource
	Config config;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testSayHello(){
		assertEquals("Hello World!",new LearningApplication().sayHello());
	}

	@Test
	public void testConfig(){
		System.out.println(config.getName());
	}

}
