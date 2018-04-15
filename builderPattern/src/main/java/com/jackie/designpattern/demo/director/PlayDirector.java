package com.jackie.designpattern.demo.director;

import com.jackie.designpattern.demo.builder.PlayerPatternBuilder;
import com.jackie.designpattern.demo.product.Player;

/**
 * 指挥者
 *
 * Created by heting on 2018/4/15.
 */
public class PlayDirector {

    public Player construct(PlayerPatternBuilder builder) {
        Player player;
        if (builder.isPlayList()) {
            builder.buildPlayList();
        }
        if (builder.isShowMenu()) {
            builder.buildShowMenu();
        }
        builder.buildMainMenu();
        builder.buildControlBar();
        player = builder.construct(builder);
        return player;
    }

}
