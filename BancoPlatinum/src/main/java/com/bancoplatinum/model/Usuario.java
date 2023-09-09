package com.bancoplatinum.model;

public class Usuario {
	public String Rut;
	public String username;
	public String password;
	public String getRut() {
		return Rut;
	}
	
	public void setRut(String rut) {
		this.Rut = rut;
	}
	@Override
	public String toString() {
		return "Usuario [Rut=" + Rut + ", username=" + username + ", password=" + password + "]";
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Usuario(String rut, String username, String password) {
		super();
		Rut = rut;
		this.username = username;
		this.password = password;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
}
