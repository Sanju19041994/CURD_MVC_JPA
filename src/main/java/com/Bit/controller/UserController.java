package com.Bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Bit.model.User;
import com.Bit.service.UserServiceI;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceI userServiceI;

	@GetMapping("/welcome")
	public String formSaveUser(User user) {
		System.out.println("Controller Get Mapping Called");
		return "saveUser";
	}
	
	@PostMapping("/reg")
	public String saveUser(User user, Model model) {
		User user2 = userServiceI.saveUser(user);
		model.addAttribute("USER", user2);
		
		System.out.println("Controller Post Mapping Called");
		System.out.println(user2);
		
		return "SaveSuccess";
		
	}
}
