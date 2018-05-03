package com.jackie.designpattern.demo.leaf;

import com.jackie.designpattern.demo.component.ViewControl;

/**
 * 叶子构件，单选按钮
 *
 * Created by heting on 2018/5/3.
 */
public class RadioButton implements ViewControl {

    public void show() {
        System.out.println("show the RadioButton");
    }

}
