package com.lcwd.userservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Rating {
	//in this we have given all details of rating entity class of RatingServices
	private int ratingid;
	private int uid;
	private int hotelid;
	private int rating;
	private String feedback;
	private Hotel hotel;

}
