package com.ljj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.ljj.dao.UserMapper;
import com.ljj.model.User;
import com.ljj.service.IUserService;

/**
* @author LJJ
* @version 
* @since 2017年3月25日 上午11:27:55
*
*/
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getUser(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return userMapper.selectAll();
	}
	
	

}
