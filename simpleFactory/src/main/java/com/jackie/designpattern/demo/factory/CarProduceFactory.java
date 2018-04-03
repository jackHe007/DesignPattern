package com.jackie.designpattern.demo.factory;

import com.jackie.designpattern.demo.exception.UnSupportProduceCarException;
import com.jackie.designpattern.demo.product.AbstractCar;
import com.jackie.designpattern.demo.product.AudioCar;
import com.jackie.designpattern.demo.product.BenzCar;
import com.jackie.designpattern.demo.product.VolkswagenCar;

import static com.jackie.designpattern.demo.constants.CarNum.AUDI_NUM;
import static com.jackie.designpattern.demo.constants.CarNum.BENZ_NUM;
import static com.jackie.designpattern.demo.constants.CarNum.VOLKSWAGEN_NUM;

/**
 * 汽车生产工厂
 *
 * @author ting.he4@pactera.com
 * @date 2018/4/3 - 18:25
 * @history 2018/4/3 - 18:25 ting.he4@pactera.com  create.
 */
public class CarProduceFactory {

    public static AbstractCar getCar(String num) {
        AbstractCar car = null;
        if (num.equalsIgnoreCase(AUDI_NUM)) {
            System.out.println("audi汽车开始生产");
            car = new AudioCar();
        } else if (num.equalsIgnoreCase(VOLKSWAGEN_NUM)) {
            System.out.println("Volkswagen汽车开始生产");
            car = new VolkswagenCar();
        } else if (num.equalsIgnoreCase(BENZ_NUM)) {
            System.out.println("Benz汽车开始生产");
            car = new BenzCar();
        } else {
            try {
                throw new UnSupportProduceCarException("only Support produce audi/volkswagen/benz");
            } catch (UnSupportProduceCarException e) {
                System.out.println(e.getMessage());
            }
        }
        return car;
    }

}
