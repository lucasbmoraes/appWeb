package com.example.tcs3semestre.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.tcs3semestre.Repository.NivelUsuarioRepository;

@Controller
public class NivelUsuarioController {

    @Autowired
    NivelUsuarioRepository nivelUsuarioRepository;

    @GetMapping("/loginUsuario")
    public String homeLogin() {
        return "loginUsuario";
    }

}
