package com.zlf.springboot.learning.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByName(String name);

    User findByAge(Integer age);

    @Transactional
    @Modifying
    @Query("update User u set u.age=?1 where u.name=?2")
    int modifyAgeByName(Integer age, String name);




}
