package com.jackie.designpattern.demo.classAdapterPattern.classTarget;

/**
 * 目标类
 *
 * Created by heting on 2018/4/17.
 */
public interface TargetInterface<T> {

    void sha256EncryptAndSave(T t);

    void md5EncryptAndCommit(T t);

    void aesEncryptAndSave(T t);

}
