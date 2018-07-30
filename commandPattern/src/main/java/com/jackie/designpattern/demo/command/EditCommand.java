package com.jackie.designpattern.demo.command;

import com.jackie.designpattern.demo.supply.BoardScreen;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/30 - 10:32
 * @history 2018/7/30 - 10:32 ting.he4@pactera.com  create.
 */
public class EditCommand extends AbstractCommand {

    private BoardScreen screen;

    public EditCommand(String name) {
        super(name);
        screen = new BoardScreen();
    }

    @Override
    public void execute() {
        screen.edit(name);
    }
}
