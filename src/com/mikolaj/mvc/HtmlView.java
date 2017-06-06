package com.mikolaj.mvc;


import com.mikolaj.builder.User;

public class HtmlView implements View<User>{


    @Override
    public String home(User model) {
        return new StringBuilder()
                .append("<h1>" + model.getFirstName() + " " + model.getLastName() + "</h1>\n")
                .append("<h3>Age: " + model.getAge() + "</h3>\n")
                .append("<p>PhoneNumber: " + model.getPhoneNumber() + "</p>\n")
                .toString();
    }
}
