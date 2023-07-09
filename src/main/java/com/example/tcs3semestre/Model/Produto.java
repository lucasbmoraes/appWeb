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
@Table(name = "produto")

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome_produto;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produto") // 1 ALUNO PRA VÁRIOS TELEFONES // ONE - CLASSE - MANY -
                                                                // ATRIBUTO
    List<Chamado> chamados;

    public Produto() {

    }

    public Produto(int id, String nome_produto) {
        this.id = id;
        this.nome_produto = nome_produto;
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
}
