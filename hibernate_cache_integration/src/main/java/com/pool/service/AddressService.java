package com.shiva.service;

import java.util.List;

import com.shiva.model.Address;

public interface AddressService {
	public Address createAddress(Address address);
	public Address updateAddress(Address address);
	public Address deleteAddress(Integer addressId);
	public List<Address> AllAddress();
	public Address AddressById(Integer addressId);
}
