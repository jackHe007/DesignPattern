package com.jackie.designpattern.demo.invoke;

import com.jackie.designpattern.demo.command.AbstractCommand;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/30 - 10:41
 * @history 2018/7/30 - 10:41 ting.he4@pactera.com  create.
 */
public class MenuItem {

    private String name;
    private AbstractCommand command;

    public MenuItem(String name) {
        this.name = name;
    }

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void click() {
        System.out.println("执行了功能：" + name);
        command.execute();
    }

}
