package com.ylqq.dao;

import com.ylqq.pojo.Compliment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ylqq
 */
@Mapper
public interface CommentDao {
    /**
     * 插入评论
     * @param compliment 需要新增的评论
     * @return 返回0和1，代表失败和成功
     * */
    int insert(Compliment compliment);

    /**
     * 删除评论
     * @param id 需要的评论ID
     * @return 返回0和1，代表失败和成功
     * */
    int delete(int id);

    /**
     * 通过评论ID查找评论
     * @param id 评论id
     * @return 返回找到的评论，找不到则为null
     * */
    Compliment findComplimentById(int id);
}
