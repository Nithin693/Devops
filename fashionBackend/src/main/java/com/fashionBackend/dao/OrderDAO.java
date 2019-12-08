package com.fashionBackend.dao;

import com.fashionBackend.model.OrderDetail;

public interface OrderDAO 
{
	public boolean payment(OrderDetail orderDetail);
	public boolean updateCartItemStatus(String username,int orderId);
}
