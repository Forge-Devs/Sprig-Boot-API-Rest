package com.turstar.services;

import com.seuprojeto.models.PontoTuristico;
import com.seuprojeto.repositories.PontoTuristicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PontoTuristicoService {
    @Autowired
    private PontoTuristicoRepository pontoTuristicoRepository;

    public PontoTuristico salvar(PontoTuristico pontoTuristico) {

        return pontoTuristicoRepository.save(pontoTuristico);
    }

    public List<PontoTuristico> buscarTodos() {
        return pontoTuristicoRepository.findAll();
    }
}