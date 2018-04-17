package com.jackie.designpattern.demo.objectAdapterPattern.objectTarget;

/**
 * 目标类
 *
 * Created by heting on 2018/4/17.
 */
public interface TargetInterface {

    void md5EncryptAndSave(Object o);

    void sha5EncryptAndSave(Object o);

}
