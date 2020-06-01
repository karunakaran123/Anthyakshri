package com.megaroy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megaroy.iservice.IUserService;

@RestController
@RequestMapping("/anthyakshri")
public class UserController1 {
	
	//@Autowired
	//private IUserService service;
	
	@RequestMapping("/signup")
	public String getUserAudioandVideo(@RequestBody String data) {
		System.out.println(data);
		return "megaroy"; 
	}
	@RequestMapping("/login")
	public String Login() {
		
		return "login";
	}
	
}
