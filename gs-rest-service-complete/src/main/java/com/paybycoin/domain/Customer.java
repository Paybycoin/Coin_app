package com.paybycoin.domain;

import java.util.Date;

public class Customer {

	private String name;
	private String email;
	private String phone;
	private String userId;
	private String password;
	private String location;
	private String Card_Num;
	private String bank;
	private String cardType;
	private Date exp_Date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCard_Num() {
		return Card_Num;
	}
	public void setCard_Num(String card_Num) {
		Card_Num = card_Num;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Date getExp_Date() {
		return exp_Date;
	}
	public void setExp_Date(Date exp_Date) {
		this.exp_Date = exp_Date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
