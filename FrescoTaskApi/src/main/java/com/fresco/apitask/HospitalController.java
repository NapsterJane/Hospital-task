package com.fresco.apitask;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;
    
    @GetMapping("/hospitals/{id}")
	public @ResponseBody Hospital getHospital(@PathVariable("id") int id) throws Exception {
        return (hospitalService.getHospital(id));
    }
	
    @GetMapping("/hospitals")
	public @ResponseBody List<Hospital> getAllHospitals() throws Exception {
		return (hospitalService.getAllHospitals());
    }
	
    @PostMapping("/hospitals/")
	public ResponseEntity<String> addHospital(@RequestBody Hospital hospital  ) {
    	hospitalService.addHospital(hospital);
    	return new ResponseEntity<String>(HttpStatus.OK);
	}
	
    @PutMapping("/hospitals/")
	public ResponseEntity<String> updateHospital(@RequestBody Hospital hospital) {
    	hospitalService.updateHospital(hospital);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
    @PutMapping("/hospitals/")
	public ResponseEntity<String> deleteHospital(@RequestBody Hospital hospital) {
		hospitalService.deleteHospital(hospital);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}	
