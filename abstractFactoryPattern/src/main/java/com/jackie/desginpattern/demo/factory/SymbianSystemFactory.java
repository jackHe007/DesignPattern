package com.jackie.desginpattern.demo.factory;

import com.jackie.desginpattern.demo.product.PlayGame;
import com.jackie.desginpattern.demo.product.PlayMusic;
import com.jackie.desginpattern.demo.product.SymbianPlayGame;
import com.jackie.desginpattern.demo.product.SymbianPlayMusic;

/**
 * @author ting.he4@pactera.com
 * @date 2018/4/13 - 18:46
 * @history 2018/4/13 - 18:46 ting.he4@pactera.com  create.
 */
public class SymbianSystemFactory extends AbstractSystemFactory {

    public PlayGame createPlayGame() {
        return new SymbianPlayGame();
    }

    public PlayMusic createPlayMusic() {
        return new SymbianPlayMusic();
    }

}
