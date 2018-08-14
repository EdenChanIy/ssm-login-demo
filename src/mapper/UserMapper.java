package mapper;

import pojo.User;

//定义数据库操作
public interface UserMapper {
	public void add(String username, String password);
	public User get(String username, String password);
}
