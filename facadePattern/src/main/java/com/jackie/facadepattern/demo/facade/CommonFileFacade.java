package com.jackie.facadepattern.demo.facade;

/**
 * 抽象外观类，提供统一的外观类，实现面向接口编程
 *
 * Created by heting on 2018/5/6.
 */
public interface CommonFileFacade {

    void saveFile(String resourceFilename, String targetFilename);

}
