package com.ylqq.dao;

import com.ylqq.pojo.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ylqq
 */
@Mapper
public interface QuestionDao {
    /**
     * 插入问题
     * @param question 需要新增的问题
     * @return 返回0和1，代表失败和成功
     * */
    int insert(Question question);

    /**
     * 删除问题
     * @param id 需要的问题ID
     * @return 返回0和1，代表失败和成功
     * */
    int delete(int id);

    /**
     * 通过问题ID查找问题
     * @param id 问题id
     * @return 返回找到的问题，找不到则为null
     * */
    Question findQuestionById(int id);
}
