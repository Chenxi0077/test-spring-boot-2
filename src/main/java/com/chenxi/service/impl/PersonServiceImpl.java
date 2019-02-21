package com.chenxi.service.impl;

import com.chenxi.dao.PersonMapper;
import com.chenxi.entity.Person;
import com.chenxi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    

    public boolean login(String name,String password){
        Person person = personMapper.selectByName(name);
        if(person==null){
            return false;
        }else if(!person.getPassword().equals(password) && !person.getName().equals(name)){
            return false;
        }
        return true;
    }

    public boolean regist(Person person){
        personMapper.insert(person);
        return true;
    }
}
