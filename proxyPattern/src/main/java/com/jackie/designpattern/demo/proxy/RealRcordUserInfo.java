package com.jackie.designpattern.demo.proxy;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/25 - 17:43
 * @history 2018/7/25 - 17:43 ting.he4@pactera.com  create.
 */
public class RealRcordUserInfo implements RecordUserInfo {

    @Override
    public void recordUserInfo(String username, String tel) {
        System.out.println("用户的信息如下：用户姓名：" + username + " 用户电话：" + tel);
    }

}
