package com.ssm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.dao.UserMapper;
import com.ssm.service.MytestService;

@RequestMapping("/sys")
@Controller
public class LoginController {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private MytestService mytestService;
	
	@RequestMapping(value="/t")
	@ResponseBody
	public Map<String,Object> test(HttpServletRequest request, HttpServletResponse response){
		Map<String,Object> map=new HashMap<String, Object>();
		System.out.println("我是切点 调用controller里面的方法！！");
		map.put("1", "oo");
		int i = 1/0;
		return map;
	}
	
	@RequestMapping(value="/transa")
	@ResponseBody
	public String testTransaction(HttpServletRequest request, HttpServletResponse response){
		System.out.println("我是切点 调用controller里面的方法！！");
		
		mytestService.insert();
		return "welcome";
	}
	
	
}
