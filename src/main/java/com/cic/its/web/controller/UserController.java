package com.cic.its.web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cic.its.web.datamodel.LoginUser;
import com.cic.its.web.datamodel.PostUser;
import com.cic.its.web.datamodel.ResponseLoginUser;
import com.cic.its.web.datamodel.ResponseModel;
import com.cic.its.web.model.TUSER;
import com.cic.its.web.service.UserService;
import com.cic.its.web.util.CookieUtil;
import com.cic.its.web.util.JsonUtil;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Resource
	private UserService userservice;
	
	private JsonUtil jsonutil = new JsonUtil();
	
	private CookieUtil cookieutil = new CookieUtil();
	
	@RequestMapping(value="",method=RequestMethod.GET, produces="text/json;charset=UTF-8")
    public String checkuser(HttpServletRequest request,HttpServletResponse resp) throws IOException {
		
		ResponseModel rep = new ResponseModel();
		
    	try{
    		/*String resbody = charReader(request);
    		Cookie[] cookies = request.getCookies();
        	List<TUSER> userlist = new ArrayList<>();
        	Map<String, String> map = new HashMap<String, String>();*/
        	//map.put("username", password);
    		//userlist = userservice.getbyname(map); 
    		Cookie tokencookie = cookieutil.getCookieByName(request, "token");
    		if(tokencookie != null){
    			tokencookie.setMaxAge(3600);
    			LoginUser user = new LoginUser();
        		user.setId(2);
        		user.setUsername("admin");
        		List<String> permissions = new ArrayList<String>();
        		permissions.add("chart");
        		permissions.add("dashboard");
        		user.setPermissions(permissions);
        		ResponseLoginUser resuser = new ResponseLoginUser();
        		resuser.setSuccess(true);
        		resuser.setUser(user);
        		
        		HttpSession session = request.getSession();
        		//将数据存储到session中
        		session.setAttribute("data", "孤傲苍狼");
        		//获取session的Id
        		String sessionId = session.getId();
        		//判断session是不是新创建的
        		/*if (session.isNew()) {
        		    response.getWriter().print("session创建成功，session的id是："+sessionId);
        		}else {
        		    response.getWriter().print("服务器已经存在该session了，session的id是："+sessionId);
        		}*/
        		return jsonutil.toJson(resuser);
    		}else{
    			rep.setMessage("Not Login");
    			return jsonutil.toJson(rep);
    		}
    		
    		
    	}catch(Exception e){
    		e.printStackTrace();
    		rep.setSuccess(false);
			rep.setMessage("error");
			return jsonutil.toJson(rep);
    	}
    }
	
	@RequestMapping(value="/login",method=RequestMethod.POST, produces="text/json;charset=UTF-8")
    public String getalluser(HttpServletRequest request,HttpServletResponse resp) throws IOException {
				
    	try{
    		String resbody = charReader(request);
    		PostUser postuser = jsonutil.fromJson(resbody, PostUser.class);
    		String username = postuser.getUsername()==null?"":postuser.getUsername();
    		String password = postuser.getPassword()==null?"":postuser.getPassword();
        	List<TUSER> userlist = new ArrayList<>();
        	Map<String, String> map = new HashMap<String, String>();
        	map.put("username", password);
    		userlist = userservice.getbyname(map); 
    		if(userlist.get(0).getPassword().equals(password)){
    			ResponseModel rep = new ResponseModel();
    			rep.setSuccess(true);
    			rep.setMessage("OK");
    			
    			LoginUser user = new LoginUser();
        		user.setId(2);
        		user.setUsername("admin");
        		ResponseLoginUser resuser = new ResponseLoginUser();
        		resuser.setSuccess(true);
        		resuser.setUser(user);
    			cookieutil.addCookie(resp, "token", jsonutil.toJson(resuser));
    			return jsonutil.toJson(rep);
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
		return jsonutil.toJson("false");
    }
	
	
	@RequestMapping(value="/logout",method=RequestMethod.GET, produces="text/json;charset=UTF-8")
    public void logout(HttpServletRequest request,HttpServletResponse resp) throws IOException {
				
    	try{
    		cookieutil.delCookie(request, resp, "token");
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
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
