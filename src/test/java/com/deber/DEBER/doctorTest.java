package com.deber.DEBER;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.deber.model.doctor;
//import com.deber.model.Doctor;
import com.deber.repository.DoctorRepository;
import com.deber.service.DoctorService;

class doctorTest {

    @Mock
    private DoctorRepository doctorRepository;

    @InjectMocks
    private DoctorService doctorService;

    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Inicializar mocks
    }

    @Test
    void testCreateDoctor_Success() {
        // Crear un doctor de ejemplo
        doctor newDoctor = new doctor("John Doe", "john.doe@example.com", "Cardiología");

        // Simular el comportamiento del repositorio
        when(doctorRepository.save(newDoctor)).thenReturn(newDoctor);

        // Ejecutar el método de servicio
        doctor result = doctorService.createDoctor(newDoctor);

        // Verificar resultados
        assertNotNull(result);
        assertEquals("John Doe", result.getNombre());
        assertEquals("Cardiología", result.getEspecialidad());
        verify(doctorRepository, times(1)).save(newDoctor);
    }

    @Test
    void testCreateDoctor_InvalidData() {
        // Crear un doctor con datos inválidos
        doctor invalidDoctor = new doctor(null, null, "Cardiología");

        // Verificar que lanza una excepción
        assertThrows(IllegalArgumentException.class, () -> {
            doctorService.createDoctor(invalidDoctor);
        });

        // No se debe llamar al repositorio
        verify(doctorRepository, times(0)).save(invalidDoctor);
    }
}
