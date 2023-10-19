package it.dedagroup.project_cea.service.impl;

import java.util.List;
import java.util.Optional;

import it.dedagroup.project_cea.exception.model.ScanNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dedagroup.project_cea.exception.model.NotValidDataException;
import it.dedagroup.project_cea.model.Scan;
import it.dedagroup.project_cea.repository.ScanRepository;
import it.dedagroup.project_cea.service.def.ScanServiceDef;

@Service
public class ScanServiceImpl implements ScanServiceDef {
	
	@Autowired
	ScanRepository scanRepo;

	@Override
	public Scan findById(long id) {
		return scanRepo.findById(id).orElseThrow(() -> new NotValidDataException("Scan not foud"));
	}

	@Override
	public List<Scan> findAll() {
		return scanRepo.findAll();
	}

	@Override
	public void addScan(Scan scan) {
		scanRepo.save(scan);
	}

	@Override
	public void removeScan(Scan scan) {
		scanRepo.findById(scan.getId()).orElseThrow(()->new ScanNotFoundException("Scan not found"));
		scan.setAvailable(false);
		scanRepo.save(scan);
	}

	@Override
	public void removeScanById(long id) {
		Scan sc = scanRepo.findById(id).orElseThrow(()->new ScanNotFoundException("Scan not found with ID: " + id));
		sc.setAvailable(false);
		scanRepo.save(sc);
	}
}
