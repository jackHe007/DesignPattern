package com.jackie.designpattern.demo.proxy;

import java.util.Date;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/25 - 17:45
 * @history 2018/7/25 - 17:45 ting.he4@pactera.com  create.
 */
public class ProxyUserInfo implements RecordUserInfo {

    private RealRcordUserInfo userInfo;

    @Override
    public void recordUserInfo(String username, String tel) {
        this.logger();
        userInfo = new RealRcordUserInfo();
        userInfo.recordUserInfo(username,tel);
    }

    private void logger() {
        System.out.println("当前操作者是：" + "het" + ",操作时间是：" + (new Date()));
    }

}
