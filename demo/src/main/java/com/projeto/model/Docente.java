package com.projeto.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gestor")
public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // ou id pra facilitar
	
	private String nome;
	
	private List<Procedimento> procedimentos;
	
	private List<Aula> aulas;
	
	public Docente() {
		
	}
	
	public Docente(Long id) {
		this.id = id;
	}
	
	public Docente(Long id, String nome, List<Procedimento> procedimentos, List<Aula> aulas) {
		super();
		this.id = id;
		this.nome = nome;
		this.procedimentos = procedimentos;
		this.aulas = aulas;
	}

	public Integer getRegistro() {
		return id;
	}

	public void setRegistro(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Procedimento> getProcedimentos() {
		return procedimentos;
	}

	public void setProcedimentos(List<Procedimento> procedimentos) {
		this.procedimentos = procedimentos;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

	
	
}
