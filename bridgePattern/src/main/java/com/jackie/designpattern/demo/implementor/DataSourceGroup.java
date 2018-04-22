package com.jackie.designpattern.demo.implementor;

import java.io.OutputStream;

/**
 *
 * 数据库父类接口
 *
 * Created by heting on 2018/4/22.
 */
public interface DataSourceGroup {

    void output(OutputStream os);

}
