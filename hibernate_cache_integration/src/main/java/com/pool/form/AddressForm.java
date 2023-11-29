package com.pool.form;

public class AddressForm {

	private Integer addressId;
	private String address;
	private String pinCode;
	private String city;
	private String location;
	private AddressTypeForm addressType;

	public AddressForm() {

	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AddressTypeForm getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressTypeForm addressType) {
		this.addressType = addressType;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "AddressForm [addressId=" + addressId + ", address=" + address + ", pinCode=" + pinCode + ", city="
				+ city + ", location=" + location + ", addressType=" + addressType + "]";
	}

}
