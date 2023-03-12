package com.shiva.dao;

import java.util.List;

import com.shiva.model.Electrician;
public interface ElectricianRepository {
	public Electrician createElectrician(Electrician electrician);
	public Electrician updateElectrician(Electrician electrician);
	public Electrician deleteElectrician(Integer electricianId);
	public List<Electrician> AllElectricians();
	public Electrician electricianById(Integer electricianId);
}
