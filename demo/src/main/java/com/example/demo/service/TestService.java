package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.vo.TestVO;

@Service
public class TestService {
	
	@Autowired
	public TestMapper mapper;
	
	public List<TestVO> selectTest()
	{
		return mapper.selectTest();
	}

}
