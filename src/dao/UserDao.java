package dao;

import pojo.User;

//实现数据操作对象接口
public interface UserDao {
	public User findUserByName(String username, String password);
	public void addUser(String username, String password);
}
