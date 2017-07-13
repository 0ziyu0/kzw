package com.kzw.order.pojo;

import java.util.List;

import com.kzw.pojo.TbOrder;
import com.kzw.pojo.TbOrderItem;
import com.kzw.pojo.TbOrderShipping;

public class OrderInfo extends TbOrder {

	private List<TbOrderItem> orderItems;
	private TbOrderShipping orderShipping;
	
	public List<TbOrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<TbOrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public TbOrderShipping getOrderShipping() {
		return orderShipping;
	}
	public void setOrderShipping(TbOrderShipping orderShipping) {
		this.orderShipping = orderShipping;
	}
	public OrderInfo() {
		super();
	}
	public OrderInfo(List<TbOrderItem> orderItems, TbOrderShipping orderShipping) {
		super();
		this.orderItems = orderItems;
		this.orderShipping = orderShipping;
	}
	@Override
	public String toString() {
		return "OrderInfo [orderItems=" + orderItems + ", orderShipping="
				+ orderShipping + "]";
	}
	
}
