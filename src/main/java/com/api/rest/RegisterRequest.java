package com.api.rest;

public class RegisterRequest {
	  private String nombreORazonSocial;
	    private String apellido;
	    private String correoElectronico;
	    private String telefono;
	    private String nit;
	    private String password;


	    // Constructor con todos los campos
	    public RegisterRequest(String nombreORazonSocial, String apellido, String correoElectronico, String telefono, String nit, String password) {
	        this.nombreORazonSocial = nombreORazonSocial;
	        this.apellido = apellido;
	        this.correoElectronico = correoElectronico;
	        this.telefono = telefono;
	        this.nit = nit;
	        this.password = password;
	    }

	    // Getters y Setters
	    public String getNombreORazonSocial() {
	        return nombreORazonSocial;
	    }

	    public void setNombreORazonSocial(String nombreORazonSocial) {
	        this.nombreORazonSocial = nombreORazonSocial;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public String getCorreoElectronico() {
	        return correoElectronico;
	    }

	    public void setCorreoElectronico(String correoElectronico) {
	        this.correoElectronico = correoElectronico;
	    }

	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	    }

	    public String getNit() {
	        return nit;
	    }

	    public void setNit(String nit) {
	        this.nit = nit;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
	}

