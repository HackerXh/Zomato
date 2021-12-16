package com.zomato.entity;

public class Order {
	private int order_id;
	public Order() {
		super();
	}
	public Order(int order_id) {
		super();
		this.order_id = order_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + "]";
	}
}
