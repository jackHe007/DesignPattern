package com.jackie.desginpattern.demo.factory;

import com.jackie.desginpattern.demo.product.PlayGame;
import com.jackie.desginpattern.demo.product.PlayMusic;

/**
 * @author ting.he4@pactera.com
 * @date 2018/4/13 - 18:44
 * @history 2018/4/13 - 18:44 ting.he4@pactera.com  create.
 */
public abstract class AbstractSystemFactory {

    public abstract PlayGame createPlayGame();

    public abstract PlayMusic createPlayMusic();

}
