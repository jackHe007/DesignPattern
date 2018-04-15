package com.jackie.designpattern.demo.builder;

import com.jackie.designpattern.demo.product.Player;

/**
 * 抽象建造者
 *
 * Created by heting on 2018/4/15.
 */
public abstract class PlayerPatternBuilder {

    public Player player = new Player();

    public abstract void buildShowMenu();

    public abstract void buildPlayList();

    public abstract void buildMainMenu();

    public abstract void buildControlBar();

    public boolean isShowMenu() {
        return true;
    }

    public boolean isPlayList() {
        return true;
    }

    public Player construct(PlayerPatternBuilder builder) {
        return player;
    }
}
