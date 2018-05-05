package com.jackie.decoratorpattern.demo.decorator;

import com.jackie.decoratorpattern.demo.component.EncryptData;

/**
 * 具体装饰类，逆向加密
 *
 * Created by heting on 2018/5/5.
 */
public class ReverseEncryptDecorator extends AbstractAlgorithmDecorator {

    public ReverseEncryptDecorator(EncryptData encryptData) {
        super(encryptData);
    }

    @Override
    public void showData() {
        this.reverse();
        super.showData();
    }

    private void reverse() {
        System.out.println("数据被逆转加密了");
    }

}
