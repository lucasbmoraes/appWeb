package com.example.tcs3semestre.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "nivel_usuario")

public class NivelUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String descricao;

    @ManyToMany(mappedBy = "niveis", fetch = FetchType.EAGER)
    List<Usuario> usuarios;

    public NivelUsuario() {

    }

    public NivelUsuario(int id, String descricao, List<Usuario> usuarios) {
        this.id = id;
        this.descricao = descricao;
        this.usuarios = usuarios;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
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
