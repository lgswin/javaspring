package com.fastcampus.sp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// ������� �Է��ϸ� ������ �˷��ִ� ���α׷�
@Controller
public class YoilTellerMVC { // http://localhost/sp/getYoilMVC?year=2021&month=10&day=1

	@RequestMapping("/getYoilMVC")
//	public void main(HttpServletRequest request, HttpServletResponse response) throws IOException{
	public String main(int year, int month, int day, Model model) throws IOException{
		   // yoil String�� ����!, Model model  �Ķ� �߰�
		
		// 1. �Է�
//		String year = request.getParameter("year");
//		String month = request.getParameter("month");
//		String day = request.getParameter("day");
		
		// 2. �۾�
//		int yyyy = Integer.parseInt(year);
//		int mm = Integer.parseInt(month);
//		int dd = Integer.parseInt(day);
		 
		// * ��ȿ�� �˻�
		if (!isValid(year, month, day))
			return "yoilError";
		
		// ** ���� ���
		char yoil = getYoil(year, month, day);
		
		// *** ����� ����� model �� ���� -> view�� �� model ��ü ����� ���� ������.
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		model.addAttribute("yoil", yoil);
		return "yoil"; //WEB-INF/views/yoil.jsp �� �̿��ؼ� �����
		
		// 3. ���
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
//		PrintWriter  out = response.getWriter(); // response ��ü���� ���������� ��� ��Ʈ���� ��´�.
//		out.println(year + "�� " + month + "�� " + day + "���� ");
//		out.println(yoil + "�����Դϴ�.");
	}

private boolean isValid(int year, int month, int day) {
	// TODO Auto-generated method stub
	return true;
}

private char getYoil(int year, int month, int day) {
	Calendar cal = Calendar.getInstance();
	cal.set(year, month-1, day);
	
	int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	return " �Ͽ�ȭ�������".charAt(dayOfWeek);
}  
 
}
