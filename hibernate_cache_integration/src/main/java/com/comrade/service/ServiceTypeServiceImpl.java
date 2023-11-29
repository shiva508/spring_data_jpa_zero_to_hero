package com.pool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.dao.ServiceTypeRepository;
import com.pool.model.ServiceType;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
	@Autowired
	private ServiceTypeRepository serviceTypeRepository;

	@Transactional
	public ServiceType saveService(ServiceType serviceType) {
		return serviceTypeRepository.saveService(serviceType);
	}

	@Transactional
	public List<ServiceType> allServices() {
		return serviceTypeRepository.allServices();
	}

	@Transactional
	public ServiceType getServiceTypeById(Integer serviceId) {
		return serviceTypeRepository.getServiceTypeById(serviceId);
	}

	@Transactional
	public ServiceType getServiceTypeByServiceName(String serviceName) {
		return serviceTypeRepository.getServiceTypeByServiceName(serviceName);
	}

	@Transactional
	public ServiceType updateServiceType(ServiceType serviceType) {
		return serviceTypeRepository.saveService(serviceType);
	}

	@Transactional
	public ServiceType deleteServiceType(Integer serviceId) {
		return serviceTypeRepository.deleteServiceType(serviceId);
	}

}
