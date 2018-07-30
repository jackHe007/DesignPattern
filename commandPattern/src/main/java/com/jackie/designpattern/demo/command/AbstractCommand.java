package com.jackie.designpattern.demo.command;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/30 - 10:20
 * @history 2018/7/30 - 10:20 ting.he4@pactera.com  create.
 */
public abstract class AbstractCommand {

    protected String name;

    public AbstractCommand(String name) {
        this.name = name;
    }

    public abstract void execute();

}
