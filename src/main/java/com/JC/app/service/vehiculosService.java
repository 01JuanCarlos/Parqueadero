package com.JC.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.JC.app.model.vehiculosModel;

public interface vehiculosService {

	public Iterable<vehiculosModel> findAll();
	
	public Page<vehiculosModel> findAll(Pageable pageable);
	
	public Optional<vehiculosModel> findById(Long id);
	
	public vehiculosModel save(vehiculosModel v);
	
	public void deleteById(Long id);
}
