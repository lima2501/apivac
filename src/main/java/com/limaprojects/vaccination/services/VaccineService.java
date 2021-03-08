package com.limaprojects.vaccination.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limaprojects.vaccination.dto.VaccineDto;
import com.limaprojects.vaccination.entities.Vaccine;
import com.limaprojects.vaccination.repositories.VaccineRepository;

@Service
public class VaccineService {

	@Autowired
	VaccineRepository vaccineRepository;
	
	public Vaccine saveVaccine(VaccineDto vaccineDto) {
		
		Vaccine vaccine = vaccineDto.toVaccine();
		
		this.vaccineRepository.save(vaccine);
		
		return vaccine;
	}
	
}
