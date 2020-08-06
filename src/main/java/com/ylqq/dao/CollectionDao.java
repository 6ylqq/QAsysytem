package com.ylqq.dao;

import com.ylqq.pojo.Compliment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ylqq
 */
@Mapper
public interface CollectionDao {
    /**
     * 插入收藏
     * @param compliment 需要新增的收藏
     * @return 返回0和1，代表失败和成功
     * */
    int insert(Compliment compliment);

    /**
     * 删除收藏
     * @param id 需要的收藏ID
     * @return 返回0和1，代表失败和成功
     * */
    int delete(int id);
}
