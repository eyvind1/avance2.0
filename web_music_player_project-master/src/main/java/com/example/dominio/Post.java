package com.example.dominio;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

public class Post implements BaseEntity<Integer> {
	
	@Id
	@SequenceGenerator(name = "post_id_generator", sequenceName = "post_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_id_generator")
	private Integer id;

	@ManyToOne
	private Usuario creador;
	
	@Column
	private Timestamp fecha;
	
	@Column
	private String contenido;
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
}