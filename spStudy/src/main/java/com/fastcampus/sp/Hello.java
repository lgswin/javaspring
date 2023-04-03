package com.fastcampus.sp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. ���� ȣ�� ������ ���α׷����� ���
@Controller
public class Hello {

	// 2. URL�� �޼��� ����
	// static ���� Instance method�� ����Ǿ� ���� -> tomcat���ο��� instance �������ְ� ����. 
	// static ���� �����ص� ��
	@RequestMapping("/hello")
	private void main(String[] args) {
		System.out.println("Hello - private");
	}

}
