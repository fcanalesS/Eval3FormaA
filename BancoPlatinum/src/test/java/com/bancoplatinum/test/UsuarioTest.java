package com.bancoplatinum.test;
import java.sql.SQLException;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bancoplatinum.dao.PersonaDAO;
import com.bancoplatinum.dao.UsuarioDAO;
import com.bancoplatinum.model.Usuario;
import com.bancoplatinum.model.Persona;

import static org.junit.Assert.*;


public class UsuarioTest {
	public UsuarioTest() {}
	@BeforeClass
	public static void setUpClass() {}
	
	@AfterClass
	public static void tearDownClass() {}
	
	@Before
	public void setUp() {}
	
	@After
	public void tearDown() {}
	
	@Test
	public void testUserNombre() {
		System.out.println("Usuario test nombre");
		String userRut = null;
		Persona persona = new Persona();
		try {
			UsuarioDAO userDAO = new UsuarioDAO();
			PersonaDAO personaDAO = new PersonaDAO();
			
			userRut = userDAO.obtenerUsuario("test1", "test123");
			persona = personaDAO.obtenerPersona(userRut);
			
			String nombrePersonaResult = "Persona2";
			String apellidoPersonaResult = "Apellido2";
			
			assertEquals("Nombre correcto", persona.getNombre(), nombrePersonaResult );
			System.out.println("Nombre encontrado correctamente...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException i) {
			System.out.println(i.getMessage());
			fail(i.getMessage());
		}
	}
	
	
	@Test
	public void testUserApellido() {
		System.out.println("Usuario test apellido");
		String userRut = null;
		Persona persona = new Persona();
		try {
			UsuarioDAO userDAO = new UsuarioDAO();
			PersonaDAO personaDAO = new PersonaDAO();
			
			userRut = userDAO.obtenerUsuario("test1", "test123");
			persona = personaDAO.obtenerPersona(userRut);
			
			String apellidoPersonaResult = "Apellido2";
			
			assertEquals("Apellido correcto", persona.getApellido(), apellidoPersonaResult );
			System.out.println("Apellido encontrado correctamente...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException i) {
			System.out.println(i.getMessage());
			fail(i.getMessage());
		}
	}
	
	@Test
	public void testUserNombre2() {
		System.out.println("Usuario test nombre");
		String userRut = null;
		Persona persona = new Persona();
		try {
			UsuarioDAO userDAO = new UsuarioDAO();
			PersonaDAO personaDAO = new PersonaDAO();
			
			userRut = userDAO.obtenerUsuario("test2", "test123");
			persona = personaDAO.obtenerPersona(userRut);
			
			String nombrePersonaResult = "Persona1";
			
			assertEquals("Nombre correcto", persona.getNombre(), nombrePersonaResult );
			System.out.println("Nombre encontrado correctamente...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException i) {
			System.out.println(i.getMessage());
			fail(i.getMessage());
		}
	}
	
	
	@Test
	public void testUserApellido2() {
		System.out.println("Usuario test apellido");
		String userRut = null;
		Persona persona = new Persona();
		try {
			UsuarioDAO userDAO = new UsuarioDAO();
			PersonaDAO personaDAO = new PersonaDAO();
			
			userRut = userDAO.obtenerUsuario("test2", "test123");
			persona = personaDAO.obtenerPersona(userRut);
			
			String apellidoPersonaResult = "Apellido1";
			
			assertEquals("Apellido correcto", persona.getApellido(), apellidoPersonaResult );
			System.out.println("Apellido encontrado correctamente...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException i) {
			System.out.println(i.getMessage());
			fail(i.getMessage());
		}
	}
	
	@Test
	public void testUserPersonaNoExiste() {
		System.out.println("Usuario test persona no existe");
		String userRut = null;
		Persona persona = new Persona();
		try {
			UsuarioDAO userDAO = new UsuarioDAO();
			PersonaDAO personaDAO = new PersonaDAO();
			
			userRut = "1-1";
			persona = personaDAO.obtenerPersona(userRut);
			
			assertEquals("Apellido correcto", persona.getApellido(), null );
			System.out.println("Apellido encontrado correctamente...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException i) {
			System.out.println(i.getMessage());
			fail(i.getMessage());
		}
	}
	
	
	@Test
	public void testUser1() {
		System.out.println("Probando Usuario 'test1' Clave 'test123'...");
		UsuarioDAO userDAO = new UsuarioDAO();
		
		String user = null;
		try {
			user = userDAO.obtenerUsuario("test1", "test123");
			String result = "1-8";
			
			assertEquals("Usuario existente", user, "1-8" );
			System.out.println("Usuario encontrado correctamente...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException i) {
			System.out.println(i.getMessage());
			fail(i.getMessage());
		}
	}
	
	@Test
	public void testUser2() {
		System.out.println("Probando Usuario 'test2' Clave 'test123'...");
		UsuarioDAO userDAO = new UsuarioDAO();
		
		String user = null;
		try {
			user = userDAO.obtenerUsuario("test2", "test123");
			String result = "1-8";
			
			assertEquals("Usuario existente", user, "1-9" );
			System.out.println("Usuario encontrado correctamente...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException i) {
			System.out.println(i.getMessage());
			fail(i.getMessage());
		}
	}
	
	@Test
	public void testUser3() {
		System.out.println("Probando un usuario con clave y password vacios...");
		UsuarioDAO userDAO = new UsuarioDAO();
		
		String user = null;
		try {
			user = userDAO.obtenerUsuario("", "");
			String result = "1-8";
			
			assertEquals("Usuario existente", user, null );
			System.out.println("Usuario con user y password vacios...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException i) {
			System.out.println(i.getMessage());
			fail(i.getMessage());
		}
	}
	
	@Test
	public void testUser4() {
		System.out.println("Probando un usuario con clave y password incorrectos...");
		UsuarioDAO userDAO = new UsuarioDAO();
		
		String user = null;
		try {
			user = userDAO.obtenerUsuario("test1111", "000009999911111");
			String result = "1-8";
			
			assertEquals("Usuario existente", user, null );
			System.out.println("Usuario con user y password incorrectos...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException i) {
			System.out.println(i.getMessage());
			fail(i.getMessage());
		}
	}
}
