package com.example.tcs3semestre.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.tcs3semestre.Model.Chamado;
import com.example.tcs3semestre.Model.Fila;
import com.example.tcs3semestre.Model.Produto;
import com.example.tcs3semestre.Repository.ChamadoRepository;
import com.example.tcs3semestre.Repository.FilaRepository;
import com.example.tcs3semestre.Repository.ProdutoRepository;

@Controller
public class ChamadoController {

    @Autowired
    ChamadoRepository chamadoRepository;

    @Autowired
    FilaRepository filaRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("cadastroChamado")
    public ModelAndView cadastroChamado() {
        ModelAndView mv = new ModelAndView("cadastroChamado");
        ArrayList<Fila> filas = new ArrayList<>();
        filas = (ArrayList<Fila>) filaRepository.findAll();
        mv.addObject("filas", filas);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos = (ArrayList<Produto>) produtoRepository.findAll();
        mv.addObject("produtos", produtos);

        return mv;
    }

    @GetMapping("listaChamados")
    public ModelAndView listaDeChamados() {
        ModelAndView mv = new ModelAndView("listaChamado");
        List<Chamado> chamados = new ArrayList<>();
        chamados = chamadoRepository.findAll();
        mv.addObject("chamados", chamados);

        return mv;
    }

    /*
     * @PostMapping("cadastroChamado")
     * public String cadastroChamado(Chamado chamado, @RequestParam("idFila")
     * Integer idFila,
     * 
     * @RequestParam("idProdutos") Integer idProduto) {
     * 
     * 
     * Fila fila = new Fila();
     * fila = filaRepository.findById(idFila).get();
     * fila.setChamados(chamado);
     * filaRepository.save(fila);
     * 
     * Produto produto = new Produto();
     * produto = produtoRepository.findById(idProduto).get();
     * produto.setChamados(chamado);
     * produtoRepository.save(produto);
     * 
     * chamadoRepository.save(chamado);
     * 
     * return "redirect:loginUsuario";
     */
}

/*
 * 
 * @GetMapping("/cadastroChamado/{id}") // Pega o id do chamado pela URL
 * public String reservarLivro(@PathVariable int id) // coloca na variavel 'id'
 * de inteiro o id pego pela url
 * {
 * Chamado novoChamado = chamadoRepository.findById(id).get(); // Cria um objeto
 * chamado e adiciona os valores
 * // pegados
 * // do banco
 * if (!novoChamado.isStatus()) {
 * novoChamado.setStatus(true);
 * chamadoRepository.save(novoChamado);
 * } else {
 * novoChamado.setStatus(false);
 * chamadoRepository.save(novoChamado);
 * }
 * return ""; // retorna MV com o livro
 * }
 */
