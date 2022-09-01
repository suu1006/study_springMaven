package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	/*
	@RequestMapping(value = "/hello.do", method=RequestMethod.GET)
	public ModelAndView hello(){ // 사용자가 만든 콜백 메소드 (= 내가 만든 메소드다! 기존에 있는게 아니다. 원래는 기존에 있는걸 오버라이딩 해서 썼는데, 콜백 > 스프링이 부른다.)
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "Have a nice day!!"); //result 변수명에  "Have a nice day!!" <-이 데이터를 실어서 보내라!
		
		//mav.setViewName("hello");  // hello.jsp 라고 자동으로 붙음. 절대 확장명 적어주면안됨!!!!(스프링은 resolver에 의해서 선택할 수 있기떄문에) // >> /view/hello.jsp
		mav.setViewName("/view/hello");  
							
		return mav;
	}
	*/
	//@RequestMapping(value = "/hello.do", method=RequestMethod.GET) // get방식으로 요청이 들어온다. 아래와 같이 작성해줘도 된다.
	@GetMapping(value = "/hello.do", produces="text/html; charset=UTF-8")
	@ResponseBody
	public String hello() {
		// return "apple"; // apple.jsp 파일이라고 인식한다.
		return "안녕하세요 스프링!";
	}
	
	//스프링에서는 리턴 타입이 String이면 단순 문자열이 아니라 파일명으로 인식한다!!! 
	//스프링은 apple.jsp파일을 찾는다.
	//apple.jsp파일이 아니라 단순 문자열로 브라우저(화면)에 뿌리려면 @ResponseBody를 써야한다.
	
	
}
