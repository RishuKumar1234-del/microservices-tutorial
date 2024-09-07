package com.lcwd.userservice.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lcwd.userservice.entities.Hotel;
import com.lcwd.userservice.entities.Rating;
import com.lcwd.userservice.entities.UserEntity;
import com.lcwd.userservice.exceptions.ResourceNotFoundException;

import com.lcwd.userservice.repositories.UserRepository;


@Service
public class UserviceImple implements UserServices {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	private Logger logger=LoggerFactory.getLogger(UserviceImple.class);
	
	
	
	
	
	private UserRepository  userRepository;
	
	@Autowired
	public UserviceImple(UserRepository userRepository) {
		this.userRepository=userRepository;
	   }

	@Override
	public UserEntity saveUser(UserEntity user) {
		
		//generate Unique userid
		 
		
		return userRepository.save(user);
	}

	@Override
	public List<UserEntity> getAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public UserEntity getUser(Integer uid) {
		UserEntity user= userRepository.findById(uid).orElseThrow(()->new ResourceNotFoundException("user with given "
				+ "id is not found on the server" +uid));
		
		//fetch rating of the above user from Rating service
		//http://localhost:8083/Rating/users/1
		
		
		 //the below url has not dynamic id
		//ArrayList<Rating> ratingOfUser = restTemplate.getForObject("http://localhost:8083/Rating/users/1", ArrayList.class);
		
		//now it has dynamic id
		Rating[] ratingOfUser = restTemplate.getForObject("http://RATINGSERVICES/Rating/users/"+
		 user.getUserId(), Rating[].class);
		logger.info("{} ",ratingOfUser);
		
		List<Rating> ratings = Arrays.stream(ratingOfUser).toList();
		
	List<Rating> ratingList=ratings.stream().map(x->{
			//api call to hotel service to get the hotel
		    //http://localhost:8082/Hotel/hotel/1
		 //  ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://HOTELSERVICE/Hotel/hotel/"+x.getHotelid(), Hotel.class);
		 //  Hotel hotel = forEntity.getBody();
		
		  // logger.info("response status code: {} ", forEntity.getStatusCode());
		
		
			//set the hotel to rating
		  // x.setHotel(hotel);			
		   //return the rating
			return x;
		}).collect(Collectors.toList());
		logger.info("{}  ",ratingOfUser);
		//set rating to user
		user.setRatings(ratings);
		
		
		
		return user;
	}

}
