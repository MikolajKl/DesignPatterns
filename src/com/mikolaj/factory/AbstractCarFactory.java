package com.mikolaj.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Notek on 2017-06-02.
 */
public class AbstractCarFactory {

    private Map<CarFactoriesEnums, CarFactory> factories;

    public AbstractCarFactory(){
        this.factories = new HashMap<>();
        initFactories();  // wywołanie metody w konstruktorze
    }

    public Car buildAudiCar(String model){
        return buildCar(CarFactoriesEnums.AUDI, model);
    }

    public Car buildBMWCar(String model){
return buildCar(CarFactoriesEnums.BMW, model);
    }

    public Car buildMercedesCar(String model){
return buildCar(CarFactoriesEnums.MERCEDES, model);
    }

    private void initFactories(){ // dodajemy fabryki
        factories.put(CarFactoriesEnums.AUDI, new AudiCarFactory());
        factories.put(CarFactoriesEnums.BMW, new BMWCarFactory());
        factories.put(CarFactoriesEnums.MERCEDES, new MercedesCarFactory());

    }

    public Car buildCar(CarFactoriesEnums type, String model){

        return factories.get(type).buildCar(model);
    }
}
