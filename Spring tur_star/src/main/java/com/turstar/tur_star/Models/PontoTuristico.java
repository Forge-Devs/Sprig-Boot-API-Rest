package com.seuprojeto.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pontos_turisticos")
public class PontoTuristico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(nullable = false)
    private String endereco;

    @OneToMany(mappedBy = "pontoTuristico")
    private List<Comentario> comentarios;
}