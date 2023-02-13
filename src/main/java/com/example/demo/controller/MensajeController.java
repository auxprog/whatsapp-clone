package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Mensajes;
import com.example.demo.services.MensajeService;

@Controller
public class MensajeController {
	
	@Autowired
	private MensajeService mensajeservice;
	
	@GetMapping(value="")
	public String index(Model model) {
		
		return"index";
	}
	
	@PostMapping(value="/save")
	public String crear(Mensajes mensaje){
		
		mensajeservice.save(mensaje);
		
		return"redirect:/save";
	}
	
	@GetMapping(value="/save")
	public String save(Model model) {
		model.addAttribute("menajess", mensajeservice.findAll());
		return "index";
	}

}
