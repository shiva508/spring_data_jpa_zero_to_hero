package com.shiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.model.AddressType;
import com.shiva.service.AddressTypeService;

@RestController
public class AddressTypeController {
	@Autowired
	private AddressTypeService addressTypeService;

	@PostMapping(value = "/createAddressType", produces = { MediaType.APPLICATION_JSON_VALUE })
	public AddressType createAddressType(@RequestBody AddressType addressType) {
		return addressTypeService.createAddressType(addressType);
	}

	@PutMapping(value = "/updateAddressType", produces = { MediaType.APPLICATION_JSON_VALUE })
	public AddressType updateAddressType(@RequestBody AddressType addressType) {
		return addressTypeService.updateAddressType(addressType);
	}

	@DeleteMapping(value = "/delateAddressType/{addressTypeId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public AddressType deleteAddressType(@PathVariable("addressTypeId") Integer addressTypeId) {
		return addressTypeService.deleteAddressType(addressTypeId);
	}

	@GetMapping(value = "/allAddressTypes", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<AddressType> AllAddressType() {
		return addressTypeService.AllAddressType();
	}

	@GetMapping(value = "/addressTypeById/{addressTypeId}")
	public AddressType AddressTypeById(@PathVariable("addressTypeId") Integer addressTypeId) {
		return addressTypeService.AddressTypeById(addressTypeId);
	}
}
