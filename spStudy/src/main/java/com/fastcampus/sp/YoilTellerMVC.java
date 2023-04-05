package com.fastcampus.sp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 년월일을 입력하면 요일을 알려주는 프로그램
@Controller
public class YoilTellerMVC { // http://localhost/sp/getYoilMVC?year=2021&month=10&day=1

	@RequestMapping("/getYoilMVC")
//	public void main(HttpServletRequest request, HttpServletResponse response) throws IOException{
	public String main(int year, int month, int day, Model model) throws IOException{
		   // yoil String을 리턴!, Model model  파람 추가
		
		// 1. 입력
//		String year = request.getParameter("year");
//		String month = request.getParameter("month");
//		String day = request.getParameter("day");
		
		// 2. 작업
//		int yyyy = Integer.parseInt(year);
//		int mm = Integer.parseInt(month);
//		int dd = Integer.parseInt(day);
		 
		// * 유효성 검사
		if (!isValid(year, month, day))
			return "yoilError";
		
		// ** 요일 계산
		char yoil = getYoil(year, month, day);
		
		// *** 계산한 결과를 model 에 저장 -> view가 이 model 객체 저장된 값을 참조함.
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		model.addAttribute("yoil", yoil);
		return "yoil"; //WEB-INF/views/yoil.jsp 를 이용해서 출력함
		
		// 3. 출력
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
//		PrintWriter  out = response.getWriter(); // response 객체에서 브라우저로의 출력 스트림을 얻는다.
//		out.println(year + "년 " + month + "월 " + day + "일은 ");
//		out.println(yoil + "요일입니다.");
	}

private boolean isValid(int year, int month, int day) {
	// TODO Auto-generated method stub
	return true;
}

private char getYoil(int year, int month, int day) {
	Calendar cal = Calendar.getInstance();
	cal.set(year, month-1, day);
	
	int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	return " 일월화수목금토".charAt(dayOfWeek);
}  
 
}
