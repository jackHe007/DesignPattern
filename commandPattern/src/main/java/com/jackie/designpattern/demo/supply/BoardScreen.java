package com.jackie.designpattern.demo.supply;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/30 - 10:33
 * @history 2018/7/30 - 10:33 ting.he4@pactera.com  create.
 */
public class BoardScreen {

    public void open(String name) {
        System.out.println("打开了" + name);
    }

    public void create(String name) {
        System.out.println("创建了" + name);
    }

    public void edit(String name) {
        System.out.println("编辑了" + name);
    }

}
