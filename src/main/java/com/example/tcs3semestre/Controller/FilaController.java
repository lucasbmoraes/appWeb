package com.example.tcs3semestre.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.tcs3semestre.Repository.FilaRepository;

@Controller
public class FilaController {

    @Autowired
    FilaRepository filaRepository;

}
