package com.zomato.model;

import com.zomato.entity.User;

public class Cart {
	private User user;
	private int product_quantity;
	private double cart_price;
	public Cart() {
		super();
	}
	public Cart(User user, int product_quantity, double cart_price) {
		super();
		this.user = user;
		this.product_quantity = product_quantity;
		this.cart_price = cart_price;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	public double getCart_price() {
		return cart_price;
	}
	public void setCart_price(double cart_price) {
		this.cart_price = cart_price;
	}
	@Override
	public String toString() {
		return "Cart [user=" + user + ", product_quantity=" + product_quantity + ", cart_price=" + cart_price + "]";
	}
}