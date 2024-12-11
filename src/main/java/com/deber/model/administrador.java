package com.deber.model;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class administrador extends usuario{

	
	
	
	public administrador(String nombre, String correo) {
		super(nombre, correo);
	}

	// Métodos
    public void crearUsuario() {
        // Lógica para crear un usuario
    }

    public void asignarRol() {
        // Lógica para asignar un rol al usuario
    }

    public void generarFicha() {
        // Lógica para generar ficha de usuario
    }

    public void clasificarIngresos() {
        // Lógica para clasificar ingresos
    }

    public void clasificarEgresos() {
        // Lógica para clasificar egresos
    }
}
