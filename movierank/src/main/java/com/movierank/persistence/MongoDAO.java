package com.movierank.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.movierank.domain.MovieDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class MongoDAO {
	
	//sqlSession 같은 놈
	@Autowired
	private MongoOperations mongoOper;
	
	public void save(MovieDTO mDto) {
		log.info(">>>>>>>>> 영화랭킹정보 mongdoDB에 저장");
		mongoOper.save(mDto);
	}
	
	public void dropCol() {
		log.info(">>>>>>>>>Collection Drop");
		mongoOper.dropCollection("movieDTO");
	}
	
	public List<MovieDTO> movieList() {
		log.info(">>>>>>>영화 랭킹정보 mongoDB에 저장");
		return null;
	}
}
