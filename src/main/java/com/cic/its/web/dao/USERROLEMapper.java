package com.cic.its.web.dao;

import com.cic.its.web.model.USERROLE;

public interface USERROLEMapper {
    int deleteByPrimaryKey(Long id);

    int insert(USERROLE record);

    int insertSelective(USERROLE record);

    USERROLE selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(USERROLE record);

    int updateByPrimaryKey(USERROLE record);
}