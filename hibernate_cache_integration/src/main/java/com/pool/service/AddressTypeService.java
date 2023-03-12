package com.shiva.service;

import java.util.List;

import com.shiva.model.AddressType;

public interface AddressTypeService {
	public AddressType createAddressType(AddressType addressType);
	public AddressType updateAddressType(AddressType addressType);
	public AddressType deleteAddressType(Integer addressTypeId);
	public List<AddressType> AllAddressType();
	public AddressType AddressTypeById(Integer addressTypeId);
}
