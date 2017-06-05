package com.cic.its.web.controller;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cic.its.web.model.TUSER;
import com.cic.its.web.service.UserService;
import com.cic.its.web.util.JsonUtil;


/**
 * 公共视图控制器
 * 
 **/

@RestController
@RequestMapping("/")
public class CommonController{
    
	@Resource
	private UserService userservice;
	
	private JsonUtil jsonutil = new JsonUtil();
	/**
     * 首页
     * 
     * @param request
     * @return
     */

    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request) {
    	ModelAndView index = new ModelAndView();
    	
		return index;
    }
    
    @RequestMapping(value="/getalluser",method=RequestMethod.GET, produces="text/json;charset=UTF-8")
    public String getalluser(HttpServletRequest request) {
    	String index = "";
    	List<TUSER> data = new ArrayList<>();
    	Map<String, String> map = new HashMap<String, String>();
    	try{
    		data = userservice.queryAll(map); 
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
		return jsonutil.toJson(data);
    }
}

