package com.lcwd.userservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.userservice.entities.UserEntity;
import com.lcwd.userservice.services.UserServices;

@RestController
@RequestMapping("/User")
public class UserControllers {
	
	private UserServices userServices;
	
	@Autowired
	public UserControllers(UserServices userServices) {
		this.userServices=userServices;
	}
	
	
	//create 
	
	@PostMapping("/insert")
	public UserEntity createUser(@RequestBody UserEntity user){
		
		UserEntity user1=userServices.saveUser(user);
		return user1;
		
	}
	
	//get single user
	@GetMapping("/users/{uid}")
	public UserEntity getSingleUser(@PathVariable Integer uid){
		
		UserEntity user = userServices.getUser(uid);
		
		return user;
		
	}
	//get All users
	@GetMapping("/users")
	public List<UserEntity> getAllUsers(){
		
		List<UserEntity> allUser = userServices.getAllUser();
		
		return allUser;
	}
	
	
	

}
