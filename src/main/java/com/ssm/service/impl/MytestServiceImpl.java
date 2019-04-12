package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.dao.UserDMapper;
import com.ssm.dao.UserMapper;
import com.ssm.entity.UserD;
import com.ssm.service.MytestService;

@Service("mytestService")

public class MytestServiceImpl implements MytestService{
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserDMapper userdMapper;
	
	@Transactional //(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int insert() {
		
//		try {
			// TODO Auto-generated method stub
			UserD user = new UserD();
			user.setId("1");
			user.setName("康熙2");
			user.setAge(22);
			user.setPassword("123");
			userMapper.insert(user);
		
			UserD user1 = new UserD();
			user1.setName("乾隆1");
			user1.setAge(11);
			user1.setPassword("123");
			userdMapper.insert(user1);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Exception-------------------");
//		}
		return 1;
		
		
	}

}
