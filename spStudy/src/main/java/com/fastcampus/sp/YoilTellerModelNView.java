package com.fastcampus.sp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// ������� �Է��ϸ� ������ �˷��ִ� ���α׷�
@Controller
public class YoilTellerModelNView { // http://localhost/sp/getYoilModelNView?year=2021&month=10&day=1

	@RequestMapping("/getYoilModelNView")
	public ModelAndView main(int year, int month, int day, Model model) throws IOException{

		ModelAndView mv = new ModelAndView();
		mv.setViewName("yoilError");
		
		if(!isValid(year, month, day))
			return mv;
		
		// ** ���� ���
		char yoil = getYoil(year, month, day);
		
		// *** ����� ����� ModelAndView ��ü�� ������
		mv.addObject("year", year);
		mv.addObject("month", month);
		mv.addObject("day", day);
		mv.addObject("yoil", yoil);
		
		// **** ����� ������ view�� ����
		mv.setViewName("yoil");
		
		return mv; // ModelAndView ��ü�� ������
		
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
