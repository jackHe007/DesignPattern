package com.jackie.designpattern.demo.composite;

import com.jackie.designpattern.demo.component.ViewControl;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件，窗体
 *
 * Created by heting on 2018/5/3.
 */
public class Form implements ViewControl {

    private List<ViewControl> viewList = new ArrayList<ViewControl>();

    public void addView(ViewControl viewControl) {
        viewList.add(viewControl);
    }

    public void removeView(ViewControl viewControl) {
        viewList.remove(viewControl);
    }

    public ViewControl getView(int i) {
        return viewList.get(i);
    }

    public void show() {
        System.out.println("show the form content");
        for (ViewControl viewControl : viewList) {
            viewControl.show();
        }
    }

}
