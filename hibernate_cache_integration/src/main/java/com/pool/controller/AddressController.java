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

import com.shiva.model.Address;
import com.shiva.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	private AddressService  addressService;
	@PostMapping(value = "/createAddress", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Address createAddress(@RequestBody Address address) {
		return addressService.createAddress(address);
	}

	@PutMapping(value = "/updateAddress", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Address updateAddress(@RequestBody Address address) {
		return addressService.updateAddress(address);
	}

	@DeleteMapping(value = "/deleteAddress/{addressId}")
	public Address deleteAddress(@PathVariable("addressId") Integer addressId) {
		return addressService.deleteAddress(addressId);
	}

	@GetMapping(value = "/addresslist", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Address> AllAddress() {
		return addressService.AllAddress();
	}

	@GetMapping(value = "/addressById/{addressId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Address AddressById(@PathVariable("addressId") Integer addressId) {
		return addressService.AddressById(addressId);
	}

}
