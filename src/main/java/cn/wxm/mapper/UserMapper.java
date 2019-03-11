package cn.wxm.mapper;


import java.util.List;

import cn.wxm.pojo.User;

public interface UserMapper {

	/**
	 * 添加用户
	 * @param user
	 */
	 void insertUser(User user);
	 
	 /**
	  * 查询所有用户
	  * @return
	  */
	 List<User> findAll();
	 
	 /**
	  * 根据id查询用户
	  * @param id
	  * @return
	  */
	 User findUserById(Integer id); 
	 
	 /**
	  * 更新用户
	  * @param user
	  */
	 void updateUser(User user);
	 
	 /**
	  * 删除用户
	  * @param user
	  * @return
	  */
	 int deleteUserById(User user);
	 
}
