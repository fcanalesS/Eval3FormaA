package com.bancoplatinum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bancoplatinum.conexion.Conexion;
import com.bancoplatinum.model.Usuario;

public class UsuarioDAO {
	private Connection connection;
	private PreparedStatement statement;
	private boolean estadoOperacion;
	
	public boolean guardar(Usuario usuario) throws SQLException {
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		return true;
	}
	
	public boolean editar(Usuario usuario) throws SQLException {	
		return true;
	}
	
	public boolean eliminar(String rut) throws SQLException {	
		return true;
	}
	
	public Usuario leer(String rut) throws SQLException {	
		return new Usuario();
	} 
	
	public String obtenerUsuario(String u, String p) throws SQLException {
		ResultSet resultSet = null;
		Usuario user = new Usuario();
		
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			sql = "SELECT * FROM usuario WHERE username =? AND password=?";
			statement=connection.prepareStatement(sql);
			statement.setString(1, u);
			statement.setString(2, p);
			
			resultSet = statement.executeQuery();
			
			if(resultSet.next()) {				
				user.setRut(resultSet.getString(1));
				user.setUsername(resultSet.getString(2));
				user.setPassword(resultSet.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user.getRut();
		
		
	}
	
	private Connection obtenerConexion () throws SQLException {
		return Conexion.getConnection();
	}
	
}
