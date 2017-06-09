package com.cic.its.web.dao;

import com.cic.its.web.model.ROLE;

public interface ROLEMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ROLE record);

    int insertSelective(ROLE record);

    ROLE selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ROLE record);

    int updateByPrimaryKey(ROLE record);
}