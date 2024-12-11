package com.deber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deber.model.doctor;

public interface DoctorRepository extends JpaRepository<doctor, Long>{

}
