package com.zomato.model;

public class User {
	private String name;
	private String phoneno;
	private String email;
	private String password;
	private String address;
	public User() {
		super();
	}
	public User(String name, String phoneno, String email, String password, String address) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
		this.password = password;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", phoneno=" + phoneno + ", email=" + email + ", password=" + password
				+ ", address=" + address + "]";
	}
}
