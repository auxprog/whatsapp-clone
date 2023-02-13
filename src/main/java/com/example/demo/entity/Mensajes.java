package com.example.demo.entity;

import java.util.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "mensajes")
public class Mensajes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String mensaje;
	
	@Column(name="create_At")
	@Temporal(TemporalType.DATE)
	public Date createAt;
	
	@PrePersist
	private void prePersist(){
		
		createAt = new Date();
	}

	public Mensajes(Long id, String mensaje, Date createAt) {
		super();
		this.id = id;
		this.mensaje = mensaje;
		this.createAt = createAt;
	}

	public Mensajes() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	
	
	
	
}
