package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.colleague.GraphicPane;
import com.jackie.designpattern.demo.colleague.ListPane;
import com.jackie.designpattern.demo.colleague.TextPane;
import com.jackie.designpattern.demo.mediator.MultifunctionWindow;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/3 - 16:05
 * @history 2018/8/3 - 16:05 ting.he4@pactera.com  create.
 */
public class TextClient {

    public static void main(String[] args) {
        MultifunctionWindow windows = new MultifunctionWindow();
        ListPane list = new ListPane();
        TextPane text = new TextPane();
        GraphicPane graphic = new GraphicPane();

        list.setWindows(windows);
        text.setWindows(windows);
        graphic.setWindows(windows);

        windows.setGraphic(graphic);
        windows.setList(list);
        windows.setText(text);

        list.using();
        graphic.using();
    }

}
