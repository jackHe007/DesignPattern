package com.jackie.designpattern.demo.classAdapterPattern.client;

import com.jackie.designpattern.demo.classAdapterPattern.classAdapter.ClassAdapter;

/**
 * 客户端类
 *
 * Created by heting on 2018/4/17.
 */
public class ClassClient {

    public static void main(String[] args) {
        ClassAdapter adapter = new ClassAdapter();
        adapter.aesEncryptAndSave("123");
    }

}
