package com.mikolaj.factory;

public class AudiCarFactory implements CarFactory {


    @Override
    public Car buildCar(String model) {

        Car car = null;
        if(model.equals("s3")){
            Engine audiEngine = new Engine(200,3000,"diesel");
            Wheels audiWheels = new Wheels(19, "summer");
            Audi audi = new Audi ("s3",audiEngine,audiWheels);
        } else if (model.equals("tt")){
            Engine audiEngine = new Engine(180,1800,"gas");
            Wheels audiWheels = new Wheels(18, "summer");
            Audi audi = new Audi ("tt",audiEngine,audiWheels);
        } else if (model.equals("a3")){
            Engine audiEngine = new Engine(130,1800,"gas");
            Wheels audiWheels = new Wheels(19, "winter");
            Audi audi = new Audi ("a3",audiEngine,audiWheels);
        }

        return car;
    }
}
