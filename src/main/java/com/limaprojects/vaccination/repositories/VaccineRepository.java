package com.limaprojects.vaccination.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaprojects.vaccination.entities.Vaccine;

public interface VaccineRepository extends JpaRepository<Vaccine, Long> {

}
