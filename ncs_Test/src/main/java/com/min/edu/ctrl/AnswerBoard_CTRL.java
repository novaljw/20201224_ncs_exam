package com.min.edu.ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.edu.model.Answerboard_IService;

@Controller
public class AnswerBoard_CTRL {

	@Autowired
	private Answerboard_IService iService;
	
	@RequestMapping(value = "/test.do" , method = RequestMethod.GET)
	public String Test(HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8;");
		PrintWriter out = response.getWriter();
		out.println("<script> alert('처리가 완료되어 있습니다.'); location.href='./'</script>");
		out.flush();
		return null;
	}
	// 주석
	
	
}
