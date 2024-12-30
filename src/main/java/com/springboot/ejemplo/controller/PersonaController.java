package com.springboot.ejemplo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.ejemplo.model.Persona;

@Controller
public class PersonaController {
	@GetMapping("/registrar")
	public String mostrarFormulario(Model model)
	{
		Persona persona = new Persona();
		model.addAttribute("persona",persona);
		List<String> listaProfesiones= Arrays.asList("Profesion1","Profesion2","Profesion3");
		model.addAttribute("profesion",listaProfesiones);
		return "registrar";
	}
}
