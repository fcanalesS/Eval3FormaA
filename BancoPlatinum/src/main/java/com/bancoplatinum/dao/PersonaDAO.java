package com.bancoplatinum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bancoplatinum.conexion.Conexion;
import com.bancoplatinum.model.Persona;
import com.bancoplatinum.model.Usuario;

public class PersonaDAO {
	private Connection connection;
	private PreparedStatement statement;
	private boolean estadoOperacion;
	
	public Persona obtenerPersona(String rut) throws SQLException {
		ResultSet resultSet = null;
		Persona persona = new Persona();
		
		
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			sql = "SELECT * FROM persona WHERE Rut =?";
			statement=connection.prepareStatement(sql);
			statement.setString(1, rut);
			
			resultSet = statement.executeQuery();
			
			if(resultSet.next()) {				
				persona.setRut(resultSet.getString(1));
				persona.setNombre(resultSet.getString(2));
				persona.setApellido(resultSet.getString(3));
				persona.setTelefono(resultSet.getInt(4));
				persona.setFechaIngreso(resultSet.getDate(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return persona;
	}
	
	private Connection obtenerConexion () throws SQLException {
		return Conexion.getConnection();
	}
}
