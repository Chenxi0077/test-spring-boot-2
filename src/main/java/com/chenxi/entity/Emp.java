package com.chenxi.entity;
public class Emp {
    private Integer id;
    private String name;
    private Double salary;
    private Integer age;
    public Emp() {
        super();
    }
    public Emp(Integer id,String name,Double salary,Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
