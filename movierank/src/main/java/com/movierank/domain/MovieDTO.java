package com.movierank.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "movie")
public class MovieDTO {
	
	@Id
	private int rank;
	private String movie;
	private String imgsrc;
	private String type;
	private String opendate;
	private String bookingrate;
	private String runtime;
	private String director;
	private String actor;
	private String navercode;
	private double naverscore;
	private String daumcode;
	private double daumscore;
	private double score;
	


}
