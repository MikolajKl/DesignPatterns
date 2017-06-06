package com.mikolaj.mvc;


import com.mikolaj.builder.User;

public class HomeController implements Controller {

    @Override
    public Object handle() {
         return new User("Mikolaj", "Kowal", "987654321", 27);
    }
}
