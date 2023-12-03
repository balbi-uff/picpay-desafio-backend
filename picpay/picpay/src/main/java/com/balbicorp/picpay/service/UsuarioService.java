package com.balbicorp.picpay.service;

import com.balbicorp.picpay.dto.UsuarioDTO;
import com.balbicorp.picpay.model.Usuario;
import com.balbicorp.picpay.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public Usuario cadastrarUsuarioNoBanco(UsuarioDTO usuarioDTO){
        Usuario usuario_a_ser_criado = new Usuario(usuarioDTO);
        try {
            return repository.save(usuario_a_ser_criado);
        } catch (DataIntegrityViolationException e){
            throw new DataIntegrityViolationException("Falha ao criar usuário: ", e);
        }


    }

    public Optional<Usuario> getUsuarioNoBanco(Long id){
        return repository.findById(id);
    }

}
