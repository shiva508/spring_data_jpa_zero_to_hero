package com.shiva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shiva.dao.AddressRepository;
import com.shiva.model.Address;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository addressRepository;
	@Transactional
	public Address createAddress(Address address) {
		return addressRepository.createAddress(address);
	}
	@Transactional
	public Address updateAddress(Address address) {
		return addressRepository.updateAddress(address);
	}
	@Transactional
	public Address deleteAddress(Integer addressId) {
		return addressRepository.deleteAddress(addressId);
	}
	@Transactional
	public List<Address> AllAddress() {
		return addressRepository.AllAddress();
	}
	@Transactional
	public Address AddressById(Integer addressId) {
		return addressRepository.AddressById(addressId);
	}

}
