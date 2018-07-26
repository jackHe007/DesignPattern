package com.jackie.responsibility.demo.client;

import com.jackie.responsibility.demo.handler.DirectorHandler;
import com.jackie.responsibility.demo.handler.GMHandler;
import com.jackie.responsibility.demo.handler.HolidayHandler;
import com.jackie.responsibility.demo.handler.ManagerHandler;
import com.jackie.responsibility.demo.target.UserInfo;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/26 - 17:40
 * @history 2018/7/26 - 17:40 ting.he4@pactera.com  create.
 */
public class HolidayApplyClient {

    public static void main(String[] args) {
        HolidayHandler jackie,billy,brown;
        UserInfo employee1 = new UserInfo(9, "张三");
        UserInfo employee2 = new UserInfo(2, "李四");
        UserInfo employee3 = new UserInfo(20, "王五");
        jackie = new DirectorHandler("杰克");
        billy = new ManagerHandler("比利");
        brown = new GMHandler("布朗");
        jackie.setHandler(billy);
        billy.setHandler(brown);
        jackie.handler(employee1);
        jackie.handler(employee2);
        jackie.handler(employee3);
    }

}
