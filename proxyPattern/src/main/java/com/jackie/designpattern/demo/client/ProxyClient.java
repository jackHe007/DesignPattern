package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.proxy.ProxyUserInfo;
import com.jackie.designpattern.demo.proxy.RecordUserInfo;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/25 - 17:48
 * @history 2018/7/25 - 17:48 ting.he4@pactera.com  create.
 */
public class ProxyClient {

    public static void main(String[] args) {
        RecordUserInfo userInfo;
        userInfo = new ProxyUserInfo();
        userInfo.recordUserInfo("luck", "18888888888");
    }

}
