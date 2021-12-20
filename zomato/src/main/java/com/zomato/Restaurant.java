package com.zomato.model;

import com.zomato.entity.Category;
import com.zomato.entity.Rating;

public class Restaurant {
	private String res_name;
	private String res_detail;
	private Rating res_rating;
	private Category res_category;
	public Restaurant() {
		super();
	}
	public Restaurant(String res_name, String res_detail, Rating res_rating,
			Category res_category) {
		super();
		this.res_name = res_name;
		this.res_detail = res_detail;
		this.res_rating = res_rating;
		this.res_category = res_category;
	}
	public String getRes_name() {
		return res_name;
	}
	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}
	public String getRes_detail() {
		return res_detail;
	}
	public void setRes_detail(String res_detail) {
		this.res_detail = res_detail;
	}
	public Rating getRes_rating() {
		return res_rating;
	}
	public void setRes_rating(Rating res_rating) {
		this.res_rating = res_rating;
	}
	public Category getRes_category() {
		return res_category;
	}
	public void setRes_category(Category res_category) {
		this.res_category = res_category;
	}
	@Override
	public String toString() {
		return "Restaurant [res_name=" + res_name + ", res_detail=" + res_detail + ", res_rating=" + res_rating
				+ ", res_category=" + res_category + "]";
	}
}