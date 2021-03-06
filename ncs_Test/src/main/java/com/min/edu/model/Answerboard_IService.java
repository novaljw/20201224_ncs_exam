package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.dto.Answerboard_Dto;

public interface Answerboard_IService {

public List<Answerboard_Dto> userBoardList();
	
	public Answerboard_Dto getOneBoard(String seq);
	
	public boolean modifyBoard(Answerboard_Dto dto);
	
	public boolean delflagBoard(Map<String, String[]> map);
	
	public boolean reply(Answerboard_Dto dto);
	
	public boolean writeBoard(Answerboard_Dto dto);
	
}
