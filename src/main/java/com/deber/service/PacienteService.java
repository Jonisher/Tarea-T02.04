package com.deber.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deber.repository.PacienteRepository;

public class PacienteService {

	@Autowired
    private PacienteRepository pacienteRepository;

}
