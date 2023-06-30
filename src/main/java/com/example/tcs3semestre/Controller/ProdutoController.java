package com.example.tcs3semestre.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.tcs3semestre.Repository.ProdutoRepository;

@Controller
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

}
