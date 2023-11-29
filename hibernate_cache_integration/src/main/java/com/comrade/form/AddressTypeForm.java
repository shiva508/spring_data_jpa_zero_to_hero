package com.pool.form;


public class AddressTypeForm {
	
	private Integer addressTypeId;
	private String addressType;

	public AddressTypeForm() {
	}

	public Integer getAddressTypeId() {
		return addressTypeId;
	}

	public void setAddressTypeId(Integer addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	@Override
	public String toString() {
		return "AddressTypeForm [addressTypeId=" + addressTypeId + ", addressType=" + addressType + "]";
	}

}
