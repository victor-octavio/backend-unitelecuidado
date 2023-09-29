package org.unitelecuidado.api_rest.controller;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.unitelecuidado.api_rest.domain.usuario.Usuario;
import org.unitelecuidado.api_rest.dto.UsuarioAtualizar;
import org.unitelecuidado.api_rest.dto.UsuarioCadastro;
import org.unitelecuidado.api_rest.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastraUsuario(@RequestBody @Valid UsuarioCadastro dados){
        repository.save(new Usuario(dados));
    }

    @GetMapping
    public List<Usuario> listaUsuario(){
        return repository.findAll();
    }
    @PutMapping
    @Transactional
    public void atualizaUsuario(@RequestBody @Valid UsuarioAtualizar dados){
        var usuario = repository.getReferenceById(dados.id());
        usuario.atualizarDados(dados);
    }

}
