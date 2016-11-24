package com.example.controlador;


import com.example.repositorio.CancionRepositorio;
import com.example.repositorio.UsuarioRepositorio;
import com.example.repositorio.AdministradorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

public class WebPlayerControlador {

    @Autowired
    CancionRepositorio cancionRepositorio;
    @RequestMapping (value ="cancion/actual", method =RequestMethod.GET)
    public String mostrarcanciones (Principal principal){
        return "redirect:/"+principal.getName() ;
    }
    @RequestMapping(value="songs",method=RequestMethod.POST)
    public String subircanciones (Principal principal){
        return "redirect:/"+principal.getName();
    }
}