package com.BikkadIt.SpringWebMVCCrudUsingDataJPA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.BikkadIt.SpringWebMVCCrudUsingDataJPA.Service.UserServiceI;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping("/welcome")
	public String loadForm() {
		return "welcome";
		
	}
	
	
	
	

}
