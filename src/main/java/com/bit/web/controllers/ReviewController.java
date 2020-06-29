package com.bit.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/review")
public class ReviewController {
	
	
	@GetMapping("/join/form")
	public String joinForm() {
		
		return "Join";
	}
	
}
