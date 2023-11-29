package com.pool.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pool.dao.ElectricianRepository;
import com.pool.form.AddressForm;
import com.pool.form.AddressTypeForm;
import com.pool.form.ElectricianForm;
import com.pool.model.Address;
import com.pool.model.AddressType;
import com.pool.model.Electrician;
import ma.glasnost.orika.MapperFacade;

@Service
public class ElectricianServiceImpl implements ElectricianService {
	@Autowired
	@Qualifier("formDomineMapperfaced")
	private MapperFacade formDomineMapperfaced;
	@Autowired
	private ElectricianRepository electricianRepository;

	@Transactional
	public Electrician createElectrician(ElectricianForm electricianForm) {
		Electrician electrician = formDomineMapperfaced.map(electricianForm, Electrician.class);
		populateFormToModel(electricianForm, electrician);
		return electricianRepository.createElectrician(electrician);
	}

	private void populateFormToModel(ElectricianForm electricianForm, Electrician electrician) {
		List<AddressForm> addressFormList = electricianForm.getAddresslist();
		electrician.getAddresslist().clear();
		if (addressFormList != null && addressFormList.size() > 0) {
			for (AddressForm addressForm : addressFormList) {
				Address address = formDomineMapperfaced.map(addressForm, Address.class);
				AddressTypeForm addressTypeForm = addressForm.getAddressType();
				AddressType addressType = formDomineMapperfaced.map(addressTypeForm, AddressType.class);
				address.setAddressType(addressType);
				electrician.addAddress(address);
			}
		}
	}

	@Transactional
	public Electrician updateElectrician(ElectricianForm electricianForm) {
		Electrician electrician = formDomineMapperfaced.map(electricianForm, Electrician.class);
		populateFormToModel(electricianForm, electrician);
		return electricianRepository.updateElectrician(electrician);
	}

	@Transactional
	public Electrician deleteElectrician(Integer electricianId) {
		return electricianRepository.deleteElectrician(electricianId);
	}

	@Transactional
	public List<ElectricianForm> AllElectricians() {
		List<Electrician> electricians = electricianRepository.AllElectricians();
		List<ElectricianForm> electricianForms=new ArrayList<ElectricianForm>();
		for (Electrician electrician : electricians) {
			ElectricianForm electricianForm = formDomineMapperfaced.map(electrician, ElectricianForm.class);
			List<Address> addresses = electrician.getAddresslist();
			List<AddressForm> addressForms=new ArrayList<AddressForm>();
			for (Address address : addresses) {
				AddressForm addressForm=formDomineMapperfaced.map(address, AddressForm.class);
				addressForms.add(addressForm);
			}
			electricianForm.setAddresslist(addressForms);
			electricianForms.add(electricianForm);
		}
		return electricianForms;
	}

	@Transactional
	public Electrician electricianById(Integer electricianId) {
		return electricianRepository.electricianById(electricianId);
	}

}
