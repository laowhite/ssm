package com.ssm.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.service.BuyStockService;
import com.ssm.utils.BuyStockException;

public class TransactionTest {
	
	public static void main(String[] args) {
		String resouce = "transaction/test2/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(resouce);
		BuyStockService buyStockService =  (BuyStockService) applicationContext.getBean("serviceProxy");
 
//		buyStockService.openAccount("小郑", 5000);
		
//		buyStockService.openStock("知晓科技", 0);
		
		try {
			buyStockService.buyStock("小郑", 1000, "知晓科技", 100);
		} catch (BuyStockException e) {
			e.printStackTrace();
		}

	}
}
