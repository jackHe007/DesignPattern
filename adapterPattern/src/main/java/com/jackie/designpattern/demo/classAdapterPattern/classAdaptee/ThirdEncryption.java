package com.jackie.designpattern.demo.classAdapterPattern.classAdaptee;

/**
 * 适配者类
 *
 * Created by heting on 2018/4/17.
 */
public class ThirdEncryption<T> {

    protected String aesEncrypt(T t) {
        return "aes encrypt " + t.toString();
    }

    protected String md5Encrypt(T t) {
        return "md5 encrypt " + t.toString();
    }

    protected String sha256Encrypt(T t) {
        return "sha256 encrypt " + t.toString();
    }

}
