package com.jackie.desginpattern.demo.factory;

import com.jackie.desginpattern.demo.product.AndroidPlayGame;
import com.jackie.desginpattern.demo.product.AndroidPlayMusic;
import com.jackie.desginpattern.demo.product.PlayGame;
import com.jackie.desginpattern.demo.product.PlayMusic;

/**
 * @author ting.he4@pactera.com
 * @date 2018/4/13 - 18:46
 * @history 2018/4/13 - 18:46 ting.he4@pactera.com  create.
 */
public class AndroidSystemFactory extends AbstractSystemFactory {

    public PlayGame createPlayGame() {
        return new AndroidPlayGame();
    }

    public PlayMusic createPlayMusic() {
        return new AndroidPlayMusic();
    }

}
