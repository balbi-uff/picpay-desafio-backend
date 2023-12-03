package com.balbicorp.picpay.dto;

public record UsuarioDTO(Long id, String codigo, String email, char tipo, String nome, String sobrenome, String senha, Long saldo) {
}
