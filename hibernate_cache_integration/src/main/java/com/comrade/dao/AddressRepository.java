package com.pool.dao;

import java.util.List;

import com.pool.model.Address;

public interface AddressRepository {
	public Address createAddress(Address address);
	public Address updateAddress(Address address);
	public Address deleteAddress(Integer addressId);
	public List<Address> AllAddress();
	public Address AddressById(Integer addressId);
}
