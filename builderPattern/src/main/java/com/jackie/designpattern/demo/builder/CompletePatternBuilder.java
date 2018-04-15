package com.jackie.designpattern.demo.builder;

/**
 * 具体建造者
 *
 * Created by heting on 2018/4/15.
 */
public class CompletePatternBuilder extends PlayerPatternBuilder {

    public void buildShowMenu() {
        player.setShowMenu("完整模式。。。显示菜单");
    }

    public void buildPlayList() {
        player.setPlayList("完整模式。。。播放列表");
    }

    public void buildMainMenu() {
        player.setMainMenu("完整模式。。。主菜单");
    }

    public void buildControlBar() {
        player.setControlBar("完整模式。。。控制条");
    }
}
