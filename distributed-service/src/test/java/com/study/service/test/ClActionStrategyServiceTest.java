package com.study.service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.service.ClActionStrategyService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"classpath*:spring/*.xml"})
public class ClActionStrategyServiceTest {
	
	@Autowired
	private ClActionStrategyService clActionStrategyService;
	
	@Test
	public void test(){
		System.out.println(clActionStrategyService.getAllAction().get(0).getCreatePerson());
	}
}
