package com.jackie.designpattern.demo.flyweight;

import com.jackie.designpattern.demo.extrinsic.ExtrinsicType;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/24 - 16:34
 * @history 2018/7/24 - 16:34 ting.he4@pactera.com  create.
 */
public abstract class DocumentEditor {

    public abstract String getEditor();

    public void display(ExtrinsicType type){
        System.out.println(getEditor() + "的位置：" + type.getLoc() + " 大小：" + type.getSize());
    }
}
