package com.activiti.controller;

import com.activiti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test/test")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/Test")
    @ResponseBody
    public String test(){
        return userService.getName();
    }
}
