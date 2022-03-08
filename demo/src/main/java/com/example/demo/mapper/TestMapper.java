package com.example.demo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.vo.TestVO;
import org.apache.ibatis.annotations.Mapper;

@Repository
@Mapper
public interface TestMapper {

	List<TestVO> selectTest();
}
