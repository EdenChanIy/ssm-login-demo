package dao;


import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import mapper.UserMapper;
import pojo.User;

@Repository(value="userDao")
public class UserDaoImpl implements UserDao {
	@Resource(name="userMapper")
	private UserMapper userMapper;
	
	public User findUserByName(String username, String password) {
		return userMapper.get(username, password);
	}
	
	public void addUser(String username, String password) {
		userMapper.add(username, password);
	}
}
