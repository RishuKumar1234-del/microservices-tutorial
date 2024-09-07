package com.lcwd.hotelservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotelservice.entites.HotelEntity;
import com.lcwd.hotelservice.exception.ResourceNotFoundException;
import com.lcwd.hotelservice.repositories.HotelRepositories;

@Service
public class HotelServiceImple implements HotelServices{
	
	private HotelRepositories hotelRepositories;
	
	@Autowired
	public HotelServiceImple(HotelRepositories hotelRepositories) {
		this.hotelRepositories=hotelRepositories;
	}

	@Override
	public HotelEntity createHotel(HotelEntity hotel) {
		
		return hotelRepositories.save(hotel);
	}

	@Override
	public List<HotelEntity> getAllHotels() {
		
		return hotelRepositories.findAll();
	}

	@Override
	public HotelEntity getHotelById(int hid) {
		HotelEntity hotelByid=hotelRepositories.findById(hid).orElseThrow(()->new ResourceNotFoundException("the hotel with given id is not found!!" +hid));
		
		return hotelByid;
	}

}