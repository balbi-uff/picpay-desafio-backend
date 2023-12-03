package com.balbicorp.picpay.service;

import com.balbicorp.picpay.dto.UsuarioDTO;
import com.balbicorp.picpay.model.Usuario;
import com.balbicorp.picpay.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public Usuario cadastrarUsuarioNoBanco(UsuarioDTO usuarioDTO){
        Usuario usuario_a_ser_criado = new Usuario(usuarioDTO);
        return repository.save(usuario_a_ser_criado);
    }


}
