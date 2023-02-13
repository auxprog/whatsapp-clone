package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Mensajes;



public interface MensajeService {

	public Mensajes save( Mensajes mensaje);
	public List<Mensajes> findAll();
}
