package com.jackie.designpattern.demo.abstraction;

import com.jackie.designpattern.demo.implementor.DataSourceGroup;

/**
 *
 * 抽象文件导出类
 *
 * Created by heting on 2018/4/22.
 */
public abstract class AbstractFileConvert {

    protected DataSourceGroup data;

    public void setData(DataSourceGroup data) {
        this.data = data;
    }

    public abstract void doParse(String filename);

}
