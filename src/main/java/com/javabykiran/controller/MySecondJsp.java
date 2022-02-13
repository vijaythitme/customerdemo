package com.javabykiran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MySecondJsp {
	@RequestMapping("index")
   public String index() {
	return "index";
	   
   }
	
}
