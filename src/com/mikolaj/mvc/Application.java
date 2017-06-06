package com.mikolaj.mvc;

import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.handle("home json");
        frontController.handle("about json");
        frontController.handle("about html");

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while(counter < 5){
            counter++;
            String s = scanner.nextLine();
            frontController.handle(s);
        }

    }
}
