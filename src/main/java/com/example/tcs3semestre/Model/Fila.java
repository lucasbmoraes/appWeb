package com.example.tcs3semestre.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "fila") // A FILA É A CATEGORIA/SETOR

public class Fila {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fila") // 1 FILA/CATEGORIA/SETOR POSSUI VÁRIOS CHAMADOS // ONE -
                                                             // CLASSE - MANY -
                                                             // ATRIBUTO
    List<Chamado> chamados;

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }

    public Fila() {

    }

    public Fila(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
