package com.example.tcs3semestre.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tcs3semestre.Model.NivelUsuario;

@Repository
public interface NivelUsuarioRepository extends JpaRepository<NivelUsuario, Integer> {

}
