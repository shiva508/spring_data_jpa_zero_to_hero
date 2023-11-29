package com.pool.form;

import java.util.ArrayList;
import java.util.List;

public class ElectricianForm {

	private Integer technicianId;

	private String electricianFirstName;

	private String electricianLastName;
	public List<AddressForm> addresslist = new ArrayList<AddressForm>();

	public ServiceTypeForm serviceType;

	public ElectricianForm() {
	}

	public Integer getTechnicianId() {
		return technicianId;
	}

	public void setTechnicianId(Integer technicianId) {
		this.technicianId = technicianId;
	}

	public String getElectricianFirstName() {
		return electricianFirstName;
	}

	public void setElectricianFirstName(String electricianFirstName) {
		this.electricianFirstName = electricianFirstName;
	}

	public String getElectricianLastName() {
		return electricianLastName;
	}

	public void setElectricianLastName(String electricianLastName) {
		this.electricianLastName = electricianLastName;
	}

	public List<AddressForm> getAddresslist() {
		return addresslist;
	}

	public void setAddresslist(List<AddressForm> addresslist) {
		this.addresslist = addresslist;
	}

	public ServiceTypeForm getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceTypeForm serviceType) {
		this.serviceType = serviceType;
	}

	@Override
	public String toString() {
		return "Electrician [technicianId=" + technicianId + ", electricianFirstName=" + electricianFirstName
				+ ", electricianLastName=" + electricianLastName + ", addresslist=" + addresslist + ", serviceType="
				+ serviceType + "]";
	}

}
