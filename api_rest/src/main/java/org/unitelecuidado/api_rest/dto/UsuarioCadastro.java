package org.unitelecuidado.api_rest.dto;

import org.unitelecuidado.api_rest.domain.usuario.UsuarioCargo;

public record UsuarioCadastro(String nome, String email, String senha, UsuarioCargo cargo, boolean ativo) {
}
