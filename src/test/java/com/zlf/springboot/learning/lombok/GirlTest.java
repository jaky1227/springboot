package com.zlf.springboot.learning.lombok;

import org.junit.Test;

import static org.junit.Assert.*;

public class GirlTest {
    @Test
    public void testGirl(){
        Girl girl = new Girl();
        girl.setAge(12);
        assertEquals(12,girl.getAge());
    }

}