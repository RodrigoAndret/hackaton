package com.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
public ResponseEntity<Docente> detalharDocente(@PathVariable("id") Long id) {
	Docente docente = docenteService.detalharDocente(id);	
	return new ResponseEntity<>(docente,HttpStatus.OK);
}

@PutMapping("/alterarDocentes/{id}")
public ResponseEntity<Docente> alterarDocente(@PathVariable("id") Long id, @RequestBody Docente docente) {
	docente = docenteService.alterarDocente(id,docente);
	return new ResponseEntity<>(docente,HttpStatus.CREATED);
}

@DeleteMapping("/deletarDocentes/{id}")
public ResponseEntity<?> deletarDocente(@PathVariable("id") Long id) {
	docenteService.deletarDocente(id);	
	return new ResponseEntity<>("Docente deletado com sucesso!",HttpStatus.NO_CONTENT);
}





}