package com.ssm.dao;

public interface AccountDao {
	
	void addAccount(String name,double money);
	
	void updateAccount(String name,double money,boolean isbuy);

}
