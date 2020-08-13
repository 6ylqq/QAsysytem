package com.ylqq.service;

import com.ylqq.dao.UserDao;
import com.ylqq.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ylqq
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 登陆功能
     * */
    public User login(String email){
        return userDao.findUserByEmail(email);
    }

    /**
     * 注册功能
     * */
    public int addUser(User user){
        if (userDao.findUserById(user.getID())==null){
            System.out.println("该邮箱已被注册！");
            return 0;
        }else {
            userDao.insert(user);
            return 1;
        }
    }

    /**
     * 删除、开除功能
     * */
    public int deleteUser(int id){
        if (userDao.findUserById(id)==null){
            System.out.println("无此用户，删除失败！");
            return 0;
        }else {
            userDao.delete(id);
            return 1;
        }
    }

    /**
     * 查找全部用户
     * */
    public List<User> findAllUsers(){
     return userDao.findAll();
    }
}
