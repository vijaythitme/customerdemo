package com.javabykiran.controller;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyFirstJSP 
{

	@RequestMapping("hello")
	public String hello()
	{
		return "hello";
	}
	
	@RequestMapping("input")
	public String input()
	{
		return "input";
	}
	@RequestMapping("demo")
	public String demo()
	{
		return "demo";
	}
	@RequestMapping("disp")
	
	  public String disp()
	{ 
		return "demo";
		}
	 
// m- model means data which will be displayed on web page
		@RequestMapping("displayName")
	public ModelAndView displayName(User user)
	{
		List list = Arrays.asList("JBk","JAva","Pune");
		ModelAndView modelAndView=new ModelAndView() ;
		       modelAndView.setViewName("input");
		       modelAndView.addObject("userv",user);
		       modelAndView.addObject("listv",list);
		return modelAndView;
		
	}
}
