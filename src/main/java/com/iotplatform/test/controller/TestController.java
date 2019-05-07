package com.iotplatform.test.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/getJson")
	//返回json实体
	@ResponseBody
	public  Map  getJsoTest (@RequestBody String params ,HttpServletResponse  res) throws IOException {
	
		
		System.out.print("request:"+params);
		res.setHeader("content-type", "text/html;charset=utf-8");
		Map<String ,Object> map =new HashMap<String, Object>();
		map.put("AAA", "BBB");
		return map;
	}

}
