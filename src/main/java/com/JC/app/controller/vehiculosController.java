 package com.JC.app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/vehiculos")
public class vehiculosController {
	
	  @GetMapping("/hola")
	  public String saludarConNombre(@RequestParam("nombre") String nombre, Model model) {
	        model.addAttribute("nombre", nombre);
	        return "index";
	    }
}
