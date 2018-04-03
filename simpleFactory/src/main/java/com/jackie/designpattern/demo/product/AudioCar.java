package com.jackie.designpattern.demo.product;

/**
 * 奥迪汽车类
 *
 * @author ting.he4@pactera.com
 * @date 2018/4/3 - 18:12
 * @history 2018/4/3 - 18:12 ting.he4@pactera.com  create.
 */
public class AudioCar extends AbstractCar {

    public AudioCar() {
        System.out.println("audi汽车制造出来了");
    }

    /**
     * 奥迪汽车驾驶功能
     *
     * @author ting.he4@pactera.com
     * @date 2018/4/3 18:14
     * @history
     * 		 2018/4/3 - 18:14 ting.he4@pactera.com create.
     */
    public void drive() {
        System.out.println("audi汽车驾驶中");
    }

    /**
     * 奥迪汽车播放音乐功能
     *
     * @author ting.he4@pactera.com
     * @date 2018/4/3 18:14
     * @history
     * 		 2018/4/3 - 18:14 ting.he4@pactera.com create.
     */
    public void playMusic() {
        System.out.println("audi汽车播放音乐中");
    }
}
