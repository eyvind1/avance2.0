package com.example.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Artista{
	
	@Id
	@SequenceGenerator(name = "artistaGenerator", sequenceName = "artistaSeq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "artistaGenerator")
	private Integer idArtista;
	private String nombre;
	private String bio;
	
	@OneToMany(mappedBy = "artista")
	private List<Cancion> listaCanciones;
	
	@ManyToMany
	@JoinTable(name = "artistaCancion",
		joinColumns = @JoinColumn(name = "artistaId", referencedColumnName = "idArtista"),
		inverseJoinColumns = @JoinColumn(name = "cancionId", referencedColumnName = "idCancion"))
	private List<Cancion> cancionesArtista;
	
	@ManyToMany
	@JoinTable(name = "artistaAlbum",
		joinColumns = @JoinColumn(name = "artistaId", referencedColumnName = "idArtista"),
		inverseJoinColumns = @JoinColumn(name = "albumId", referencedColumnName = "idAlbum"))
	private List<Album> albumesArtista;
	
	public Artista(String nombre,String bio){
		this.nombre = nombre;
		this.bio	= bio;
	}
	
	public List<Album> getAlbumes_artista() {
		return albumesArtista;
	}

	public void setAlbumes_artista(List<Album> albumes_artista) {
		this.albumesArtista = albumes_artista;
	}

	public Artista(String nombreArtista,List<Cancion> cancionesArtista,List<Album> albums_artista) {
		this.nombre 			= nombreArtista;		
		this.cancionesArtista 	= cancionesArtista;
		//this.albumes_artista 	= albums_artista;
	}
	
	public Integer getId(){
		return idArtista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	
	public List<Cancion> GetCanciones(){
		return this.cancionesArtista;
	}
	public List<Album> GetAlbumes(){
		return this.albumesArtista;
	}
	
	public boolean find_album(Album album){
		for(Album i : albumesArtista){
			if(i == album) return true;
		}
		return false;
	}
	
}