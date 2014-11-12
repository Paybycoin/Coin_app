package com.paybycoin.domain;

public class Merchant {

	private String merchant;
    private final String uuid;
    private final String location;
    private String address;
    private String phone;

    public Merchant(String id, String content) {
        this.uuid = id;
        this.location = content;
    }

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public String getUuid() {
		return uuid;
	}

	public String getLocation() {
		return location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}