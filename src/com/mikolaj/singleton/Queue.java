package com.mikolaj.singleton;


import java.util.ArrayList;
import java.util.List;

public class Queue {


    private static Queue instance = null;  // zmienna prywatna statyczna

    public static Queue getInstance(){  // statyczna metoda
        if(instance==null){
            instance = new Queue();
        }
        return instance;
    }

    private List<String> values;

    private Queue(){
        values = new ArrayList<>();  // prywatny konstruktor
    }

    public void push (String value){
        values.add(value);
    }

    public String pop(){
        String valueToReturn = null;
        if(values.size() > 0){
            valueToReturn = values.remove(0);
        }
        return valueToReturn;
    }


}
