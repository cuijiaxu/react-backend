package com.cic.its.web.dao;

import com.cic.its.web.model.ROLEPERSSION;

public interface ROLEPERSSIONMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ROLEPERSSION record);

    int insertSelective(ROLEPERSSION record);

    ROLEPERSSION selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ROLEPERSSION record);

    int updateByPrimaryKey(ROLEPERSSION record);
}