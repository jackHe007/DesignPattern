package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.factory.CarProduceFactory;
import com.jackie.designpattern.demo.product.AbstractCar;

import static com.jackie.designpattern.demo.constants.CarNum.BENZ_NUM;

/**
 * 汽车生产测试类
 *
 * @author ting.he4@pactera.com
 * @date 2018/4/3 - 18:36
 * @history 2018/4/3 - 18:36 ting.he4@pactera.com  create.
 */
public class CarProduceTest {

    public static void main(String[] args) {
        AbstractCar car = CarProduceFactory.getCar(BENZ_NUM);
        if (car != null) {
            car.drive();
            car.playMusic();
        }
    }

}
