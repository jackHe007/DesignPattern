package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.component.ViewControl;
import com.jackie.designpattern.demo.composite.Form;
import com.jackie.designpattern.demo.leaf.Button;
import com.jackie.designpattern.demo.leaf.RadioButton;
import com.jackie.designpattern.demo.leaf.TextBox;

/**
 * 客户端
 *
 * Created by heting on 2018/5/3.
 */
public class ViewClient {

    public static void main(String[] args) {
        ViewControl button,textBox,radioButton;
        Form form;
        button = new Button();
        textBox = new TextBox();
        radioButton = new RadioButton();
        form = new Form();
        form.addView(button);
        form.addView(textBox);
        form.addView(radioButton);
        form.show();
    }

}
