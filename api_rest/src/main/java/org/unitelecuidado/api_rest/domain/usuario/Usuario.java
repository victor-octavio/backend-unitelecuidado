package org.unitelecuidado.api_rest.domain.usuario;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.unitelecuidado.api_rest.dto.UsuarioCadastro;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Data
@NoArgsConstructor
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String senha;
    @Enumerated(EnumType.STRING)
    private UsuarioCargo cargo;

    public Usuario(UsuarioCadastro dados){
        this.email = dados.email();
        this.senha = dados.senha();
        this.cargo = dados.cargo();
    }




}
