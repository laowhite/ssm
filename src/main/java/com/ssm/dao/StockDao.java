package com.ssm.dao;

public interface StockDao {
	
	void addStock(String sname,int count);
	
	void updateStock(String sname,int count,boolean isbuy);

}
