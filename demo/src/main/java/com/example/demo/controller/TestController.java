package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.TestService;
import com.example.demo.vo.TestVO;

@Controller
public class TestController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/home")
	public String home()
	{
		System.out.println(" == home()2 === ");
		return "index.html";
	}
	
	@ResponseBody
	@RequestMapping("/valueTest")
	public String ajax()
	{
		return "비동기 TEST";
	}
	
	@RequestMapping("/test2")
	public ModelAndView testJsp2() throws Exception
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","TestJSP-Return ModelAndView");
		
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		
		mv.addObject("list",testList);
		
		return mv;
	}
	
	@RequestMapping("/test3")
	public String testJsp2(Model mv) throws Exception
	{
		mv.addAttribute("name","TestJSP-URL String");
		
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		
		mv.addAttribute("list",testList);
		
		return "test2";
	}
	
	@RequestMapping("/thymeleafTest")
	public String thymeleafTest(Model model)
	{
		TestVO tModel = new TestVO("name","TEST THYMELEAF");
		model.addAttribute("testModel",tModel);
		
		return "thymeleaf/thymeleafTest";
	}
	
	@Autowired
	TestService testService;
	
	@RequestMapping("/testDB")
	public String test(Model im) throws Exception
	{
		List<TestVO> testList = testService.selectTest();
		
		im.addAttribute("list",testList);
		
		return "testDB";
	}
	
	
	@RequestMapping("/testLog")
	public ModelAndView testLog() throws Exception
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","TestJSP-Return ModelAndView");
		
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		
		mv.addObject("list",testList);
		
		logger.trace("Trace ================");
		logger.debug("Debug ================");
		logger.info("Info ================");
		logger.warn("Warn ================");
		logger.error("Error ================");
		
		return mv;
	}
}
