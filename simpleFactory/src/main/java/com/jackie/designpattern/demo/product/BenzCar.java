package com.jackie.designpattern.demo.product;

/**
 * 奔驰汽车类
 *
 * @author ting.he4@pactera.com
 * @date 2018/4/3 - 18:21
 * @history 2018/4/3 - 18:21 ting.he4@pactera.com  create.
 */
public class BenzCar extends AbstractCar {

    public BenzCar() {
        System.out.println("Benz汽车制造出来了");
    }

    /**
     * 奔驰汽车驾驶功能
     *
     * @author ting.he4@pactera.com
     * @date 2018/4/3 18:14
     * @history
     * 		 2018/4/3 - 18:14 ting.he4@pactera.com create.
     */
    public void drive() {
        System.out.println("Benz汽车驾驶中");
    }

    /**
     * 奔驰汽车播放音乐功能
     *
     * @author ting.he4@pactera.com
     * @date 2018/4/3 18:14
     * @history
     * 		 2018/4/3 - 18:14 ting.he4@pactera.com create.
     */
    public void playMusic() {
        System.out.println("Benz汽车播放音乐中");
    }

    /**
     * 奔驰汽车汽车打开天窗功能-特有
     *
     * @author ting.he4@pactera.com
     * @date 2018/4/3 18:14
     * @history
     * 		 2018/4/3 - 18:14 ting.he4@pactera.com create.
     */
    public void openWindow() {
        System.out.println("Benz汽车打开天窗中");
    }
}
