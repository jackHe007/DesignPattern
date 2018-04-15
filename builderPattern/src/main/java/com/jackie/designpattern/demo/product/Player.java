package com.jackie.designpattern.demo.product;

/**
 * 产品角色
 *
 * Created by heting on 2018/4/15.
 */
public class Player {

    private String showMenu;

    private String playList;

    private String mainMenu;

    private String controlBar;

    public String getShowMenu() {
        return showMenu;
    }

    public void setShowMenu(String showMenu) {
        this.showMenu = showMenu;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(String mainMenu) {
        this.mainMenu = mainMenu;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }
}
