package com.comrade.service.scan;

import java.util.List;

import com.comrade.domine.Scan;

public interface ScanService {
	public Scan saveScan(Scan scan);

	public Scan updateScan(Scan scan);

	public List<Scan> getAllScans();
}
