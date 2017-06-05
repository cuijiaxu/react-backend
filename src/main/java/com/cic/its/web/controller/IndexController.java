package com.cic.its.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/main")
public class IndexController {
	
	@ResponseBody
	@RequestMapping(value="/menu",produces = "application/json; charset=utf-8")
	public String menuJson(HttpServletRequest request){
		Map<String,String> uMap = new HashMap<String,String>();
		List<Map<String,Object>> menuList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> menuAllList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> menuAllSortList = new ArrayList<Map<String,Object>>();
		
		return "";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/reactmenu",produces = "application/json; charset=utf-8")
	public String reactmenu(HttpServletRequest request){
		Map<String,String> uMap = new HashMap<String,String>();
		List<Map<String,Object>> menuList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> menuAllList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> menuAllSortList = new ArrayList<Map<String,Object>>();
		
		return "";
	}
}
