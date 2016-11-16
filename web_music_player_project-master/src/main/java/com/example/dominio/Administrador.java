package com.example.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Administrador {
	@Id
	@SequenceGenerator(name = "personaGenerator", sequenceName = "personaSeq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personaGenerator")
	private Integer idAdm;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String userName;
	private String password;
	
	public Administrador(String nombres, String apellidoPaterno, String apellidoMaterno, String userName, String password) {
		this.nombres 			= nombres;
        this.apellidoPaterno 	= apellidoPaterno;
        this.apellidoMaterno    = apellidoMaterno;
        this.userName			= userName;
        this.password			= password;
    }

	public Integer getId(){
		return idAdm;
	}
	
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
