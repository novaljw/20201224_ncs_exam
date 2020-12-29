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

	@Override
	public Answerboard_Dto getOneBoard(String seq) {
		return sqlSession.selectOne(NS+"getOneBoard", seq);
	}

	@Override
	public boolean modifyBoard(Answerboard_Dto dto) {
		int cnt = sqlSession.update(NS+"modifyBoard", dto);
		return cnt>0?true:false;
	}

	@Override
	public boolean delflagBoard(Map<String, String[]> map) {
		int cnt = sqlSession.update(NS+"delflagBoard", map);
		return cnt>0?true:false;
	}

	@Override
	public boolean replyBoardUp(Answerboard_Dto dto) {
		int cnt =  sqlSession.update(NS+"replyBoardUp", dto);
		return cnt>0?true:false;
	}

	@Override
	public boolean replyBoardIn(Answerboard_Dto dto) {
		int cnt = sqlSession.insert(NS+"replyBoardIn", dto);
		return cnt>0?true:false;
	}

	@Override
	public boolean writeBoard(Answerboard_Dto dto) {
		int cnt = sqlSession.insert(NS+"writeBoard", dto);
		return cnt>0?true:false;
	}
	
	

	
}
