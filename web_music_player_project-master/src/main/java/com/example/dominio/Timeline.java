package com.example.dominio;

import java.util.Date;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
public class Timeline {
	@Id
	@SequenceGenerator(name = "timelineGenerator", sequenceName = "timelineSeq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "timelineGenerator")
	private Integer idTimeline;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="usuarioId", referencedColumnName="idUsuario")
    private Usuario usuario;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="cancionId", referencedColumnName="idCancion")
    private Cancion cancion; 
    
    @Column(name = "fechaReproduccion")
    private Timestamp date;
}
