package com.jackie.desginpattern.demo.factory;

import com.jackie.desginpattern.demo.product.AudiCar;
import com.jackie.desginpattern.demo.product.Car;

/**
 * @author ting.he4@pactera.com
 * @date 2018/4/12 - 17:47
 * @history 2018/4/12 - 17:47 ting.he4@pactera.com  create.
 */
public class AudiCarFactory implements CarFactory {

    public Car createCar() {
        //初始化省略。。。
        return new AudiCar();
    }

}
