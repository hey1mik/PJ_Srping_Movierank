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
	
	
	public MovieDTO(int rank, String movie, String imgsrc, String type, String opendate, String bookingrate,
			String runtime, String director, String actor, String navercode, double naverscore, String daumcode,
			double daumscore) {
		super();
		this.rank = rank;
		this.movie = movie;
		this.imgsrc = imgsrc;
		this.type = type;
		this.opendate = opendate;
		this.bookingrate = bookingrate;
		this.runtime = runtime;
		this.director = director;
		this.actor = actor;
		this.navercode = navercode;
		this.naverscore = naverscore;
		this.daumcode = daumcode;
		this.daumscore = daumscore;
	}
}
