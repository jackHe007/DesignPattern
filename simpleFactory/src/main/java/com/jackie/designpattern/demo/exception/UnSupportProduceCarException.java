package com.jackie.designpattern.demo.exception;

/**
 * 生产汽车异常
 *
 * @author ting.he4@pactera.com
 * @date 2018/4/3 - 18:31
 * @history 2018/4/3 - 18:31 ting.he4@pactera.com  create.
 */
public class UnSupportProduceCarException extends Exception {

    public UnSupportProduceCarException() {
    }

    public UnSupportProduceCarException(String message) {
        super(message);
    }

}
