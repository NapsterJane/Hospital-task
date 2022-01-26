package com.fresco.apitask;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Integer>{
	
	public Hospital findHospitalById(Integer id);

}
