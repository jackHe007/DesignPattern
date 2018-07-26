package com.jackie.responsibility.demo.handler;

import com.jackie.responsibility.demo.target.UserInfo;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/26 - 17:27
 * @history 2018/7/26 - 17:27 ting.he4@pactera.com  create.
 */
public class ManagerHandler extends HolidayHandler {

    public ManagerHandler(String name) {
        super(name);
    }

    @Override
    public void handler(UserInfo info) {
        if (info.getDay() < 10) {
            System.out.println(name + "经理已审批姓名为" + info.getName() + "员工的" + info.getDay() + "天假期申请");
        } else {
            this.handler.handler(info);
        }
    }

}
