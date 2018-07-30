package com.jackie.designpattern.demo.invoke;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/30 - 10:40
 * @history 2018/7/30 - 10:40 ting.he4@pactera.com  create.
 */
public class Menu {

    private List<MenuItem> itemList = new ArrayList<MenuItem>();

    public void addMenuItem(MenuItem item) {
        itemList.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        itemList.remove(item);
    }

    public void excute() {
        for (MenuItem item : itemList) {
            item.click();
        }
    }

}
