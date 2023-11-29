package com.pool.config;

import com.pool.form.AddressForm;
import com.pool.form.AddressTypeForm;
import com.pool.form.ElectricianForm;
import com.pool.form.ServiceTypeForm;
import com.pool.model.Address;
import com.pool.model.AddressType;
import com.pool.model.Electrician;
import com.pool.model.ServiceType;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;

public class FormDomineMapper {
	private MapperFactory formToDomineMApperFactory = null;

	public FormDomineMapper(MapperFactory mapperFactory) {
		this.formToDomineMApperFactory = mapperFactory;
		ConverterFactory converterFactory = formToDomineMApperFactory.getConverterFactory();
		mapElectrician();
		mapServiceType();
		mapAddressType();
		mapAddress();
	}

	private void mapAddress() {
		formToDomineMApperFactory.classMap(Address.class, AddressForm.class).field("addressId", "addressId")
				.field("address", "address")
				.field("pinCode", "pinCode")
				.field("city", "city")
				.field("location", "location")
				.field("addressType", "addressType")
				.field("addressType", "addressType")
				.byDefault()
				.register();

	}

	private void mapAddressType() {
		formToDomineMApperFactory.classMap(AddressType.class, AddressTypeForm.class)
				.field("addressTypeId", "addressTypeId")
				.field("addressType", "addressType")
				.byDefault()
				.register();
	}

	private void mapServiceType() {
		formToDomineMApperFactory.classMap(ServiceType.class, ServiceTypeForm.class).field("serviceId", "serviceId")
				.field("serviceId", "serviceId")
				.field("serviceType", "serviceType")
				.byDefault()
				.register();
	}

	public void mapElectrician() {
		formToDomineMApperFactory.classMap(Electrician.class, ElectricianForm.class)
				.field("technicianId", "technicianId")
				.field("electricianFirstName", "electricianFirstName")
				.field("electricianLastName", "electricianLastName")
				.field("addresslist", "addresslist")
				.field("serviceType", "serviceType")
				.byDefault()
				.register();
	}
}
