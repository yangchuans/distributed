package com.study.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.common.util.JsonUtil;
import com.study.model.ClActionStrategy;
import com.study.service.ClActionStrategyService;


@Controller
@RequestMapping(value = "/actionManage")
public class ActionController {
	
	@Autowired
	private ClActionStrategyService clActionStrategyService;
	
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	 public String page(HttpServletRequest httpServletRequest, Model model) {
		List<ClActionStrategy>  actions=clActionStrategyService.getAllAction();
		model.addAttribute("actions", JsonUtil.toJson(actions));
		return "test/action";
	 }

}
