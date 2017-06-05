package com.cic.its.web.controller;

import javax.annotation.Resource;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cic.its.web.service.ControlFaultService;
import com.cic.its.web.util.JsonUtil;


@RestController
@RequestMapping("/controlinfo")
public class ControlFaultCotroller {

	@Resource
	private ControlFaultService controlservice;

	private JsonUtil jsonutil = new JsonUtil();
//根据ID查单个设备故障	信息
	@RequestMapping("/get")
	public String getbyid(){
		
		return "";
	}


}
