package com.example.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.repositorio.CancionRepositorio;
import com.example.repositorio.UsuarioRepositorio;
import com.example.repositorio.AdministradorRepositorio;
import java.security.Principal;

public class WebPlayerControlador {
	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	@RequestMapping(value = "account/current", method = RequestMethod.GET)
	public String account(Principal principal) {
		return "redirect:/" + principal.getName() + "/playlists";
	}
	
	@Autowired
	AdministradorRepositorio AdministradorRepositorio;
	@Autowired
	AdministradorRepositorio CancionRepositorio;
	@RequestMapping (value= "cancion/actual", method= RequestMethod.GET)
	public String mostrarcancion(Principal principal) {
		return "redirect:/" + principal.getName() ;
	}
	@RequestMapping (value= "song", method=RequestMethod.POST)
	public String subcancion (Principal principal){
		 return "redirect:/" + principal.getName() ;
	}
	}
	