package com.pool.dao;

import java.util.List;

import com.pool.model.ServiceType;

public interface ServiceTypeRepository {
	public ServiceType saveService(ServiceType serviceType);
	public List<ServiceType> allServices();
	public ServiceType getServiceTypeById(Integer serviceId);
	public ServiceType getServiceTypeByServiceName(String serviceName);
	public ServiceType updateServiceType(ServiceType serviceType);
	public ServiceType deleteServiceType(Integer serviceId);
}
