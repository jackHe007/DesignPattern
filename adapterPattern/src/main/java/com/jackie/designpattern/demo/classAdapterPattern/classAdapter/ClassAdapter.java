package com.jackie.designpattern.demo.classAdapterPattern.classAdapter;

import com.jackie.designpattern.demo.classAdapterPattern.classAdaptee.DataSourceOperate;
import com.jackie.designpattern.demo.classAdapterPattern.classAdaptee.ThirdEncryption;
import com.jackie.designpattern.demo.classAdapterPattern.classTarget.TargetInterface;

/**
 * 对象适配器模式
 * 适配器类
 *
 * Created by heting on 2018/4/17.
 */
public class ClassAdapter extends ThirdEncryption implements TargetInterface,DataSourceOperate {

    public void sha256EncryptAndSave(Object o) {
        String s = sha256Encrypt(o);
        this.save(s);
    }

    public void md5EncryptAndCommit(Object o) {
        String s = md5Encrypt(o);
        this.save(s);
    }

    public void aesEncryptAndSave(Object o) {
        String s = aesEncrypt(o);
        this.save(s);
    }

    public void save(Object o) {
        System.out.println("保存 " + o.toString());
    }

    public void select(Object o) {

    }

    public void update(Object o) {

    }
}
