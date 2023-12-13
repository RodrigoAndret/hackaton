package com.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.model.Docente;
import com.projeto.service.DocenteService;

@RestController
@RequestMapping("/docente")
public class Controlador {
	
	@Autowired
	DocenteService docenteService;

@PostMapping("/criarDocente")
public ResponseEntity<Docente> criarDocente(@RequestBody Docente docente) {
	docente = docenteService.criarDocente(docente);
	
	return new ResponseEntity<>(docente,HttpStatus.CREATED);
}

@GetMapping("/docentes/{id}")
public String detalharDocente(@PathVariable("id") @RequestParam Long id) {
	Docente docente = new Docente(id);
	String nome = docente.getNome();	
	return "Nome: " + nome + "/ ID: " + id;	
}

@PostMapping("/docentes/{id}")
public void alterarDocente(@PathVariable("id") @RequestParam Long id) {
	docenteService.alterarDocente(id);
}

@PostMapping("/docentes/{id}")
public void deletarDocente(@PathVariable("id") @RequestParam Long id) {
	docenteService.deletarDocente(id);	
}





}