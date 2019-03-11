package cn.wxm.service;

import java.util.List;

import cn.wxm.pojo.User;

public interface UserService {

	public void insertUser(User user);
	
	List<User> findAll();
	
	User findUserById(Integer id); 
	
	void updateUser(User user);
	
	int deleteUserById(User user);
}
