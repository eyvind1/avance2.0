package com.example.dominio;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.example.dominio.Person;

@Entity
public class Artist implements BaseEntity<Integer> {
	@Id
	@SequenceGenerator(name = "artist_id_generator", sequenceName = "artist_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "artist_id_generator")
	private Integer id;
	
	@Column(length = 64)
	private String nombre;
	
	@ManyToMany
    @JoinTable(name="person_artist")
	private Collection<Person> grupo;

	@ManyToMany
    @JoinTable(name="artist_album")
	private Collection<Album> albums;

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Person> getGrupo() {
		return grupo;
	}

	public void setGrupo(Collection<Person> grupo) {
		this.grupo = grupo;
	}
	
	
	
	public Collection<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(Collection<Album> albums) {
		this.albums = albums;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {

		this.id = id;
	}
	

}