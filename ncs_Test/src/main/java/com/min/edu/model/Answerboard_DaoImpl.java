package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.dto.Answerboard_Dto;

@Repository
public class Answerboard_DaoImpl implements Answerboard_IDao{
	
	private final String NS ="com.min.edu.model.Answerboard_IDao.";
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<Answerboard_Dto> userBoardList() {
		return sqlSession.selectList(NS+"userBoardList");
	}
	
	

	
}
