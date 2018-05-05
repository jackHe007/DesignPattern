package com.jackie.decoratorpattern.demo.decorator;

import com.jackie.decoratorpattern.demo.component.EncryptData;

/**
 * 抽象装饰类
 *
 * Created by heting on 2018/5/5.
 */
public abstract class AbstractAlgorithmDecorator implements EncryptData {

    private EncryptData encryptData;

    public AbstractAlgorithmDecorator(EncryptData encryptData) {
        this.encryptData = encryptData;
    }

    public void showData() {
        encryptData.showData();
    }

}
