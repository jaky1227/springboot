package com.zlf.springboot.learning.chap6;

import com.zlf.springboot.learning.LearningApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = LearningApplication.class)
//@WebMvcTest(PathVariableController.class)
@AutoConfigureMockMvc
public class PathVariableControllerTest {

//    @Autowired
//    WebApplicationContext wc;
    @Autowired
    MockMvc mockMvc;
//    @Before
//    public void setUp() throws Exception{
//        mockMvc = MockMvcBuilders.standaloneSetup(new PathVariableController()).build();
//    }
    @Test
    public void pathVariable() {
    }

    @Test
    public void param() {
    }

    @Test
    public void demo() throws Exception{
        String msg = "Hello world!";
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/mock")
                .param("msg",msg)
                .accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print()).andReturn();
        String ss = result.getResponse().getContentAsString();
        System.out.println(ss);
        Assert.assertEquals(msg, result.getResponse().getContentAsString());
    }
}