package com.example.demo.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Mensajes;


@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Mensajes, Long>{

}
