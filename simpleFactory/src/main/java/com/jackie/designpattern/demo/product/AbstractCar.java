package com.jackie.designpattern.demo.product;

/**
 * 汽车抽象类
 *
 * @author ting.he4@pactera.com
 * @date 2018/4/3 - 18:11
 * @history 2018/4/3 - 18:11 ting.he4@pactera.com  create.
 */
public abstract class AbstractCar {

    /**
     * 公共抽象方法--驾驶
     *
     * @author ting.he4@pactera.com
     * @date 2018/4/3 18:13
     * @history
     * 		 2018/4/3 - 18:13 ting.he4@pactera.com create.
     */
    public abstract void drive();

    /**
     * 公共抽象方法--播放音乐
     *
     * @author ting.he4@pactera.com
     * @date 2018/4/3 18:13
     * @history
     * 		 2018/4/3 - 18:13 ting.he4@pactera.com create.
     */
    public abstract void playMusic();
}
