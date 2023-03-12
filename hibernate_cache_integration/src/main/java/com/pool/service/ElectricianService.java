package com.shiva.service;

import java.util.List;

import com.shiva.form.ElectricianForm;
import com.shiva.model.Electrician;

public interface ElectricianService {
	public Electrician createElectrician(ElectricianForm electrician);
	public Electrician updateElectrician(ElectricianForm electrician);
	public Electrician deleteElectrician(Integer electricianId);
	public List<ElectricianForm> AllElectricians();
	public Electrician electricianById(Integer electricianId);
}
