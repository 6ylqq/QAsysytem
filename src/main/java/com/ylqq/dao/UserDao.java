package com.ylqq.dao;

import com.ylqq.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ylqq
 */
@Mapper
public interface UserDao {
    /**
     * 插入用户信息
     * @param user 新增用户
     * @return 返回0和1，代表失败和成功
     * */
    int insert(User user);

    /**
     * 通过ID查找用户
     * @param id 用户id
     * @return 返回一个用户对象
     * */
    User findUserById(int id);

    /**
     * 删除用户
     * @param id 用户id
     * @return 返回0和1，代表失败和成功
     * */
    int delete(int id);

    /**
     * 通过邮箱查找用户，并验证其是否已经注册
     * @param email 用户的邮箱
     * @return 返回查到的用户
     * */
    User findUserByEmail(String email);

    /**
     * 查出所有员工
     * @return 返回全部员工列表
     * */
    List<User> findAll();
}
