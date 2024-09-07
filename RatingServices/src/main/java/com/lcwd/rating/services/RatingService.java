package com.lcwd.rating.services;

import java.util.List;

import com.lcwd.rating.entites.RatingEntity;

public interface RatingService {
	
	//create
	RatingEntity createRating(RatingEntity rating);
	//get all ratings
	
	List<RatingEntity> getRatings();
	
	//get all by user id
	List<RatingEntity> getRatingsByUserId(int uid);
	
	//get all by user id
	
	List<RatingEntity> getRatingByHotelId(int hotelid);
	
	

}
