package com.jackie.desginpattern.demo.factory;

import com.jackie.desginpattern.demo.product.BenzCar;
import com.jackie.desginpattern.demo.product.Car;

/**
 * @author ting.he4@pactera.com
 * @date 2018/4/12 - 17:48
 * @history 2018/4/12 - 17:48 ting.he4@pactera.com  create.
 */
public class BenzCarFactory implements CarFactory {

    public Car createCar() {
        //初始化省略。。。
        return new BenzCar();
    }

}
