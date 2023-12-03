package com.balbicorp.picpay.model;


import com.balbicorp.picpay.dto.UsuarioDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuario")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(unique = true)
    String codigo;

    @Column(unique = true)
    String email;

    char tipo;

    String nome;
    String sobrenome;
    String senha;
    Long saldo;

    public Usuario(UsuarioDTO dto){
        this.codigo=dto.codigo();
        this.email=dto.email();
        this.tipo=dto.tipo();
        this.nome=dto.nome();
        this.sobrenome=dto.sobrenome();
        this.senha=dto.senha();
        this.saldo=dto.saldo();

    }

}
