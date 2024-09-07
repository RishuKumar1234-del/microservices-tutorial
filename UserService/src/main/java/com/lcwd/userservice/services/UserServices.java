package com.lcwd.userservice.services;

import java.util.List;

import com.lcwd.userservice.entities.UserEntity;

public interface UserServices {
	
	//User operations
	
	//create
	
	UserEntity saveUser(UserEntity user);
	
	//get All users
	
	List<UserEntity> getAllUser();
	
	//get single user of given UserId
	
	UserEntity getUser(Integer uid);
	
	//TODO: delete
	//TODO: update

}
