package com.example.controlador;

/**
 * Created by Darkar on 11/24/16.
 */

import java.security.Principal;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.repositorio.CancionRepositorio;


@RestController

public class WebPlayerControlador {

    @Autowired
    CancionRepositorio cancionRepositorio;
    @RequestMapping(value = "cancion/actual", method = RequestMethod.GET)
    public String mostrarCanciones(Principal principal) {
        return "redirect:/" + principal.getName();
    }

    @RequestMapping(value = "songs", method = RequestMethod.POST)
    public String insertarCancion(Principal principal){
        return "redirect:/" + principal.getName();
    }

}

