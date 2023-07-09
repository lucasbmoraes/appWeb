package com.example.tcs3semestre.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tcs3semestre.Model.Produto;
import com.example.tcs3semestre.Repository.ProdutoRepository;

@Controller
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/cadastroProduto")
    public String cadastroProduto() {
        return "cadastroProduto";
    }

    @PostMapping("cadastroProduto")
    public String salvarProduto(Produto produto) {
        produtoRepository.save(produto);
        return "redirect:cadastroProduto";
    }

}
