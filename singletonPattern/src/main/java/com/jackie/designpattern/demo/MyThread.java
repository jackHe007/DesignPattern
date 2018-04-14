package com.jackie.designpattern.demo;

/**
 * Created by heting on 2018/4/14.
 */
public class MyThread implements Runnable {

    private LazySingletonPattern instance;

    public void run() {
        instance = LazySingletonPattern.getInstance();
        System.out.println(instance);
    }

}
