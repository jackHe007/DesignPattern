package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.command.AbstractCommand;
import com.jackie.designpattern.demo.command.CreateCommand;
import com.jackie.designpattern.demo.command.EditCommand;
import com.jackie.designpattern.demo.command.OpenCommand;
import com.jackie.designpattern.demo.invoke.Menu;
import com.jackie.designpattern.demo.invoke.MenuItem;

/**
 * @author ting.he4@pactera.com
 * @date 2018/7/30 - 10:47
 * @history 2018/7/30 - 10:47 ting.he4@pactera.com  create.
 */
public class CommandClient {

    public static void main(String[] args) {
        MenuItem creaMenu,editMenu,openMenu;
        AbstractCommand create,edit,open;
        create = new CreateCommand("excel文件");
        edit = new EditCommand("excel文件");
        open = new OpenCommand("excel文件");

        creaMenu = new MenuItem("创建按钮");
        editMenu = new MenuItem("编辑按钮");
        openMenu = new MenuItem("打开按钮");

        creaMenu.setCommand(create);
        editMenu.setCommand(edit);
        openMenu.setCommand(open);

        Menu menu = new Menu();
        menu.addMenuItem(creaMenu);
        menu.addMenuItem(editMenu);
        menu.addMenuItem(openMenu);

        menu.excute();
    }

}
