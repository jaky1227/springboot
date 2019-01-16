package com.zlf.springboot.learning.jpa;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Setter
@Getter
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer age;

    public User() {

    }

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
