package com.jackie.designpattern.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 懒汉式
 *
 * Created by heting on 2018/4/14.
 */
public class LazySingletonPattern {

    private volatile static LazySingletonPattern instance;

    private LazySingletonPattern(){

    }

    public static LazySingletonPattern getInstance() {

        if (instance == null) {
            synchronized(LazySingletonPattern.class) {
                if (instance == null) {
                    instance = new LazySingletonPattern();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        MyThread one = new MyThread();
        MyThread two = new MyThread();
        MyThread third = new MyThread();
        MyThread four = new MyThread();
        executorService.execute(one);
        executorService.execute(two);
        executorService.execute(third);
        executorService.execute(four);
    }

}

