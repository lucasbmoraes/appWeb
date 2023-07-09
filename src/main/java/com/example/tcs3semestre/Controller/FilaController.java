package com.example.tcs3semestre.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tcs3semestre.Model.Fila;
import com.example.tcs3semestre.Repository.FilaRepository;

@Controller
public class FilaController {

    @Autowired
    FilaRepository filaRepository;

    @GetMapping("/cadastroFila")
    public String cadastroFila() {
        return "cadastroFila";
    }

    @PostMapping("cadastroFila")
    public String salvarFila(Fila fila) {
        filaRepository.save(fila);
        return "redirect:cadastroFila";

    }

}
