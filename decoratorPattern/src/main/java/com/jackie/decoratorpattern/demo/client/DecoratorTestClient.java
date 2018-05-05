package com.jackie.decoratorpattern.demo.client;

import com.jackie.decoratorpattern.demo.component.EncryptData;
import com.jackie.decoratorpattern.demo.component.StringData;
import com.jackie.decoratorpattern.demo.decorator.ModelEncryptDecorator;
import com.jackie.decoratorpattern.demo.decorator.RSAEncryptDecorator;
import com.jackie.decoratorpattern.demo.decorator.ReverseEncryptDecorator;

/**
 * 测试客户端
 *
 * Created by heting on 2018/5/5.
 */
public class DecoratorTestClient {

    public static void main(String[] args) {
        EncryptData stringData,modelData,reverseData,rsaData;
        stringData = new StringData();
        modelData = new ModelEncryptDecorator(stringData);
        reverseData = new ReverseEncryptDecorator(modelData);
        rsaData = new RSAEncryptDecorator(reverseData);
        rsaData.showData();
    }

}
