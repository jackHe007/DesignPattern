package com.jackie.desginpattern.demo.client;

import com.jackie.desginpattern.demo.factory.CarFactory;
import com.jackie.desginpattern.demo.product.Car;
import com.jackie.desginpattern.demo.utils.XMLUtil;

/**
 * @author ting.he4@pactera.com
 * @date 2018/4/12 - 18:10
 * @history 2018/4/12 - 18:10 ting.he4@pactera.com  create.
 */
public class CarBuiltClient {

    public static void main(String[] args) {
        CarFactory carFactory;
        Car car;
        try {
            carFactory = (CarFactory) XMLUtil.getBean("factorypattern/src/main/resources/config/config.xml");
            car = carFactory.createCar();
            car.driving();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
