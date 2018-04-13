package com.jackie.desginpattern.demo.factory;

import com.jackie.desginpattern.demo.product.PlayGame;
import com.jackie.desginpattern.demo.product.PlayMusic;
import com.jackie.desginpattern.demo.product.WindowsMobilePlayGame;
import com.jackie.desginpattern.demo.product.WindowsMobilePlayMusic;

/**
 * @author ting.he4@pactera.com
 * @date 2018/4/13 - 18:46
 * @history 2018/4/13 - 18:46 ting.he4@pactera.com  create.
 */
public class WindowsMobileSystemFactory extends AbstractSystemFactory {

    public PlayGame createPlayGame() {
        return new WindowsMobilePlayGame();
    }

    public PlayMusic createPlayMusic() {
        return new WindowsMobilePlayMusic();
    }

}
