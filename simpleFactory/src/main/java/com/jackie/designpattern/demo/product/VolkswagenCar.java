package com.jackie.designpattern.demo.product;

/**
 * 大众汽车类
 *
 * @author ting.he4@pactera.com
 * @date 2018/4/3 - 18:16
 * @history 2018/4/3 - 18:16 ting.he4@pactera.com  create.
 */
public class VolkswagenCar extends AbstractCar {

    public VolkswagenCar() {
        System.out.println("Volkswagen汽车制造出来了");
    }

    /**
     * 大众汽车驾驶功能
     *
     * @author ting.he4@pactera.com
     * @date 2018/4/3 18:14
     * @history
     * 		 2018/4/3 - 18:14 ting.he4@pactera.com create.
     */
    public void drive() {
        System.out.println("Volkswagen汽车驾驶中");
    }

    /**
     * 大众汽车播放音乐功能
     *
     * @author ting.he4@pactera.com
     * @date 2018/4/3 18:14
     * @history
     * 		 2018/4/3 - 18:14 ting.he4@pactera.com create.
     */
    public void playMusic() {
        System.out.println("Volkswagen汽车播放音乐中");
    }
}
