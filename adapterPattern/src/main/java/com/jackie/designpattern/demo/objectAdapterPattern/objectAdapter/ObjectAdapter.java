package com.jackie.designpattern.demo.objectAdapterPattern.objectAdapter;

import com.jackie.designpattern.demo.objectAdapterPattern.objectAdaptee.DataSourceOperate;
import com.jackie.designpattern.demo.objectAdapterPattern.objectAdaptee.ThirdEncryption;
import com.jackie.designpattern.demo.objectAdapterPattern.objectTarget.TargetInterface;

/**
 * 类适配器模式
 *
 * 适配器类
 *
 * Created by heting on 2018/4/17.
 */
public class ObjectAdapter extends DataSourceOperate implements TargetInterface {

    private ThirdEncryption encryption = new ThirdEncryption();

    public void md5EncryptAndSave(Object o) {
        String s = encryption.md5Encrypt(o);
        super.save(s);
    }

    public void sha5EncryptAndSave(Object o) {
        String s = encryption.sha256Encrypt(o);
        super.save(s);
    }
}
