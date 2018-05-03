package com.jackie.designpattern.demo.leaf;

import com.jackie.designpattern.demo.component.ViewControl;

/**
 * 叶子构件，按钮
 *
 * Created by heting on 2018/5/3.
 */
public class Button implements ViewControl {

    public void show() {
        System.out.println("show the button...");
    }

}
