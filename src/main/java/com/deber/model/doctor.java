package com.deber.model;

import java.sql.Date;

public class doctor extends usuario{

	 private String especialidad;
	 private int numLicencia;
	 private Date horarios;
	 
	 //public doctor() {super()}

	    // Constructor con parámetros
	    public doctor(String nombre, String especialidad, String correo) {
	    	super(nombre, correo); // Llama al constructor de la clase padre
	        this.especialidad = especialidad;
	    }
	 
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getNumLicencia() {
		return numLicencia;
	}
	public void setNumLicencia(int numLicencia) {
		this.numLicencia = numLicencia;
	}
	public Date getHorarios() {
		return horarios;
	}
	public void setHorarios(Date horarios) {
		this.horarios = horarios;
	}
	 
	// Métodos
    public void verHistorialMedicoPaciente() {
        // Lógica para ver historial médico del paciente
    }

    public void generarRecetaMedica() {
        // Lógica para generar receta médica
    }

    public void ingresarDatosPaciente() {
        // Lógica para ingresar datos del paciente
    }
    
    @Override
    public String toString() {
        return "Doctor [nombre=" + getNombre() + ", correo=" + getCorreo() + ", especialidad=" + especialidad + "]";
    }
}
