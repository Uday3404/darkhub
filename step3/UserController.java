
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Users;
import com.example.demo.services.UsersService;

@Controller

public class UsersController {
@Autowired
UsersService userv;


@GetMapping("/map-register")
public String registermapping()


{
	return "register";
}

@GetMapping("/map-login")
public String loginmapping()

{
	return "login";
}



	@PostMapping("/register")
	public String addUser(@ModelAttribute Users user)
	//public String addUser(
		//	String username,
		//	String email, 
		//	String password,
		//	String gender,
		//	String role,
		//	String Address)
	

	{
		
		//System.out.println(username+""+email+" "+password+""+gender+""+role+""+Address);
		//return null;
		
		boolean userstatus=userv. emailexists(user.getEmail());
		if (userstatus==false)
			
		{
			userv.addUsers(user);
			return "home"	;
		}
		
		else
		{
			return "registerfail";
		}
		
	
	
	
		
	}
	

}


