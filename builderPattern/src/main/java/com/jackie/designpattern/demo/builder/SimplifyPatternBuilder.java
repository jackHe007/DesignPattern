package com.jackie.designpattern.demo.builder;

/**
 * 具体建造者
 *
 * Created by heting on 2018/4/15.
 */
public class SimplifyPatternBuilder extends PlayerPatternBuilder {

    public void buildShowMenu() {
        player.setShowMenu("精简模式。。。显示菜单");
    }

    public void buildPlayList() {
        player.setPlayList("精简模式。。。播放列表");
    }

    public void buildMainMenu() {
        player.setMainMenu("精简模式。。。主菜单");
    }

    public void buildControlBar() {
        player.setControlBar("精简模式。。。控制条");
    }

    @Override
    public boolean isShowMenu() {
        return false;
    }

    @Override
    public boolean isPlayList() {
        return false;
    }
}
