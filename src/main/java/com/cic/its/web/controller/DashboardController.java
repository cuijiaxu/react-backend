package com.cic.its.web.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cic.its.web.datamodel.ResponseModel;
import com.cic.its.web.datamodel.dashboard.Dashboard;
import com.cic.its.web.datamodel.dashboard.DashboardJson;
import com.cic.its.web.util.JsonUtil;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {
private JsonUtil jsonutil = new JsonUtil();
		
	@RequestMapping(value="",method=RequestMethod.GET, produces="text/json;charset=UTF-8")
    public String checkuser(HttpServletRequest request,HttpServletResponse resp) throws IOException {
		
		ResponseModel rep = new ResponseModel();
		
    	try{
    		DashboardJson ds = new DashboardJson();
    		Dashboard dashboard = ds.getdashboard();
    		return jsonutil.toJson(dashboard);
    	}catch(Exception e){
    		e.printStackTrace();
    		rep.setSuccess(false);
			rep.setMessage("error");
			return jsonutil.toJson(rep);
    	}
    }
}
