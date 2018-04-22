package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.abstraction.AbstractFileConvert;
import com.jackie.designpattern.demo.implementor.DataSourceGroup;
import com.jackie.designpattern.demo.utils.XMLUtil;

/**
 * Created by heting on 2018/4/22.
 */
public class BridgeClient {

    public static void main(String[] args) throws Exception {
        AbstractFileConvert convert;
        DataSourceGroup data;
        convert = (AbstractFileConvert) XMLUtil.getBean("bridgePattern/src/main/resources/config/config.xml", "fm");
        data = (DataSourceGroup) XMLUtil.getBean("bridgePattern/src/main/resources/config/config.xml", "ds");
        convert.setData(data);
        convert.doParse("AliPay");
    }

}
