package com.pool.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pool.form.ElectricianForm;
import com.pool.model.Electrician;
import com.pool.service.ElectricianService;

@RestController
public class ElectricianController {
	@Autowired
	private ElectricianService electricianService;

	@PostMapping(value = "/createElectrician", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Electrician createElectrician(@RequestBody ElectricianForm electrician) {
		return electricianService.createElectrician(electrician);
	}

	@PutMapping(value = "/updateElectrician", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Electrician updateElectrician(@RequestBody ElectricianForm electrician) {
		return electricianService.updateElectrician(electrician);
	}

	@DeleteMapping(value = "/deleteElectrician/{electricianId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Electrician deleteElectrician(@PathVariable("electricianId") Integer electricianId) {
		return electricianService.deleteElectrician(electricianId);
	}

	@GetMapping(value = "/allElectricians", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<ElectricianForm> AllElectricians() {
		return electricianService.AllElectricians();
	}

	@GetMapping(value = "/electricianById/{electricianId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Electrician electricianById(@PathVariable("electricianId") Integer electricianId) {
		return electricianService.electricianById(electricianId);
	}

}
