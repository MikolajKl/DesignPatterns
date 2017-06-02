package com.mikolaj.factory;

/**
 * Created by Notek on 2017-06-02.
 */
public class BMWCarFactory implements CarFactory {
    @Override
    public Car buildCar(String model) {

        Car car = null;
        if (model.equals("m6")){
            Engine bmwEngine = new Engine(350,3200,"gas");
            Wheels bmwWheels = new Wheels(19, "winter");
            BMW bmw = new BMW ("m6", bmwEngine,bmwWheels);
        } else if (model.equals("x5")){
            Engine bmwEngine = new Engine(300,3000,"gas");
            Wheels bmwWheels = new Wheels(20, "winter");
            BMW bmw = new BMW ("x5", bmwEngine,bmwWheels);
        } else if (model.equals("i8")){
            Engine bmwEngine = new Engine(380,2800,"hybrid");
            Wheels bmwWheels = new Wheels(19, "summer");
            BMW bmw = new BMW ("i8", bmwEngine,bmwWheels);
        }
        return car;
    }
}
