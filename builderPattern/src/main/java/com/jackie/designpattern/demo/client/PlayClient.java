package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.builder.PlayerPatternBuilder;
import com.jackie.designpattern.demo.director.PlayDirector;
import com.jackie.designpattern.demo.product.Player;
import com.jackie.designpattern.demo.utils.XMLUtil;

/**
 * Created by heting on 2018/4/15.
 */
public class PlayClient {

    public static void main(String[] args) throws Exception {
        PlayerPatternBuilder builder;
        PlayDirector director = new PlayDirector();
        builder = (PlayerPatternBuilder) XMLUtil.getBean("builderPattern/src/main/resources/config/config.xml");
        Player player = director.construct(builder);
        System.out.println(player.getControlBar());
        System.out.println(player.getMainMenu());
        System.out.println(player.getPlayList());
    }

}
