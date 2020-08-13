package com.ylqq.controller;

import com.ylqq.pojo.User;
import com.ylqq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ylqq
 */
@RestController
@RequestMapping(value = "/qasystemvue", method = RequestMethod.POST)
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public User login(String email){
        return userService.login(email);
    }

    @RequestMapping(value = "/register")
    @ResponseBody
    public int newUser(User user){
        return userService.addUser(user);
    }
}
