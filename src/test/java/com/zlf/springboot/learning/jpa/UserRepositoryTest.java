package com.zlf.springboot.learning.jpa;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
//        userRepository.save(new User("zhangsan",18));
//        userRepository.save(new User("lisi",21));
//        assertEquals(18L,(long)userRepository.findByName("zhangsan").getAge());

//        userRepository.modifyNameById("zhaowu",5L);

//        assertEquals("zhaowu",userRepository.findByAge(18).getName());

        userRepository.modifyAgeByName(17,"zhangsan");
        assertEquals(17L,(long)userRepository.findByName("zhangsan").getAge());
    }

}