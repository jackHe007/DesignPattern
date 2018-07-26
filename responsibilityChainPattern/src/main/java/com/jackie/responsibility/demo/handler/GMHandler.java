package com.jackie.responsibility.demo.handler;

import com.jackie.responsibility.demo.target.UserInfo;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/26 - 17:29
 * @history 2018/7/26 - 17:29 ting.he4@pactera.com  create.
 */
public class GMHandler extends HolidayHandler{

    public GMHandler(String name) {
        super(name);
    }

    @Override
    public void handler(UserInfo info) {
        if (info.getDay() < 30) {
            System.out.println(name + "总经理已审批姓名为" + info.getName() + "员工的" + info.getDay() + "天假期申请");
        } else {
            System.out.println(name + "总经理拒绝审批姓名为" + info.getName() + "员工的" + info.getDay() + "天假期申请");
        }
    }

}
