package com.ssm.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ssm.dao.AccountDao;


public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

//	@Override
	public void addAccount(String name, double money) {
		String sql = "insert account(name,balance) values(?,?);";
		this.getJdbcTemplate().update(sql,name,money);
		
	}
 
//	@Override
	public void updateAccount(String name, double money, boolean isbuy) {
		String sql = "update account set balance=balance+? where name=?";
		if(isbuy)
			sql = "update account set balance=balance-? where name=?";
		this.getJdbcTemplate().update(sql, money,name);
	}
	

}
