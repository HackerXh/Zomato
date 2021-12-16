package com.zomato.entity;

public class Product {
	private String product_name;
	private String product_detail;
	private Rating product_rating;
	private Category product_category;
	public Product() {
		super();
	}
	public Product(String product_name, String product_detail, Rating product_rating, Category product_category) {
		super();
		this.product_name = product_name;
		this.product_detail = product_detail;
		this.product_rating = product_rating;
		this.product_category = product_category;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_detail() {
		return product_detail;
	}
	public void setProduct_detail(String product_detail) {
		this.product_detail = product_detail;
	}
	public Rating getProduct_rating() {
		return product_rating;
	}
	public void setProduct_rating(Rating product_rating) {
		this.product_rating = product_rating;
	}
	public Category getProduct_category() {
		return product_category;
	}
	public void setProduct_category(Category product_category) {
		this.product_category = product_category;
	}
	@Override
	public String toString() {
		return "Product [product_name=" + product_name + ", product_detail=" + product_detail + ", product_rating="
				+ product_rating + ", product_category=" + product_category + "]";
	}
}
