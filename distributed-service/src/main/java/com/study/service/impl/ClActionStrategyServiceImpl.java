package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.ClActionStrategyDao;
import com.study.model.ClActionStrategy;
import com.study.service.ClActionStrategyService;

@Service
public class ClActionStrategyServiceImpl implements ClActionStrategyService{
	
	
	@Autowired
	private ClActionStrategyDao  clActionStrategyDao;
	
	@Override
	public List<ClActionStrategy> getAllAction() {
		return clActionStrategyDao.getAllAction();
	}

}
