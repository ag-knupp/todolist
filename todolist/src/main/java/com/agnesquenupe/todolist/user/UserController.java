package com.agnesquenupe.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificator
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * String
     * Integer
     * Double (decimal number)
     * Float
     * char
     * Date
     * void
     */
    /**
     * Request body
     */
    @PostMapping("")
    public void create(@RequestBody UserModel userModel) {
        // System.out.println(userModel.name);
    }
    
}
