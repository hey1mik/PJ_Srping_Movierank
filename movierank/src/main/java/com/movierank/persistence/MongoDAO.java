package com.movierank.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.movierank.domain.MovieDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class MongoDAO {
	
	//sqlSession 같은 놈. mongoTemplate보다 똑똑한녀석. 뭐 해달라고하면 알아서 다 함.(자동화가 되어있음)
	//자동화의 단점 : detail한 설정이 불가능.
	
	@Autowired
	private MongoOperations mongoOper;
	
	public void save(MovieDTO mDto) {
		log.info(">>>>>>>>> 영화랭킹정보 mongdoDB에 저장");
		mongoOper.save(mDto);
		//save는 insert와 다름. insert가 아니라 update를 한다는 차이가 있음.
		// 똑같은 id값의 데이터를 넣을 때 안들어가는게 아니라 최신값으로 overwrite함.
	}
	 
	public void dropCol() {
		log.info(">>>>>>>>>Collection Drop");
		mongoOper.dropCollection("movie");
	}
	
	public List<MovieDTO> movieList() {
		log.info(">>>>>>>영화 랭킹정보 mongoDB에서 Select");
		Criteria cri = new Criteria();
		//Criteria cri = new Criteria(key);
		//cri.is(value);
		// Select * from movie where key = value;
		Query query = new Query(cri);
		List<MovieDTO> list = mongoOper.find(query, MovieDTO.class);
		for(MovieDTO one : list) {
			log.info(one.toString());
		}
		return list;
	}
}
