package com.example.tcs3semestre.Model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "chamado")

public class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private Date data_chamado;
    private String descricao;
    private String historico;
    private boolean status;

    @ManyToOne(cascade = CascadeType.ALL) // VÁRIOS CHAMADOS PARA UMA FILA - MANY CLASSE - ONE ATRIBUTO
    private Fila fila;

    @ManyToOne(cascade = CascadeType.ALL) // VÁRIOS CHAMADOS PARA UM PRODUTO - MANY CLASSE - ONE ATRIBUTO
    private Produto produto;

    @ManyToOne(cascade = CascadeType.ALL) // VÁRIOS CHAMADOS PARA UM USUARIO - MANY CLASSE - ONE ATRIBUTO
    private Usuario usuario;

    public Chamado() {
    }

    public Chamado(int id, Date data_chamado, String descricao, String historico, boolean status) {
        this.id = id;
        this.data_chamado = data_chamado;
        this.descricao = descricao;
        this.historico = historico;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_chamado() {
        return data_chamado;
    }

    public void setData_chamado(Date data_chamado) {
        this.data_chamado = data_chamado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
