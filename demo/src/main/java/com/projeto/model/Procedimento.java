package com.projeto.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Procedimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private List<String> insumos;
	
	public Procedimento(Integer id, List<String> insumos) {
		super();
		this.id = id;
		this.insumos = insumos;	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<String> getInsumos() {
		return insumos;
	}

	public void setInsumos(List<String> insumos) {
		this.insumos = insumos;
	}
	
	
	
}
