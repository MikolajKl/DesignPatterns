package com.mikolaj.singleton;

/**
 * Created by Notek on 2017-06-02.
 */
public class Consumer {

    public static void processValue(){
        Queue queue = Queue.getInstance();
        System.out.println("Next value is: " + queue.pop());
    }
}
