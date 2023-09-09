package com.bancoplatinum.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.bancoplatinum.dao.UsuarioDAO;

/**
 * Servlet implementation class UsuarioController
 */
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UsuarioDAO user = new UsuarioDAO();
		
		String existeUsuario = null;
		try {
			existeUsuario = user.obtenerUsuario(username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		if (existeUsuario != null) {
			request.setAttribute("rut", existeUsuario);
			RequestDispatcher requestDispatcher = (RequestDispatcher) request.getRequestDispatcher("/persona");
			requestDispatcher.forward(request, response);
		}else {
			RequestDispatcher requestDispatcher = (RequestDispatcher) request.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(request, response);
		}
		
		
	}

}
