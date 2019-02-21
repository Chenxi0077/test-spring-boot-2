package com.chenxi;

import com.chenxi.dao.PersonMapper;
import com.chenxi.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDao {
    @Autowired
    private PersonMapper personMapper;
    @Test
    public void test1(){
        personMapper.insert(new Person(null,"鱼鱼","123456",0,16));

    }
}
