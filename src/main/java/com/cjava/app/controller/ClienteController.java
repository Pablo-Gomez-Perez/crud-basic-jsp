package com.cjava.app.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.cjava.app.model.Cliente;
import com.cjava.app.utils.DataBaseConexion;

public class ClienteController {
	
	
	private static Connection cn;
	
	public static void insertCliente(Cliente cliente) {
		
		CallableStatement stm = null;
		
		try {
			
			cn = DataBaseConexion.establecerConexionLocal("ventas");
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
	
}
