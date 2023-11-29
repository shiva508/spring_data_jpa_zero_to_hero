package com.pool.form;

public class ServiceTypeForm {
	private Integer serviceId;
	private String serviceType;

	public ServiceTypeForm() {
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
		return "ServiceTypeForm [serviceId=" + serviceId + ", serviceType=" + serviceType + "]";
	}

	

}
