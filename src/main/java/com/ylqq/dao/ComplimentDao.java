package com.ylqq.dao;

import com.ylqq.pojo.Compliment;
import com.ylqq.pojo.Compliment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ylqq
 */
@Mapper
public interface ComplimentDao {
    /**
     * 插入点赞
     * @param compliment 需要新增的点赞
     * @return 返回0和1，代表失败和成功
     * */
    int insert(Compliment compliment);

    /**
     * 删除点赞
     * @param id 需要的点赞ID
     * @return 返回0和1，代表失败和成功
     * */
    int delete(int id);
    
}
