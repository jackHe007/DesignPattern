package com.jackie.designpattern.demo.mediator;

import com.jackie.designpattern.demo.colleague.Pane;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/3 - 15:34
 * @history 2018/8/3 - 15:34 ting.he4@pactera.com  create.
 */
public interface Windows {

    void operateItem(Pane pane);
}
