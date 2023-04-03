package com.fastcampus.sp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출 가능한 프로그램으로 등록
@Controller
public class Hello {

	// 2. URL과 메서드 연결
	// static 없이 Instance method로 선언되어 있음 -> tomcat내부에서 instance 생성해주고 있음. 
	// static 으로 선언해도 됨
	@RequestMapping("/hello")
	private void main(String[] args) {
		System.out.println("Hello - private");
	}

}
