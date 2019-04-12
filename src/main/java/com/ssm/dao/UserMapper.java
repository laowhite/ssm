package com.ssm.dao;

import com.ssm.entity.User;
import com.ssm.entity.UserD;

public interface UserMapper {
	User getUserById(int i);
	
	void insert(UserD user);
	
	void updateUser(UserD user);
}
