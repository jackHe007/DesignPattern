package com.jackie.designpattern.demo.classAdapterPattern.classAdaptee;

/**
 * 适配者类
 *
 * Created by heting on 2018/4/17.
 */
public interface DataSourceOperate<T> {

    void save(T t);

    void select(T t);

    void update(T t);
}
