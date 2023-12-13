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
        
    public Docente detalharDocente(Long id) {
    	return docenteRepository.findById(id).orElseThrow(() -> new Error());
    }
    
    public Docente alterarDocente(Long id, Docente docente) {
    	Docente docenteAntigo = docenteRepository.findById(id).orElseThrow(() -> new Error());
		
    	if (docente.getAulas() != null || !docente.getAulas().isEmpty()) {
			docenteAntigo.setAulas(docente.getAulas());
		}
		
		if (docente.getProcedimentos() != null || !docente.getProcedimentos().isEmpty()) {
			docenteAntigo.setProcedimentos(docente.getProcedimentos());
		}
		
		if (docente.getNome() != null || !docente.getNome().isEmpty()) {
			docenteAntigo.setNome(docente.getNome());
		}
				   	
    	return docenteRepository.save(docenteAntigo);
    }
    
    public void deletarDocente(Long id) {  	 
    	Docente docente = docenteRepository.findById(id).orElseThrow(() -> new Error());
    	docenteRepository.delete(docente);    	
    }
    
    
    
}
