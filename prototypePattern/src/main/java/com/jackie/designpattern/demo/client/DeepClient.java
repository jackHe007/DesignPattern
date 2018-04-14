package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.deepclone.DeepAddress;
import com.jackie.designpattern.demo.deepclone.DeepCustomer;

import java.io.IOException;

/**
 * Created by heting on 2018/4/15.
 */
public class DeepClient {

    public static void main(String[] args) {
        DeepCustomer customer,cloneCustomer;
        DeepAddress address = new DeepAddress("HangZhou.No.111");
        customer = new DeepCustomer(address);
        try {
            cloneCustomer = customer.deepClone();
            System.out.println(customer == cloneCustomer);
            System.out.println(customer.getDeepAddress() == cloneCustomer.getDeepAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
