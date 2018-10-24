package com.zlf.springboot.learning.lombok;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testGet(){
        Student student = new Student();
        student.setName("LiLi");
        student.setAge("18");
        System.out.println(student.getName());
    }

}