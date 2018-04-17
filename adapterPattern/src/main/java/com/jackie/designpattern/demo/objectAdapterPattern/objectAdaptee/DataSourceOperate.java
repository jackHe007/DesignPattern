package com.jackie.designpattern.demo.objectAdapterPattern.objectAdaptee;

/**
 * 适配者类
 *
 * Created by heting on 2018/4/17.
 */
public class DataSourceOperate {

    public void save(Object o) {
        System.out.println("保存了 " + o.toString());
    }

}
