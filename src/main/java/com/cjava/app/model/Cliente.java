package com.cjava.app.model;

import java.sql.Date;
import java.util.Objects;

public class Cliente {

	private int idCliente;
	private String codigo;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private double totalCompras;
	private Date fechaRegistro;
	
	public static class Builder{
		private Cliente clt;
		
		public Builder(String codigo, String nombre) {
			this.clt = new Cliente(codigo, nombre);
		}
		
		public Builder apellido(String apellido) {
			this.clt.setApellido(apellido);
			return this;
		}
		
		public Builder email(String email) {
			this.clt.setEmail(email);
			return this;
		}
		
		public Builder telefono(String telefono) {
			this.clt.setTelefono(telefono);
			return this;
		}
		
		public Builder totalCompras(double totalCompras) {
			this.clt.setTotalCompras(totalCompras);
			return this;
		}
		
		public Builder fechaRegistro(Date fechaRegistro) {
			this.clt.setFechaRegistro(fechaRegistro);
			return this;
		}
		
		public Cliente build() {
			return this.clt;
		}
	}
	
	public static Builder builder(String codigo, String nombre) {
		return new Builder(codigo, nombre);
	}
	
	/**
	 * @param idCliente
	 * @param codigo
	 * @param nombre
	 * @param apellido
	 * @param email
	 * @param telefono
	 * @param totalCompras
	 * @param fechaRegistro
	 */
	public Cliente(int idCliente, String codigo, String nombre, String apellido, String email, String telefono,
			double totalCompras, Date fechaRegistro) {
		super();
		this.idCliente = idCliente;
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.totalCompras = totalCompras;
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @param codigo
	 * @param nombre
	 */
	public Cliente(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Cliente() {

	}

	/**
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the totalCompras
	 */
	public double getTotalCompras() {
		return totalCompras;
	}

	/**
	 * @param totalCompras the totalCompras to set
	 */
	public void setTotalCompras(double totalCompras) {
		this.totalCompras = totalCompras;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Cliente)) {
			return false;
		}
		Cliente other = (Cliente) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", codigo=" + codigo + ", nombre=" + nombre + ", apellido="
				+ apellido + ", email=" + email + ", telefono=" + telefono + ", totalCompras=" + totalCompras
				+ ", fechaRegistro=" + fechaRegistro + "]";
	}

}
