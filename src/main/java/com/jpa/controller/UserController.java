package com.jpa.controller;

import com.jpa.entity.User;
import com.jpa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

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

    /**
     * 测试jpa查询操作
     * @param name
     * @return
     */
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(String name){
        log.info("========================进入了接口========================");
        User user = userService.getUser(name);
        return user;
    }

    /**
     * 测试jpa添加操作
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object addUser(String name, Integer age, String sex){
        User user = new User();
        user.name = name;
        user.age = age;
        user.sex = sex;
        user.updateTime = new Date();

        userService.save(user);
        return user;
    }

    /**
     * 根据用户名来删除用户
     * @param name
     * @return
     */
    @RequestMapping(value = "/remove", method = RequestMethod.DELETE)
    @ResponseBody
    public String removeUser(String name){
        User user = userService.getUser(name);
        if(user == null){
            return "无此用户！";
        }
        userService.remove(user);
        return "删除用户成功！";
    }

    /**
     * 更新用户信息
     * @param name
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public User updateUser(String name){
        User user = userService.getUser(name);

        user.age = 80;
        user.updateTime = new Date();
        userService.save(user);
        return user;
    }

    /**
     * 获取用户分页信息
     * @return
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Object pageUser(){
        Object page = userService.page();
        return page;
    }

    /**
     * 分页数据的条数
     * @return
     */
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ResponseBody
    public long countUser(){
        long count = userService.count();
        return count;
    }

}
