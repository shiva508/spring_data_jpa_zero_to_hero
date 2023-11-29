package com.pool.service;

import java.util.List;

import com.pool.form.ElectricianForm;
import com.pool.model.Electrician;

public interface ElectricianService {
	public Electrician createElectrician(ElectricianForm electrician);
	public Electrician updateElectrician(ElectricianForm electrician);
	public Electrician deleteElectrician(Integer electricianId);
	public List<ElectricianForm> AllElectricians();
	public Electrician electricianById(Integer electricianId);
}
