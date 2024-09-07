package com.lcwd.rating.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "rating_table")
public class RatingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ratingid;
	private int uid;
	private int hotelid;
	private int rating;
	private String feedback;
	

}
