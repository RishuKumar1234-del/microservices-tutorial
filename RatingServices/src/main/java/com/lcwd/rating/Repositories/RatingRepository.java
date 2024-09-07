package com.lcwd.rating.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.rating.entites.RatingEntity;

public interface RatingRepository extends JpaRepository<RatingEntity, Integer> {
	
	//custom finder methods
	
	List<RatingEntity> findByuid(int uid);
	
	List<RatingEntity> findByhotelid(int hotelid);

}
