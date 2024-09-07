package com.lcwd.hotelservice.services;

import java.util.List;

import com.lcwd.hotelservice.entites.HotelEntity;

public interface HotelServices  {
	
	//create
	
	HotelEntity createHotel(HotelEntity hotel);
	
	//get all
	
	List<HotelEntity> getAllHotels();
	
	//get single
   HotelEntity getHotelById(int hid);
}
