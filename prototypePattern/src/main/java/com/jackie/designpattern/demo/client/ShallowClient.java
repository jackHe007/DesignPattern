package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.shallowclone.ShallowAddress;
import com.jackie.designpattern.demo.shallowclone.ShallowCustomer;

/**
 * Created by heting on 2018/4/15.
 */
public class ShallowClient {

    public static void main(String[] args) {
        ShallowCustomer customer,cloneCustomer;
        ShallowAddress address = new ShallowAddress("HangZhou.No.110");
        customer = new ShallowCustomer(address);
        cloneCustomer = customer.shallowClone();
        System.out.println(customer == cloneCustomer);
        System.out.println(customer.getAddress().getStreetNo() == cloneCustomer.getAddress().getStreetNo());
    }

}
