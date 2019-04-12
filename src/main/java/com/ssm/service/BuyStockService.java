package com.ssm.service;

import com.ssm.utils.BuyStockException;

public interface BuyStockService {
	
	public void addAccount(String accountname, double money);
	
	public void addStock(String stockname, int amount);
	
	public void buyStock(String accountname, double money, String stockname, int amount) throws BuyStockException;

}
