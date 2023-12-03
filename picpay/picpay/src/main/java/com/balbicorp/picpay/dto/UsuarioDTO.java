package com.balbicorp.picpay.dto;

public record UsuarioDTO(String codigo, String email, char tipo, String nome, String sobrenome, String senha, Long saldo) {
}
