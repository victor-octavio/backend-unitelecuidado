package org.unitelecuidado.api_rest.controller;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unitelecuidado.api_rest.domain.usuario.Usuario;
import org.unitelecuidado.api_rest.dto.UsuarioCadastro;
import org.unitelecuidado.api_rest.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastraUsuario(@RequestBody UsuarioCadastro dados){
        repository.save(new Usuario(dados));
    }



}
