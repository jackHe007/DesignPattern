package com.jackie.decoratorpattern.demo.decorator;

import com.jackie.decoratorpattern.demo.component.EncryptData;

/**
 * 具体装饰类，rsa加密
 *
 * Created by heting on 2018/5/5.
 */
public class RSAEncryptDecorator extends AbstractAlgorithmDecorator {

    public RSAEncryptDecorator(EncryptData encryptData) {
        super(encryptData);
    }

    @Override
    public void showData() {
        this.rsaEncryptString();
        super.showData();
    }

    private void rsaEncryptString() {
        System.out.println("数据被rsa加密了");
    }
}
