package com.lcwd.hotelservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotelservice.entites.HotelEntity;

public interface HotelRepositories extends JpaRepository<HotelEntity, Integer> {

}
