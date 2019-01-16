package com.zlf.springboot.learning.chap8;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zlf.springboot.learning.Model.ExtendableBean;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;

public class RawBeanTest {


    @Test
    public void whenSerializingUsingJsonAnyGetter_thenCorrect()
            throws JsonProcessingException {

        RawBean bean = new RawBean("My bean", "{\"attr\":false}");

        String result = new ObjectMapper().writeValueAsString(bean);
//        assertThat(result, containsString("My bean"));
//        assertThat(result, containsString("{\"attr\":false}"));
        System.out.println(result);
    }

}