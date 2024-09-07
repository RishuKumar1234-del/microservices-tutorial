package com.lcwd.userservice.entities;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_entity")
public class UserEntity {
	     @Id
	     @GeneratedValue(strategy =GenerationType.AUTO)
	  @Column(name = "ID")
	    private int userId;

	    @Column(name = "NAME", length = 20)
	    private String name;

	    @Column(name = "EMAIL")

	    private String email;
	    @Column(name = "ABOUT")
	    private String about;
	    //other user properties that you want

	    @Transient
	    private List<Rating> ratings=new ArrayList<>();
	
	
	

}
