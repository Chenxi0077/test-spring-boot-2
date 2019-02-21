package com.chenxi.dao;

import com.chenxi.entity.Person;

import java.util.List;

public interface PersonMapper {

    Person selectByName(String name);

    List<Person> getAll();

    void insert(Person person);
}