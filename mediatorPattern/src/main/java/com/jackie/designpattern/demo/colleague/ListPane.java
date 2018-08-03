package com.jackie.designpattern.demo.colleague;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/3 - 15:43
 * @history 2018/8/3 - 15:43 ting.he4@pactera.com  create.
 */
public class ListPane extends Pane {

    @Override
    public void function() {
        System.out.println("列表展示功能...");
    }

    public void select() {
        System.out.println("查询列表内容...");
    }
}
