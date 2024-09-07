package com.lcwd.rating.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.Repositories.RatingRepository;
import com.lcwd.rating.entites.RatingEntity;

@Service
public class RatingServiceImple implements RatingService {
	
	@Autowired
	private RatingRepository ratingRepository;

	
	//get all ratings
	@Override
	public List<RatingEntity> getRatings() {
		
		return ratingRepository.findAll();
	}
     //get ratings by user id
	@Override
	public List<RatingEntity> getRatingsByUserId(int uid) {
		
		return ratingRepository.findByuid(uid);
	}
     //get rating by hotel id
	@Override
	public List<RatingEntity> getRatingByHotelId(int hotelid) {
		
		return ratingRepository.findByhotelid(hotelid);
	}
	
	//create rating

	@Override
	public RatingEntity createRating(RatingEntity rating) {
		
		return ratingRepository.save(rating);
	}

}
