package com.jackie.designpattern.demo.implementor;

import java.io.OutputStream;

/**
 *
 * mysql数据库
 *
 * Created by heting on 2018/4/22.
 */
public class MySQLDataSource implements DataSourceGroup {

    public void output(OutputStream os) {
        System.out.println("output from MySQL datasource");
    }

}
