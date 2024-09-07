package com.lcwd.rating.controllers;

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

import com.lcwd.rating.entites.RatingEntity;
import com.lcwd.rating.services.RatingService;

@RestController
@RequestMapping("/Rating")
public class RatingController {
	@Autowired
	private RatingService ratingService;
	
	//create Rating
	
	@PostMapping("/insert")
	public ResponseEntity<RatingEntity> createRating(@RequestBody RatingEntity rating){
		RatingEntity newrating = ratingService.createRating(rating);
		
		return new ResponseEntity<RatingEntity>(newrating, HttpStatus.CREATED) ;
		
	}
	
	//get all
	@GetMapping("/ratings")
	public ResponseEntity<List<RatingEntity>> getAllRatings(){
		
		List<RatingEntity> ratings = ratingService.getRatings();
		
		return ResponseEntity.status(HttpStatus.OK).body(ratings);
	}
	
	//get all rating by user id
		@GetMapping("/users/{uid}")
		public ResponseEntity<List<RatingEntity>> getAllRatingsByUserId(@PathVariable int uid){
			
			List<RatingEntity> ratingsByUserId = ratingService.getRatingsByUserId(uid);
			
			return ResponseEntity.status(HttpStatus.OK).body(ratingsByUserId);
		}
		
		//get all rating by hotel id
		@GetMapping("/hotels/{hid}")
		public ResponseEntity<List<RatingEntity>> getAllRatingsByHotelId(@PathVariable int hid){
			
			List<RatingEntity> ratingByHotelId = ratingService.getRatingByHotelId(hid);
			
			return ResponseEntity.status(HttpStatus.OK).body(ratingByHotelId);
		}
	

}
