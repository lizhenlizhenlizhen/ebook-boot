package com.uek.project.ebookboot.controller;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author ZhenLi
 *
 */
@Controller
public class HelloContorller {

	
	@RequestMapping("/hello")
	public String hello(){
		return "hello spring boot";
	}
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
