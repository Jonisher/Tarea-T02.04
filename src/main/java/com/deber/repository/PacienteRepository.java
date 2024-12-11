package com.deber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deber.model.paciente;

public interface PacienteRepository extends JpaRepository<paciente, Long>{

}
