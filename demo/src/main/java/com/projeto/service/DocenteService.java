package com.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.dao.DocenteRepository;
import com.projeto.model.Docente;

@Service
public class DocenteService {
	
	@Autowired
    private DocenteRepository docenteRepository;

    public Docente criarDocente(Docente docente) {
        return docenteRepository.save(docente);
    }
    
    public Docente alterarDocente(Docente docente) {

    }
    
    public Docente deletarDocente(Docente docente) {
        return docenteRepository.deleteById(docente);
    }
    
    
    
}
