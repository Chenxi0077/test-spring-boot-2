package com.chenxi.service;

import com.chenxi.entity.Person;

import java.util.List;

public interface PersonService {
    boolean login(String name,String password);
    boolean regist(Person person);
}
