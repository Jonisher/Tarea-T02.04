package com.deber.service;

import com.deber.model.doctor;
import com.deber.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class DoctorService {

	private final DoctorRepository doctorRepository;

    // Constructor para inyección de dependencias (por ejemplo, por Spring o en el test)
    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public doctor createDoctor(doctor doctor) {
        // Validar datos necesarios
        if (doctor.getNombre() == null || doctor.getCorreo() == null || doctor.getEspecialidad() == null) {
            throw new IllegalArgumentException("El nombre, correo y especialidad son obligatorios.");
        }

        if (doctor.getNumLicencia() <= 0) {
            throw new IllegalArgumentException("El número de licencia debe ser mayor a 0.");
        }

        // Guardar doctor en el repositorio
        return doctorRepository.save(doctor);
    }
}
