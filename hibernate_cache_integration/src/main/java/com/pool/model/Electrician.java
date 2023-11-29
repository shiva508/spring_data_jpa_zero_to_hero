package com.pool.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "ELECTRICIAN")
public class Electrician {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TECHNICIAN_ID")
	private Integer technicianId;
	@Column(name = "TECHNICIAN_FIRST_NAME")
	private String electricianFirstName;
	@Column(name = "TECHNICIAN_LAST_NAME")
	private String electricianLastName;
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Address.class, fetch = FetchType.LAZY, mappedBy = "electrician", orphanRemoval = true)
	//@Fetch (FetchMode.SELECT)
	public List<Address> addresslist = new ArrayList<Address>();
	@OneToOne
	@JoinColumn(name = "SERVICE_TYPE")
	public ServiceType serviceType;

	public Electrician() {
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

	public List<Address> getAddresslist() {
		if (addresslist == null) {
			addresslist = new ArrayList<Address>();
		}
		return addresslist;
	}

	public void addAddress(Address address) {
		if (address != null) {
			address.setElectrician(this);
			getAddresslist().add(address);
		}
	}
	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	@Override
	public String toString() {
		return "Electrician [technicianId=" + technicianId + ", electricianFirstName=" + electricianFirstName
				+ ", electricianLastName=" + electricianLastName + ", addresslist=" + addresslist + ", serviceType="
				+ serviceType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((technicianId == null) ? 0 : technicianId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Electrician other = (Electrician) obj;
		if (technicianId == null) {
			if (other.technicianId != null)
				return false;
		} else if (!technicianId.equals(other.technicianId))
			return false;
		return true;
	}

}
