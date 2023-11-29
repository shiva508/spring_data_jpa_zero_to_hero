package com.pool.service;

import java.util.List;

import com.pool.model.ServiceType;

public interface ServiceTypeService {
	public ServiceType saveService(ServiceType serviceType);
	public List<ServiceType> allServices();
	public ServiceType getServiceTypeById(Integer serviceId);
	public ServiceType getServiceTypeByServiceName(String serviceName);
	public ServiceType updateServiceType(ServiceType serviceType);
	public ServiceType deleteServiceType(Integer serviceId);
}
