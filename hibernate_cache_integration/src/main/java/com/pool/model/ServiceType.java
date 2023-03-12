package com.shiva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ServiceType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SERVICE_ID")
	private Integer serviceId;
	@Column(name="SERVICE_TYPE")
	private String serviceType;

	public ServiceType() {
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	@Override
	public String toString() {
		return "ServiceType [serviceId=" + serviceId + ", serviceType=" + serviceType + "]";
	}

}
