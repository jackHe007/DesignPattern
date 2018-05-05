package com.jackie.decoratorpattern.demo.component;

/**
 *
 * 具体构件，字符串内容显示
 *
 * Created by heting on 2018/5/5.
 */
public class StringData implements EncryptData {

    public void showData() {
        System.out.println("展示字符串信息");
    }

}
