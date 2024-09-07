package com.lcwd.userservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
	
	//inside this we will give all details of hotel entity of HotelServices
	private int hid;
	private String name;
	private String location;
	private String about;

}
