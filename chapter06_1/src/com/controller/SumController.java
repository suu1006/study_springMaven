package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.SumDTO;

@Controller // 핸들러 매핑이 이걸 알 수 있도록 작성해준다.
public class SumController {
	
	@RequestMapping(value = "/input.do" , method = RequestMethod.GET)
	public String input() {
		return "/sum/input";
	}
	
//	@GetMapping(value = "result.do")
//		public String result() {
//			return "/sum/result";
//	}
	
	
//	@GetMapping(value = "result.do")
//	public ModelAndView result(@RequestParam int x, @RequestParam int y) { 
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x", x);
//		mav.addObject("y", y);
//		mav.setViewName("/sum/result");
//		return mav;
	
	
//	@GetMapping(value = "result.do")
//	public ModelAndView result(@RequestParam(required = false, defaultValue = "0") String x,  // required = false, defaultValue = "0">> 값이 안들어오면 -> 초기값 주는 것 
//								@RequestParam(required = false, defaultValue = "0") String y) { // Integer.parseInt를 안에서 처리함  / String 문자열로 처리해도 가능.
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x", x);
//		mav.addObject("y", y);
//		mav.setViewName("/sum/result");
//		return mav;
	
//	@GetMapping(value = "result.do")
//	public String result(@RequestParam Map<String , String> map, ModelMap modelMap){ 
//		modelMap.put("x", map.get("x")); // 모델 맵이나 자바의 맵이나 같은 역할을 해준다.
//		modelMap.put("y", map.get("y"));
//		return "/sum/result";
//}
	
	@GetMapping(value = "result.do")
	public String result(@ModelAttribute SumDTO sumDTO, Model model){  // 회원가입할땐 DTO로 받아들이면 편함(개수가 너무 많아...) 모델앤뷰/ 모델 /모델어트리뷰트 골라서 편한걸로 쓰기
		model.addAttribute("sumDTO", sumDTO);
		return "/sum/result";
	}
}
