package com.pool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.dao.AddressTypeRepository;
import com.pool.model.AddressType;

@Service
public class AddressTypeServiceImpl implements AddressTypeService {
	@Autowired
	private AddressTypeRepository addressTypeRepository;
	@Transactional
	public AddressType createAddressType(AddressType addressType) {
		return addressTypeRepository.createAddressType(addressType);
	}

	@Transactional
	public AddressType updateAddressType(AddressType addressType) {
		return addressTypeRepository.updateAddressType(addressType);
	}

	@Transactional
	public AddressType deleteAddressType(Integer addressTypeId) {
		return addressTypeRepository.deleteAddressType(addressTypeId);
	}

	@Transactional
	public List<AddressType> AllAddressType() {
		return addressTypeRepository.AllAddressType();
	}

	@Transactional
	public AddressType AddressTypeById(Integer addressTypeId) {
		return addressTypeRepository.AddressTypeById(addressTypeId);
	}

}
