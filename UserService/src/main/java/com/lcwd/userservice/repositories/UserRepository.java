package com.lcwd.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.userservice.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
