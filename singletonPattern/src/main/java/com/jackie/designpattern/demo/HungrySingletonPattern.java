package com.jackie.designpattern.demo;

/**
 * 饿汉式
 *
 * Created by heting on 2018/4/14.
 */
public class HungrySingletonPattern {

    private static HungrySingletonPattern instance = new HungrySingletonPattern();

    private HungrySingletonPattern() {

    }

    public static HungrySingletonPattern getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        HungrySingletonPattern one = HungrySingletonPattern.getInstance();
        HungrySingletonPattern two = HungrySingletonPattern.getInstance();
        System.out.println(one == two);
    }

}
