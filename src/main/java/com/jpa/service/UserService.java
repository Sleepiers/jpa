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

    /**
     * 根据name来获取用户
     * @param name
     * @return
     */
    public User getUser(String name){
        User user = userDao.findByName(name);
        return user;
    }

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    public User save(User user){
        userDao.save(user);
        return user;
    }

    /**
     * 删除用户
     * @param user
     * @return
     */
    public User remove(User user){
        userDao.delete(user);
        return user;
    }

    /**
     * 获取分页用户信息
     * @return
     */
    public Object page(){
        Iterable<User> all = userDao.findAll();
        return all;
    }

    /**
     * 分页信息条数
     * @return
     */
    public long count(){
        long count = userDao.count();
        return count;
    }

}
