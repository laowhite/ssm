package com.ssm.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ssm.dao.StockDao;

public class StockDaoImpl extends JdbcDaoSupport  implements StockDao{

//	@Override
	public void addStock(String sname, int count) {
		String sql = "insert into stock(name,count) values(?,?)";
		this.getJdbcTemplate().update(sql,sname,count);
	}
 
//	@Override
	public void updateStock(String sname, int count, boolean isbuy) {
		String sql = "update stock set count = count-? where name = ?";
		if(isbuy)
			sql = "update stock set count = count+? where name = ?";
		this.getJdbcTemplate().update(sql, count,sname);
	}
}
