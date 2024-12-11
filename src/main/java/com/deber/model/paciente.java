package com.deber.model;

import java.sql.Date;

public class paciente extends usuario{

	private String alergias;
    private Date fechaNacimiento;

    
    
    public paciente(String nombre, String correo) {
		super(nombre, correo);
		// TODO Auto-generated constructor stub
	}

	// Métodos
    public void verReceta() {
        // Lógica para ver la receta del paciente
    }

    public void verFactura() {
        // Lógica para ver la factura del paciente
    }
}
