package com.javabykiran.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstJSP11 
{

	
	
	
	
	@RequestMapping("input11")
	public String input11()
	{
		return "input11";
	}
	
	// m- model means data which will be displayed on web page
	
	@RequestMapping("displayName11")
	public ModelAndView displayName(User user)
	{
		List list = Arrays.asList("JBK","JAVA","Pune");
		ModelAndView modelAndView=new ModelAndView() ;
		
		
		if(user.upass.equals("java"))
		{
			modelAndView.addObject("user",user);
			modelAndView.addObject("list",list);
			modelAndView.setViewName("welcome11");
		}
		
		else
		{
			
			modelAndView.addObject("errorMessage","password wrong");
			modelAndView.setViewName("input11");
			
		}
		
		return modelAndView;
		
	}
}
