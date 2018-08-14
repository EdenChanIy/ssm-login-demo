package service;

import javax.annotation.Resource;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import pojo.User;

@Service("UserService")
public class UserServiceImpl  implements UserService{
	
	@Resource
	private UserDao userDao;
	
	public User checkLogin(String username, String password) {
		User user = userDao.findUserByName(username, password);
		if(user!=null) {
			return user;
		}
		return null;
	}
	
	public void userRegister(String username, String password) {
		userDao.addUser(username, password);
	}
}
