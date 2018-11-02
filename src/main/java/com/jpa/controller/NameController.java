package com.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @user zzw
 * @date 2018/11/2
 */
@RequestMapping("/test")
@Controller
public class NameController {

    @RequestMapping("/name")
    @ResponseBody
    public Object namePrint(){
        Map<String,Object> res = new HashMap();
        res.put("name","zzw");
        res.put("age","12");
        res.put("addr","江西赣州");
        res.put("sex","男");
        Map<String,Object> friends = new HashMap();
        friends.put("1","yang");
        friends.put("2","yu");
        friends.put("3","xiong");
        res.put("friends",friends);
        return res;
    }
}
