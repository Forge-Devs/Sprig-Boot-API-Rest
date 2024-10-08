package com.turstarmodels;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PontoTuristico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  
    id;
    private String nome;
}

package com.seuprojeto.repositories;

import com.seuprojeto.models.PontoTuristico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoTuristicoRepository extends JpaRepository<com.turstar.repositories.PontoTuristico, Long> {
    List<com.turstar.repositories.PontoTuristico> findByNomeContaining(String nome);
}