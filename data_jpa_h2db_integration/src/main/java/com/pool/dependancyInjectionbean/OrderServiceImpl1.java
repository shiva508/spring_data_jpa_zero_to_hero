package com.pool.dependancyInjectionbean;

public class OrderServiceImpl1 implements OrderService {
	
	@Override
	public String getOrderDetails(String orderid) {
		
		return "Order details from impl 1, for order id=" + orderid;
	}
}
