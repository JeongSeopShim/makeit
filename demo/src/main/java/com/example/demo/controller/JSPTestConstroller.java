package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.vo.TestVO;

@RestController
public class JSPTestConstroller
{
	@RequestMapping("/test")
	public ModelAndView testJsp() throws Exception
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","TestJSP");
		
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		
		mv.addObject("list",testList);
		
		return mv;
	}
	
}
