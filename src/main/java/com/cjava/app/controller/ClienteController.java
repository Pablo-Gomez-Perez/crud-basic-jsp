package com.cjava.app.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cjava.app.model.Cliente;
import com.cjava.app.utils.DataBaseConexion;

public class ClienteController {
	
	
	private static Connection cn;
	private static final String dataBaseName = "ventas";
	
	public static void insertCliente(Cliente cliente) {
		
		CallableStatement stm = null;
		
		try {
			
			cn = DataBaseConexion.establecerConexionLocal(dataBaseName);
			stm = cn.prepareCall("CALL insertar_cliente(?,?,?,?,?,?,?);");
			
			stm.setString(1, cliente.getCodigo());
			stm.setString(2, cliente.getNombre());
			stm.setString(3, cliente.getApellido());
			stm.setString(4, cliente.getEmail());
			stm.setString(5, cliente.getTelefono());
			stm.setDouble(6, cliente.getTotalCompras());
			stm.setDate(7, cliente.getFechaRegistro());
			
			stm.execute();
			
		}catch(SQLException er) {
			er.printStackTrace();
		}catch(Exception er) {
			er.printStackTrace();
		}finally {
			try {
				DataBaseConexion.cerrarConexion(cn, stm);
			}catch(Exception er) {
				er.printStackTrace();
			}
		}			
	}
	
	public static List<Cliente> clientes(){
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente;
		CallableStatement stm = null;
		ResultSet rset = null;
		
		try {
			
			cn = DataBaseConexion.establecerConexionLocal(dataBaseName);
			stm = cn.prepareCall("CALL consultar_clientes()");
			rset = stm.executeQuery();
			
			while(rset.next()) {
				cliente = Cliente.builder(rset.getString(2),rset.getString(3))
						.apellido(rset.getString(4))
						.email(rset.getString(5))
						.telefono(rset.getString(6))
						.totalCompras(rset.getDouble(7))
						.build();
				clientes.add(cliente);
			}			
			
			return clientes;
		}catch(SQLException er) {
			er.printStackTrace();
		}catch(Exception er) {
			er.printStackTrace();
		}
		
		return null;
	}
	
}
