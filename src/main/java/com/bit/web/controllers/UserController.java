package com.bit.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.web.domains.User;
import com.bit.web.enums.Messenger;
import com.bit.web.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired UserService userService;
	
	@PostMapping("/join")
	public Messenger join(@RequestBody User user) {
		System.out.println("넘어온 회원 정보 "+user.toString());
		return Messenger.SUCCESS;
	}
	
}
