package com.limaprojects.vaccination.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.limaprojects.vaccination.entities.User;

public class UserDto {

	@NotEmpty(message = "O campo nome é uma informação obrigatória")
	private String name;

	@NotEmpty(message = "O campo email é uma informação obrigatória")
	private String email;

	@NotEmpty(message = "O campo cpf é uma informação obrigatória")
	private String cpf;

	@JsonFormat(pattern = "dd-MM-yyyy")
	@NotNull(message = "O campo data de nascimento é uma informação obrigatória")
	private LocalDate birthDay;

	public UserDto() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getBirthday() {
		return birthDay;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthDay = birthday;
	}

	public User toUser() {
		User user = new User();
		user.setName(this.name);
		user.setEmail(this.email);
		user.setCpf(this.cpf);
		user.setBirthDay(this.birthDay);

		return user;
	}

}
