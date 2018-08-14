package service;

import pojo.User;

//业务逻辑实现
public interface UserService {
	User checkLogin(String username, String password);
	void userRegister(String username, String password);
}
