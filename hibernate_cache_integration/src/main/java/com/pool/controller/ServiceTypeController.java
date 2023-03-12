package com.shiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.model.ServiceType;
import com.shiva.service.ServiceTypeService;
@RestController
public class ServiceTypeController {
	@Autowired
	private ServiceTypeService serviceTypeService;
	@PostMapping(value="/saveSevice",produces = { MediaType.APPLICATION_JSON_VALUE})
	public ServiceType saveService(@RequestBody ServiceType serviceType) {
		return serviceTypeService.saveService(serviceType);
	}
	@GetMapping(value="/allServices",produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<ServiceType> allServices(){
		return serviceTypeService.allServices();
	}
	@GetMapping(value="/serviceById/{serviceId}",produces = { MediaType.APPLICATION_JSON_VALUE})
	public ServiceType getServiceTypeById(@PathVariable("serviceId")Integer serviceId) {
		return serviceTypeService.getServiceTypeById(serviceId);
	}
	@GetMapping(value="/serviceByName/{serviceName}",produces = { MediaType.APPLICATION_JSON_VALUE})
	public ServiceType getServiceTypeByServiceName(@PathVariable("serviceName") String serviceName) {
		return serviceTypeService.getServiceTypeByServiceName(serviceName);
	}
	@PutMapping(value="/updateServiceType",produces = { MediaType.APPLICATION_JSON_VALUE})
	public ServiceType updateServiceType(@RequestBody ServiceType serviceType) {
		return serviceTypeService.updateServiceType(serviceType);
	}
	public ServiceType deleteServiceType(@PathVariable("serviceId")Integer serviceId) {
		serviceTypeService.deleteServiceType(serviceId);
		return null;
	}
}
