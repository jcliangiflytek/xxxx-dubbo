package com.xxxx.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxxx.repo.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
     
	 @Resource
	 private IUserService userService;
	 
	 
	 @RequestMapping("/getname")
	 @ResponseBody
	 public String getName(){
		 return userService.getName("aaa");
	 }
}
