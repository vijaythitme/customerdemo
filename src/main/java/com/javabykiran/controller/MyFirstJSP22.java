package com.javabykiran.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstJSP22 
{

	
	@RequestMapping("input22")
	public String input22()
	{
		return "input22";
	}
	
	@RequestMapping("display22")
	public String display22()
	{
		return "display22";
	}
		
	// m- model means data which will be displayed on web page
	
	@RequestMapping("displayName22")
	public ModelAndView displayName22(User user,HttpServletRequest request)
	{
		List list = Arrays.asList("JBK","JAVA","Pune");
		ModelAndView modelAndView=new ModelAndView() ;
				
		if(user.upass.equals("java"))
		{
			modelAndView.addObject("user",user);
			modelAndView.addObject("list",list);
			modelAndView.setViewName("welcome22");
			
		/*  whenever we want some data in all JSP page , keep that data in HttpSession object*/	
		
			HttpSession session = request.getSession();
			
			session.setAttribute("user",user);
			session.setAttribute("list",list);
			
		}
		
		else
		{
			
			modelAndView.addObject("errorMessage","password wrong");
			modelAndView.setViewName("input22");
			
		}
		
		return modelAndView;
		
	}
}
