package com.cic.its.web.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cic.its.web.dao.TUSERMapper;
import com.cic.its.web.model.TUSER;

@Service("userService")
public class UserService {

	@Resource 
	private TUSERMapper usermapper; 
	
	public List<TUSER> queryAll(Map<String, String> map){
		
		return usermapper.queryAll(map);
	}
}
