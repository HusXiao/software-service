package org.example.service;

import org.example.po.User;
import org.apache.ibatis.annotations.Select;

public interface UserService {

	@Select("select * from user where userId=#{user.userId}")
	public User getUserByIdByPass(User user);

	public int getUserById(String userId);

	public int saveUser(User user);
}
