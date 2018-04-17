package com.jackie.designpattern.demo.objectAdapterPattern.client;

import com.jackie.designpattern.demo.objectAdapterPattern.objectAdapter.ObjectAdapter;

/**
 * 客户端类
 *
 * Created by heting on 2018/4/17.
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        ObjectAdapter adapter = new ObjectAdapter();
        adapter.md5EncryptAndSave("more test");
    }

}
