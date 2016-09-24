package com.study.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.study.dao.ClActionStrategyDao;
import com.study.mapper.ClActionStrategyMapper;
import com.study.model.ClActionStrategy;
import com.study.model.ClActionStrategyExample;

@Component
public class ClActionStrategyDaoImpl implements ClActionStrategyDao {
	
	@Autowired
	private ClActionStrategyMapper actionMapper;
	
	@Override
	public List<ClActionStrategy> getAllAction() {
		ClActionStrategyExample example = new ClActionStrategyExample();
		return actionMapper.selectByExample(example);
	}

}
