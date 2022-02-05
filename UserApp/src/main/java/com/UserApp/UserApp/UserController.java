package com.UserApp.UserApp;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@Autowired
	private UserRepository userRepo ;
	
	
	@RequestMapping("/")
	public List<User> geAllUser() {
		return (List<User>) userRepo.findAll() ;
	}
	
	
	
	@RequestMapping("/user/{id}")
	public List<User> geAllUserByUserId(@PathVariable BigInteger id) {
		return (List<User>) userRepo.findByUserId(id) ;
	}
	
	@RequestMapping("/course/{id}")
	public List<User> geAllUserByCourseId(@PathVariable BigInteger id) {
		return (List<User>) userRepo.findByCourseId(id) ;
	}

}
