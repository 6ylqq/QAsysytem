package com.ylqq.dao;

import com.ylqq.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
     * @return 返回0和1，代表失败和成功*/
    int delete(int id);

}
