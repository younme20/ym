package kr.ko.ym.study.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.ko.ym.study.service.StudyService;

/*
 * 2020. 07. 15
 * 스터디관리 > 스터디관리 게시판 
 */
@Controller
public class StudyController {
	
	/* 서비스 주입 */
	@Autowired
	private StudyService studyService;
	
	
	@RequestMapping(value="/")
	public ModelAndView selectList(@RequestParam Map<String,Object>param) throws Exception {
		ModelAndView mv = new ModelAndView("/study/studyLs");
		
		mv.addObject("list", studyService.selectList(param));				
		return mv;		
	}
	
	@RequestMapping(value="/study/edit/{idx}")
	public ModelAndView selectDetail(@PathVariable int idx, @RequestParam Map<String,Object>param) throws Exception {
		ModelAndView mv = new ModelAndView("/study/studyEd");
		
		mv.addObject("map", studyService.selectDetail(param));				
		return mv;		
	}

	

}
