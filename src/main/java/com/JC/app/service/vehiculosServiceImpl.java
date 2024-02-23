package com.JC.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.JC.app.model.vehiculosModel;
import com.JC.app.repository.vehiculosRepository;

public class vehiculosServiceImpl implements vehiculosService{

	@Autowired
	private vehiculosRepository  vehiculosRepo;
	
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<vehiculosModel> findAll() {
		// TODO Auto-generated method stub
		return vehiculosRepo.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<vehiculosModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<vehiculosModel> findById(Long id) {
		// TODO Auto-generated method stub
		return vehiculosRepo.findById(id);
	}

	@Override
	@Transactional
	public vehiculosModel save(vehiculosModel v) {
		// TODO Auto-generated method stub
		return vehiculosRepo.save(v);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		vehiculosRepo.deleteById(id);		
	}

}
