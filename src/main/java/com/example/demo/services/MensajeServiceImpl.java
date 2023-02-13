package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Mensajes;
import com.example.demo.repositorio.Repository;

@Service
public class MensajeServiceImpl implements MensajeService {

	@Autowired
	private Repository repository;

	@Override
	public List<Mensajes> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Mensajes save(Mensajes mensaje) {
		// TODO Auto-generated method stub
		return repository.save(mensaje);
	}
	
	
}
