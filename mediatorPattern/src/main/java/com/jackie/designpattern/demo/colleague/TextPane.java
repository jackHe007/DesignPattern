package com.jackie.designpattern.demo.colleague;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/3 - 15:42
 * @history 2018/8/3 - 15:42 ting.he4@pactera.com  create.
 */
public class TextPane extends Pane {

    @Override
    public void function() {
        System.out.println("文本输入功能...");
    }

    public void write() {
        System.out.println("写入文本内容");
    }

}
