package com.mikolaj.singleton;

/**
 * Created by Notek on 2017-06-02.
 */
public class Producer {

    public static void addValue (String value){
        Queue.getInstance().push(value);
    }
}
