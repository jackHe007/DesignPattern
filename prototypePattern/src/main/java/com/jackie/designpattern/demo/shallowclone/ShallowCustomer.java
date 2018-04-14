package com.jackie.designpattern.demo.shallowclone;

/**
 * 浅克隆，浅拷贝
 *
 * Created by heting on 2018/4/15.
 */
public class ShallowCustomer implements Cloneable{

    private String name;

    private ShallowAddress address;

    public ShallowCustomer(ShallowAddress address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShallowAddress getAddress() {
        return address;
    }

    public void setAddress(ShallowAddress address) {
        this.address = address;
    }

    public ShallowCustomer shallowClone() {
         Object obj;
        try {
            obj = super.clone();
            return (ShallowCustomer) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            return null;
        }
    }

}
