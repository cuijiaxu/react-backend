package com.cic.its.web.dao;

import com.cic.its.web.model.PERMISSION;

public interface PERMISSIONMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PERMISSION record);

    int insertSelective(PERMISSION record);

    PERMISSION selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PERMISSION record);

    int updateByPrimaryKey(PERMISSION record);
}