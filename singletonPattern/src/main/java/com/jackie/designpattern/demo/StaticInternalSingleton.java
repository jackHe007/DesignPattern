package com.jackie.designpattern.demo;

/**
 * Created by heting on 2018/4/14.
 */
public class StaticInternalSingleton {

    private StaticInternalSingleton() {

    }

    private static class InteralSingleton {
        private static StaticInternalSingleton singleton = new StaticInternalSingleton();
    }

    public static StaticInternalSingleton getInstance() {
        return InteralSingleton.singleton;
    }

    public static void main(String[] args) {
        StaticInternalSingleton first = StaticInternalSingleton.getInstance();
        StaticInternalSingleton second = StaticInternalSingleton.getInstance();
        System.out.println(first == second);
    }

}
