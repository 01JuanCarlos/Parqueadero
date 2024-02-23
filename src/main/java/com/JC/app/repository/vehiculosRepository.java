package com.JC.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.JC.app.model.vehiculosModel;

@Repository
public interface vehiculosRepository extends CrudRepository<vehiculosModel, Long> {

}
