package com.chenxi.controller;

import com.chenxi.entity.Emp;
import com.chenxi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/selectAll")
    public String selectAll(ModelMap mm){
        List<Emp> list = empService.selectEmp();
        mm.addAttribute("list",list);
        return "forward:/emplist.jsp";
    }

    @RequestMapping("/add")
    public String addEmp(Emp emp){
        empService.insertEmp(emp);
        return "redirect:/emp/selectAll";
    }

    @RequestMapping("/getById")
    public String getById(Integer id,ModelMap mm){
        Emp emp = empService.selectEmpById(id);
        mm.addAttribute("emp",emp);
        return "forward:/updateEmp.jsp";
    }

    @RequestMapping("/update")
    public String update(Emp emp){
        empService.updateEmpById(emp);
        return "redirect:/emp/selectAll";
    }

    @RequestMapping("/remove")
    public String remove(Integer id){
        empService.deleteEmpById(id);
        return "forward:/emp/selectAll";
    }
}
