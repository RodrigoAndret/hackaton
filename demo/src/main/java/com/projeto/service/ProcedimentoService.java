package com.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.dao.ProcedimentoRepository;

@Service
public class ProcedimentoService {
	
	@Autowired
    private ProcedimentoRepository procedimentoRepository;

    public ProcedimentoService salvarProcedimento(ProcedimentoService procedimento) {
        return procedimentoRepository.save(procedimento);
    }
    
    
    
}

