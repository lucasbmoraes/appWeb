package com.example.tcs3semestre.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.tcs3semestre.Repository.UsuarioRepository;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

}
