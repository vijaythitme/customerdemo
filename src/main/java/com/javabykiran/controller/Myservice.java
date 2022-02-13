package com.javabykiran.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Myservice {
	 @RequestMapping("welcome")
  String welcome() {
	  return "welcome to spring simple prog ";
  }
}
