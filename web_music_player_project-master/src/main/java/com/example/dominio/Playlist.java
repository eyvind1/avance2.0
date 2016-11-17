package com.example.dominio;

import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class Playlist {
  @Id
  @SequenceGenerator(name = "playlistGenerator", sequenceName = "playlistSeq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "playlistGenerator")
  private Integer	idPlaylist;
  private String 	nombre;
  private String 	fechaCreacion;

  @ManyToMany
  @JoinTable(name = "playlistCancion",
      joinColumns = @JoinColumn(name = "playlistId", referencedColumnName = "idPlaylist"),
      inverseJoinColumns = @JoinColumn(name = "cancionId", referencedColumnName = "idCancion"))
  private List<Cancion> canciones;
  
  @ManyToOne
  @JoinColumn(name = "idUsuario")
  private Usuario usuario;
  
  public Playlist(String nombre,Integer usuario){
	  this.nombre 		= nombre;
	  this.idPlaylist 	= usuario;
	  this.fechaCreacion = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
  }

  public Integer getID_playlist() {
	  return idPlaylist;
  }

  public String getNombre() {
	  return nombre;
  }

  public void setNombre(String nombre) {
	  this.nombre = nombre;
  }

  public String getFecha_creacion() {
	  return fechaCreacion;
  }

  public void setFecha_creacion(String fechaCreacion) {
	  this.fechaCreacion = fechaCreacion;
  }	

  public Usuario getUsuario() {
	  return usuario;
  }

  public void setUsuario(Usuario usuario) {
	  this.usuario = usuario;
  }
  
  public boolean find_Cancion(Cancion cancion){
	  for(int i = 0; i < canciones.size(); i++){
		  if(canciones.get(i) == cancion){
			  return true;
		  }
	  }
	  return false;
  }
  
  public void addCancion(Cancion cancion){
	  canciones.add(cancion);
	  return;
  }
}

