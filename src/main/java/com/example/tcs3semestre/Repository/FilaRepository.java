package com.example.tcs3semestre.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tcs3semestre.Model.Fila;

@Repository
public interface FilaRepository extends JpaRepository<Fila, Integer> {

}
