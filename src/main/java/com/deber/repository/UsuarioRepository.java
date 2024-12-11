package com.deber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deber.model.usuario;

public interface UsuarioRepository extends JpaRepository<usuario, Long>{
	

}
