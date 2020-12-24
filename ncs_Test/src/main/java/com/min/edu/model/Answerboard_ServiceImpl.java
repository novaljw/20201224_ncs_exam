package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.dto.Answerboard_Dto;

@Service
public class Answerboard_ServiceImpl implements Answerboard_IService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Answerboard_IDao iDao;

	@Override
	public List<Answerboard_Dto> userBoardList() {
		logger.info("글 조회(전체-사용자)  userBoardList ");
		
		return iDao.userBoardList();
	}

	

}
