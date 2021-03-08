package com.limaprojects.vaccination.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.limaprojects.vaccination.entities.Vaccine;

public class VaccineDto {

	@NotEmpty(message = "O campo nome é uma informação obrigatória")
	private String name;

	@JsonFormat(pattern = "dd-MM-yyyy")
	@NotNull(message = "O campo data da vacinação é uma informação obrigatória")
	private LocalDate vaccineDay;

	@NotEmpty(message = "O campo email é uma informação obrigatória")
	private String emailUser;

	public VaccineDto() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getVaccineDay() {
		return vaccineDay;
	}

	public void setVaccineDay(LocalDate vaccineDay) {
		this.vaccineDay = vaccineDay;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public Vaccine toVaccine() {
		Vaccine vaccine = new Vaccine();

		vaccine.setName(this.name);
		vaccine.setVaccineDay(vaccineDay);
		vaccine.setEmailUser(emailUser);

		return vaccine;
	}

}
