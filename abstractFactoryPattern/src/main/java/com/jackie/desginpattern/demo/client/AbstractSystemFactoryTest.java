package com.jackie.desginpattern.demo.client;

import com.jackie.desginpattern.demo.factory.AbstractSystemFactory;
import com.jackie.desginpattern.demo.product.PlayGame;
import com.jackie.desginpattern.demo.product.PlayMusic;
import com.jackie.desginpattern.demo.util.XMLUtil;

/**
 * @author ting.he4@pactera.com
 * @date 2018/4/13 - 18:49
 * @history 2018/4/13 - 18:49 ting.he4@pactera.com  create.
 */
public class AbstractSystemFactoryTest {

    public static void main(String[] args) throws Exception {
        AbstractSystemFactory systemFactory;
        PlayMusic playMusic;
        PlayGame playGame;
        systemFactory = (AbstractSystemFactory) XMLUtil.getBean("abstractFactoryPattern/src/main/resources/config/config.xml");
        playGame = systemFactory.createPlayGame();
        playMusic = systemFactory.createPlayMusic();
        playGame.playGame();
        playMusic.playMusic();
    }

}
