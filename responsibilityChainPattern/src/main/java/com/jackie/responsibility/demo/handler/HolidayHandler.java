package com.jackie.responsibility.demo.handler;

import com.jackie.responsibility.demo.target.UserInfo;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/26 - 17:20
 * @history 2018/7/26 - 17:20 ting.he4@pactera.com  create.
 */
public abstract class HolidayHandler {

    protected HolidayHandler handler;
    protected String name;

    public HolidayHandler(String name) {
        this.name = name;
    }

    public void setHandler(HolidayHandler handler) {
        this.handler = handler;
    }

    public abstract void handler(UserInfo info);
}
