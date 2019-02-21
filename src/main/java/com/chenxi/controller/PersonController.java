package com.chenxi.controller;

import com.chenxi.entity.Person;
import com.chenxi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @Autowired
    private HttpSession session;


    @RequestMapping("/login")
    public String login(String name,String password,String code){
        String safecode = (String) session.getAttribute("safecode");
        boolean login = personService.login(name, password);
        if(safecode.equals(code)){
            if(login){
                return "redirect:/emp/selectAll";
            }else{
                return "forward:/login.jsp";
            }
        }
        return "forward:/login.jsp";
    }

    @RequestMapping("/regist")
    public Object regist(Person person,String code){
        String safecode = (String) session.getAttribute("safecode");
        if(code.equals(safecode)){
            boolean regist = personService.regist(person);
            return "forward:/login.jsp";
        }else{
            return "forward:/regist.jsp";
        }

    }
}
