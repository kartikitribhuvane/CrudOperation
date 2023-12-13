package com.BikkadIt.SpringWebMVCCrudUsingDataJPA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.SpringWebMVCCrudUsingDataJPA.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI{

	@Autowired
	private UserRepository userRepository;
	
	
	
	
	
	
}



