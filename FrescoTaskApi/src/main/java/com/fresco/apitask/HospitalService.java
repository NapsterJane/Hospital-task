package com.fresco.apitask;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
	
	@Autowired
	private HospitalRepository hospitalRepository;


	public List<Hospital> getAllHospitals(){
		List<Hospital> hospitalList = new ArrayList<Hospital>();
		hospitalRepository.findAll().forEach(hospitalList :: add);
		return hospitalList;
	}
	
	public Hospital getHospital(int id){
		return hospitalRepository.findHospitalById(id);
	}
	
	public void addHospital(Hospital hospital){
		hospitalRepository.save(hospital);
	}
	
	public void updateHospital(Hospital hospital){
		hospitalRepository.save(hospital);
	}
	
	public void deleteHospital(Hospital hospital) {
		hospitalRepository.delete(hospital);
	}
}
