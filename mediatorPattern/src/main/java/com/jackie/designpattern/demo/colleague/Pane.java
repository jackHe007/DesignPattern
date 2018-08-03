package com.jackie.designpattern.demo.colleague;

import com.jackie.designpattern.demo.mediator.Windows;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/3 - 15:36
 * @history 2018/8/3 - 15:36 ting.he4@pactera.com  create.
 */
public abstract class Pane {

    protected Windows windows;

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    public void using() {
        windows.operateItem(this);
    }

    public abstract void function();

}
