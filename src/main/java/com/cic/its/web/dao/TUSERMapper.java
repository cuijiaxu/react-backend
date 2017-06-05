package com.cic.its.web.dao;

import java.util.List;
import java.util.Map;

import com.cic.its.web.model.TUSER;

public interface TUSERMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TUSER record);

    int insertSelective(TUSER record);

    TUSER selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TUSER record);

    int updateByPrimaryKey(TUSER record);
    
    List<TUSER> queryAll(Map<String, String> map);
}