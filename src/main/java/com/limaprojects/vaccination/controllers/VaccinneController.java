package com.limaprojects.vaccination.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.limaprojects.vaccination.dto.VaccineDto;
import com.limaprojects.vaccination.entities.User;
import com.limaprojects.vaccination.entities.Vaccine;
import com.limaprojects.vaccination.services.VaccineService;

@RestController
@RequestMapping("/vaccine")
public class VaccinneController {

	@Autowired
	VaccineService service;

	@PostMapping
	public ResponseEntity<Vaccine> insert(@Valid @RequestBody VaccineDto vaccineDto, User user) {

		try {
			Vaccine vaccine = this.service.saveVaccine(vaccineDto);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(vaccine.getId())
					.toUri();
			return ResponseEntity.created(uri).body(vaccine);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}
}
