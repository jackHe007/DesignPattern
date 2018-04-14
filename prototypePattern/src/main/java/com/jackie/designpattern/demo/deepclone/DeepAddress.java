package com.jackie.designpattern.demo.deepclone;

import java.io.Serializable;

/**
 * Created by heting on 2018/4/15.
 */
public class DeepAddress implements Serializable {

    private String streetNo;

    public DeepAddress(String streetNo) {
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
