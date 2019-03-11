package cn.wxm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wxm.mapper.UserMapper;
import cn.wxm.pojo.User;
import cn.wxm.service.UserService;

@Service //业务层接口
@Transactional//所有方法都受事务控制
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);

	}

	@Override
	public List<User> findAll() {
		List<User> list = userMapper.findAll();
		return list;
	}

	@Override
	public User findUserById(Integer id) {
		User user = this.userMapper.findUserById(id);
		return user;
	}

	@Override
	public void updateUser(User user) {
		this.userMapper.updateUser(user);
		
	}

	@Override
	public int deleteUserById(User user) {
		return this.userMapper.deleteUserById(user);
	}

}
