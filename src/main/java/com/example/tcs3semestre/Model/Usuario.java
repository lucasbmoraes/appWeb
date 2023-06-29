package com.example.tcs3semestre.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    private String senha;
    private String cpf;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario") // 1 ALUNO PRA VÁRIOS TELEFONES // ONE - CLASSE - MANY -
                                                                // ATRIBUTO
    List<Chamado> chamados;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_nivelUsuario", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "nivelusuario_id"))
    List<NivelUsuario> niveis;

    public Usuario() {
    }

    public Usuario(int id, String nome, String senha, String cpf) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }

    public List<NivelUsuario> getNiveis() {
        return niveis;
    }

    public void setNiveis(List<NivelUsuario> niveis) {
        this.niveis = niveis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
