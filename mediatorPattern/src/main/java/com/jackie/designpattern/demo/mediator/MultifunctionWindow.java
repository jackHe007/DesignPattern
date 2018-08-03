package com.jackie.designpattern.demo.mediator;

import com.jackie.designpattern.demo.colleague.GraphicPane;
import com.jackie.designpattern.demo.colleague.ListPane;
import com.jackie.designpattern.demo.colleague.Pane;
import com.jackie.designpattern.demo.colleague.TextPane;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/3 - 15:49
 * @history 2018/8/3 - 15:49 ting.he4@pactera.com  create.
 */
public class MultifunctionWindow implements Windows {

    private ListPane list;
    private TextPane text;
    private GraphicPane graphic;

    public ListPane getList() {
        return list;
    }

    public void setList(ListPane list) {
        this.list = list;
    }

    public TextPane getText() {
        return text;
    }

    public void setText(TextPane text) {
        this.text = text;
    }

    public GraphicPane getGraphic() {
        return graphic;
    }

    public void setGraphic(GraphicPane graphic) {
        this.graphic = graphic;
    }

    @Override
    public void operateItem(Pane pane) {
        if (pane == list) {
            System.out.println("点击了列表窗口");
            text.write();
        } else if (pane == text) {
            System.out.println("点击了文本窗口");
            list.select();
        } else if (pane == graphic) {
            System.out.println("点击了绘图窗口");
            text.write();
            list.select();
        }
    }

}
