package com.ljj.service;

import java.util.List;

import com.ljj.model.User;

/**
* @author LJJ
* @version 
* @since 2017年3月25日 上午11:26:34
*
*/
public interface IUserService {
	List<User> getUser(Integer pageNum,Integer pageSize);
}
