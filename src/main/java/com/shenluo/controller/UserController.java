package com.shenluo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shenluo.pojo.User;

@RestController
@RequestMapping("info")
public class UserController {
	
	
	@RequestMapping("getUser")
	public User getUser(){
		User user = new User();
		user.setName("沈罗");
		user.setAge(18);
		return user;
	}

}
