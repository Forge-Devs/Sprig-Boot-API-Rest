package com.turstar.repositories;

import com.seuprojeto.models.PontoTuristico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoTuristicoRepository extends JpaRepository<PontoTuristico, Long> {
    List<PontoTuristico> findByNomeContaining(String nome);
}
// PontoTuristico.java (no pacote models)
package com.seuprojeto.models;

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
    // ... outros atributos
}

// PontoTuristicoRepository.java (no pacote repositories)
package com.seuprojeto.repositories;

import com.seuprojeto.models.PontoTuristico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoTuristicoRepository extends JpaRepository<PontoTuristico, Long> {
    List<PontoTuristico> findByNomeContaining(String nome);
}