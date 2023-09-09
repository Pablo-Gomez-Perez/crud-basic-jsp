package com.cjava.app.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjava.app.controller.ClienteController;
import com.cjava.app.model.Cliente;

/**
 * Servlet implementation class ClientesServlet
 */
public class ClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cliente cliente;
		
		try {
			
			cliente = Cliente
					.builder(request.getParameter("codigoCliente"),request.getParameter("nombreCliente"))
					.apellido(request.getParameter("apellidoCliente"))
					.email(request.getParameter("emailCliente"))
					.telefono(request.getParameter("telefonoCliente"))
					.totalCompras(Double.parseDouble(request.getParameter("comprasRegistradas")))
					.fechaRegistro(Date.valueOf(LocalDate.now()))
					.build();
			
			ClienteController.insertCliente(cliente);
			
		}catch(Exception er) {
			er.printStackTrace();
		}
		
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
