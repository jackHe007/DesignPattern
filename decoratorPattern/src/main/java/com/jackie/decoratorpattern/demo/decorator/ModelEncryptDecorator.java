package com.jackie.decoratorpattern.demo.decorator;

import com.jackie.decoratorpattern.demo.component.EncryptData;

/**
 * 具体装饰类，求模加密
 *
 * Created by heting on 2018/5/5.
 */
public class ModelEncryptDecorator extends AbstractAlgorithmDecorator {

    public ModelEncryptDecorator(EncryptData encryptData) {
        super(encryptData);
    }

    @Override
    public void showData() {
        this.modelString();
        super.showData();
    }

    private void modelString() {
        System.out.println("数据被求模加密了");
    }
}
