package com.jpa.service;

import com.jpa.dao.UserDao;
import com.jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @user zzw
 * @date 2018/11/2
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(String name){
        User user = userDao.findByName(name);
        return user;
    }
}
