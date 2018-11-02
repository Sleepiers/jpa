package com.jpa.controller;

import com.jpa.entity.User;
import com.jpa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @user zzw
 * @date 2018/11/2
 */
@RequestMapping("/user")
@Controller
public class UserController {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/info")
    @ResponseBody
    public User getUser(String name){
        log.info("========================进入了接口========================");
        User user = userService.getUser(name);
        return user;
    }
}
