package com.mikolaj.factory;

/**
 * Created by Notek on 2017-06-02.
 */
public class MercedesCarFactory implements CarFactory{


    @Override
    public Car buildCar(String model) {

        Car car = null;
        if(model.equals("s600")){
            Engine mercedesEngine = new Engine(300,3000,"gas");
            Wheels mercedesWheels = new Wheels(18, "winter");
            Mercedes mercedes = new Mercedes ("s600", mercedesEngine,mercedesWheels);
        } else if (model.equals("ml420")){
            Engine mercedesEngine = new Engine(250,3200,"gas");
            Wheels mercedesWheels = new Wheels(18, "summer");
            Mercedes mercedes = new Mercedes ("ml420", mercedesEngine,mercedesWheels);
        } else if (model.equals("s63")){
            Engine mercedesEngine = new Engine(450,6300,"gas");
            Wheels mercedesWheels = new Wheels(19, "summer");
            Mercedes mercedes = new Mercedes ("s63", mercedesEngine,mercedesWheels);
        }
        return car;
    }
}
