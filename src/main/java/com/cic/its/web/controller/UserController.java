package com.cic.its.web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cic.its.web.datamodel.PostUser;
import com.cic.its.web.datamodel.ResponseModel;
import com.cic.its.web.model.TUSER;
import com.cic.its.web.service.UserService;
import com.cic.its.web.util.JsonUtil;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Resource
	private UserService userservice;
	
	private JsonUtil jsonutil = new JsonUtil();
	
	@RequestMapping(value="/login",method=RequestMethod.POST, produces="text/json;charset=UTF-8")
    public String getalluser(HttpServletRequest request,HttpServletResponse resp) throws IOException {
		
		String resbody = charReader(request);
		PostUser postuser = jsonutil.fromJson(resbody, PostUser.class);
		String username = postuser.getUsername()==null?"":postuser.getUsername();
		String password = postuser.getPassword()==null?"":postuser.getPassword();
    	List<TUSER> userlist = new ArrayList<>();
    	Map<String, String> map = new HashMap<String, String>();
    	map.put("username", password);
    	try{
    		userlist = userservice.getbyname(map); 
    		if(userlist.get(0).getPassword().equals(password)){
    			ResponseModel rep = new ResponseModel();
    			rep.setSuccess(true);
    			rep.setMessage("OK");
    			return jsonutil.toJson(rep);
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
		return jsonutil.toJson("false");
    }
	
	//字符串读取	 
	String charReader(HttpServletRequest request) throws IOException {
		BufferedReader br = request.getReader();
		String str, wholeStr = "";
		while((str = br.readLine()) != null){
		wholeStr += str;
		}
		System.out.println(wholeStr);
		return wholeStr;
	}
}
