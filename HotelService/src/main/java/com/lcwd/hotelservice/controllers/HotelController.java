package com.lcwd.hotelservice.controllers;

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

import com.lcwd.hotelservice.entites.HotelEntity;
import com.lcwd.hotelservice.services.HotelServices;

@RestController
@RequestMapping("/Hotel")
public class HotelController {
	
	private HotelServices hotelServices;
	
	@Autowired
	public HotelController(HotelServices hotelServices) {
		this.hotelServices=hotelServices;
	}
	
	 //create
	@PostMapping("/insert")
	public ResponseEntity<HotelEntity> addHotel(@RequestBody HotelEntity hotel){
		
		//HotelEntity newHotel = hotelServices.createHotel(hotel);
		
		//return new ResponseEntity<HotelEntity>(newHotel, HttpStatus.CREATED);
		
		       //    [OR]
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelServices.createHotel(hotel));
	}
	
	//get single
	@GetMapping("/hotel/{hid}")
	public ResponseEntity<HotelEntity> getHotelByid(@PathVariable int hid){
		
		return ResponseEntity.status(HttpStatus.OK).body(hotelServices.getHotelById(hid));
	}
	
	
	//get all
	@GetMapping("/hotels")
	public ResponseEntity<List<HotelEntity>> getAllHotels(){
		return ResponseEntity.status(HttpStatus.OK).body(hotelServices.getAllHotels());
	}
	
	

}
