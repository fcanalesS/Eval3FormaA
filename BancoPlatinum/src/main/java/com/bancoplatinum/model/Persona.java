package com.bancoplatinum.model;

import java.util.Date;

public class Persona {
	public String Rut;
	public String Nombre;
	public String Apellido;
	public int Telefono;
	public Date FechaIngreso;  
	
	
	
	public Persona(String rut, String nombre, String apellido, int telefono, Date fechaIngreso) {
		super();
		Rut = rut;
		Nombre = nombre;
		Apellido = apellido;
		Telefono = telefono;
		FechaIngreso = fechaIngreso;
	}



	public String getRut() {
		return Rut;
	}



	public void setRut(String rut) {
		Rut = rut;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getApellido() {
		return Apellido;
	}



	public void setApellido(String apellido) {
		Apellido = apellido;
	}



	public int getTelefono() {
		return Telefono;
	}



	public void setTelefono(int telefono) {
		Telefono = telefono;
	}



	public Date getFechaIngreso() {
		return FechaIngreso;
	}



	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}



	public Persona() {
		// TODO Auto-generated constructor stub
	}
}
