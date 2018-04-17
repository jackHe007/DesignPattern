package com.jackie.designpattern.demo.objectAdapterPattern.objectAdaptee;

/**
 * 加密操作适配者类
 *
 * Created by heting on 2018/4/17.
 */
public class ThirdEncryption<T> {

    public String aesEncrypt(T t) {
        return "aes encrypt " + t.toString();
    }

    public String md5Encrypt(T t) {
        return "md5 encrypt " + t.toString();
    }

    public String sha256Encrypt(T t) {
        return "sha256 encrypt " + t.toString();
    }

}
