package com.jackie.responsibility.demo.target;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/26 - 17:19
 * @history 2018/7/26 - 17:19 ting.he4@pactera.com  create.
 */
public class UserInfo {

    private Integer day;

    private String name;

    public UserInfo(Integer day, String name) {
        this.day = day;
        this.name = name;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
