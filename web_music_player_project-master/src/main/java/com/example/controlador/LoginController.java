package com.example.controlador;

import com.example.servicio.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@ResponseBody
	@RequestMapping(value="/login")
	String login(){
		return "Logueado";
	}
	
}