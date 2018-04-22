package com.jackie.designpattern.demo.abstraction;

import java.io.ByteArrayOutputStream;

/**
 *
 * 导出txt文件
 *
 * Created by heting on 2018/4/22.
 */
public class TXTConvert extends AbstractFileConvert {

    public void doParse(String filename) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        data.output(os);
        System.out.println("导出" + filename +".txt的文件");
    }

}
