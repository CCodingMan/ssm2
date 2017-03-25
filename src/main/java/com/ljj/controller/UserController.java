package com.ljj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljj.model.User;
import com.ljj.service.IUserService;

/**
* @author LJJ
* @version 
* @since 2017年3月25日 上午11:28:25
*
*/
@Controller
public class UserController {
    
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/all")
	public String getAll(ModelMap modelMap){
		List<User> user = userService.getUser(1, 5);
		modelMap.addAttribute("user", user);
		return "user";
	}
	
}
