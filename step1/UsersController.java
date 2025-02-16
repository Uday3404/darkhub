package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class UsersController {

	@PostMapping("/register")
	public String addUser(
			String username,
			String email, 
			String password,
			String gender,
			String role,
			String Address)
	{
		System.out.println(username+""+email+" "+password+""+gender+""+role+""+Address);
		return null;
		
	}

}
