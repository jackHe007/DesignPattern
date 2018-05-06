package com.jackie.facadepattern.demo.client;

import com.jackie.facadepattern.demo.facade.CommonFileFacade;
import com.jackie.facadepattern.demo.facade.RSAEncryptFileFacade;

/**
 * 外观模式客户端类
 *
 * Created by heting on 2018/5/6.
 */
public class FacadeTestClient {

    public static void main(String[] args) {
        CommonFileFacade facade;
        facade = new RSAEncryptFileFacade();
        facade.saveFile("abc.txt", "bcd.txt");
    }

}
