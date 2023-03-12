package com.shiva.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADDRESS_ID")
	private Integer addressId;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "PINCODE")
	private String pinCode;
	@Column(name = "CITY")
	private String city;
	@Column(name = "LOCATION")
	private String location;
	@OneToOne
	@JoinColumn(name = "ADD_TYPE")
	private AddressType addressType;
	@ManyToOne
	@JoinColumn(name="TECHNICIAN_ID")
	private Electrician electrician;

	public Address() {

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

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
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

	public Electrician getElectrician() {
		return electrician;
	}

	public void setElectrician(Electrician electrician) {
		this.electrician = electrician;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address=" + address + ", addressType=" + addressType + "]";
	}

}
