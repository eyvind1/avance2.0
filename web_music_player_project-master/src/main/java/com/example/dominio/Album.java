package com.example.dominio;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Album{
	@Id
	@SequenceGenerator(name = "albumGenerator", sequenceName = "albumSeq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "albumGenerator")
	@Column(name = "idAlbum")
	private Integer id;
	private String nombre;	
	private Timestamp fechaCreacion;
	@OneToMany(mappedBy = "album")
	private List<Cancion> cancionesAlbum;
	@ManyToMany
	@JoinTable(name = "albumArtista",
	      joinColumns = @JoinColumn(name = "albumId", referencedColumnName = "Idalbum"),
	      inverseJoinColumns = @JoinColumn(name = "artistaId", referencedColumnName = "idArtista"))
	private List<Artista> listaArtistas;
	
	public Album()
	{
		
	}
	public Album (String nombre, Timestamp fecha_c){
		this.nombre 		= nombre;
		this.fechaCreacion 	= fecha_c;
	}
	
	public Integer getId(){
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<Artista> getListaArtistas() {
		return listaArtistas;
	}

	public void setListaArtistas(List<Artista> listaArtistas) {
		this.listaArtistas = listaArtistas;
	}
	public List<Cancion> getCanciones_Album(){
		return this.cancionesAlbum;
	}
}
