package com.jackie.designpattern.demo.colleague;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/3 - 15:45
 * @history 2018/8/3 - 15:45 ting.he4@pactera.com  create.
 */
public class GraphicPane extends Pane {

    @Override
    public void function() {
        System.out.println("绘画功能...");
    }

    public void drawing() {
        System.out.println("绘画中...");
    }
}
