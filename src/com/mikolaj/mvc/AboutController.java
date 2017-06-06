package com.mikolaj.mvc;

import com.mikolaj.builder.User;

/**
 * Created by Notek on 2017-06-06.
 */
public class AboutController implements Controller {

    @Override
    public Object handle() {
        return new User("John", "Smith", "678954321", 25);
    }
}
