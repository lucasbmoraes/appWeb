package com.example.tcs3semestre.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.tcs3semestre.Model.NivelUsuario;
import com.example.tcs3semestre.Model.Usuario;
import com.example.tcs3semestre.Repository.NivelUsuarioRepository;
import com.example.tcs3semestre.Repository.UsuarioRepository;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    NivelUsuarioRepository nivelUsuarioRepository;

    @GetMapping("/menuPrincipal")
    public String menuPrincipal() {
        return "menuPrincipal";
    }

    @GetMapping("/cadastroUsuario")
    public ModelAndView homeCadastro() {
        ModelAndView mv = new ModelAndView("cadastroUsuario");
        ArrayList<NivelUsuario> niveis = new ArrayList<>();
        niveis = (ArrayList<NivelUsuario>) nivelUsuarioRepository.findAll();
        mv.addObject("niveis", niveis);
        return mv;
    }

    @PostMapping("/cadastroUsuario")
    public String salvar(Usuario usuario, @RequestParam("nivel") List<Integer> idNivel) {

        ArrayList<NivelUsuario> nivel = new ArrayList<>();
        for (Integer id : idNivel) {
            nivel.add(nivelUsuarioRepository.findById(id).get());
        }
        usuario.setNiveis(nivel);
        usuarioRepository.save(usuario);

        return "redirect:/loginUsuario";
    }

}
