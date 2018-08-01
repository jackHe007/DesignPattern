package com.jackie.designpattern.demo.bean;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/1 - 15:22
 * @history 2018/8/1 - 15:22 ting.he4@pactera.com  create.
 */
public class Student {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
