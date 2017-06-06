package com.mikolaj.mvc;


import com.mikolaj.builder.User;

public class JsonView implements View<User> {

    @Override
    public String home(User model) {

        return new StringBuilder()
                .append("{\n")
                .append("\tfirstName: \"" + model.getFirstName() + "\",\n")
                .append("\tlastName(): \"" + model.getLastName() + "\",\n")
                .append("\tphoneNumber: \"" + model.getPhoneNumber() + "\"\n")
                .append("\tage: " + model.getAge() + "\n")
                .append("}")
                .toString();

    }
}
