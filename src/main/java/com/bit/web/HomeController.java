package com.bit.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String home() {
		logger.info("홈컨트롤러 진입");
	
		return "main/Home.tiles";
	}
	@GetMapping("/user/join")
	public String userJoin() {
		logger.info("user.come");
		return "user/Join.jsp";
	}
	
}