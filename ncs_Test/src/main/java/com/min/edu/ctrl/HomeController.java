package com.min.edu.ctrl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.edu.dto.Answerboard_Dto;
import com.min.edu.model.Answerboard_IService;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private Answerboard_IService iService;
	
	@RequestMapping(value = "/hello.do", method = RequestMethod.GET)
	public String home() {
		return "hello";
	}
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
    public String home(Model model) {
        List<Answerboard_Dto> BoardList = iService.userBoardList();
        model.addAttribute("BoardList", BoardList);
        return "home";
    }

	
	
}
