package com.mikolaj.factory;


public class Application {

    public static void main(String[] args) {

        /**
         * cały czas korzystamy z jednej zaimplementowanej wcześniej
         * abstractCarFactory, w której spieliśmy 3 różne fabryki
         * utworzyliśmy skomplikowaną fabrykę w jednym miejscu,
         * a później z niej korzystamy w wielu miejscach
         */
     AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        Car car = abstractCarFactory.buildAudiCar("a3");
        Car car1 = abstractCarFactory.buildBMWCar("x5");
        Car car2 = abstractCarFactory.buildMercedesCar("s600");


    }
}
