package com.ylqq.dao;

import com.ylqq.pojo.Answer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ylqq
 */
@Mapper
public interface AnswerDao {
    /**
     * 插入回答
     * @param Answer 需要新增的回答
     * @return 返回0和1，代表失败和成功
     * */
    int insert(Answer Answer);

    /**
     * 删除回答
     * @param id 需要的回答ID
     * @return 返回0和1，代表失败和成功
     * */
    int delete(int id);

    /**
     * 通过回答ID查找回答
     * @param id 回答id
     * @return 返回找到的回答，找不到则为null
     * */
    Answer findAnswerById(int id);
}
