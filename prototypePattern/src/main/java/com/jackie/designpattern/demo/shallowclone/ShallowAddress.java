package com.jackie.designpattern.demo.shallowclone;

/**
 * Created by heting on 2018/4/15.
 */
public class ShallowAddress {

    private String streetNo;

    public ShallowAddress(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public void printAdds() {
        System.out.println("streetNo was printed");
    }
}
