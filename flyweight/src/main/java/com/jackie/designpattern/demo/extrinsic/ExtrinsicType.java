package com.jackie.designpattern.demo.extrinsic;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/24 - 17:11
 * @history 2018/7/24 - 17:11 ting.he4@pactera.com  create.
 */
public class ExtrinsicType {

    private String loc;

    private String size;

    public ExtrinsicType(String loc, String size) {
        this.loc = loc;
        this.size = size;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
