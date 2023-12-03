package com.balbicorp.picpay.service;

import com.balbicorp.picpay.dto.UsuarioDTO;
import com.balbicorp.picpay.model.Usuario;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UsuarioServiceTest {

    @Autowired
    UsuarioService service;

    @Test
    @Transactional
    void cadastrarUsuarioNoBanco() {
        String codigo_cpf = "1234";
        UsuarioDTO dto = new UsuarioDTO(codigo_cpf, "j@gmail.com", 'L', "Joca", "Job", "12345", 1545L);

        Usuario user = service.cadastrarUsuarioNoBanco(dto);

        assertNotNull(service.getUsuarioNoBanco(user.getId()));
    }

    @Test
    @Transactional
    void cadastrarDoisUsuariosComOMesmoCPF(){
        String codigo_cpf = "11122233345";
        UsuarioDTO primeiroUser = new UsuarioDTO(codigo_cpf, "aaaaaa@gmail.com", 'C', "Paulo", "Jeferson", "12345", 1545L);
        UsuarioDTO segundoUser = new UsuarioDTO(codigo_cpf, "xxxxx@gmail.com", 'L', "Maria", "Pietra", "12345", 1545L);

        service.cadastrarUsuarioNoBanco(primeiroUser);

        assertThrows(DataIntegrityViolationException.class, () -> service.cadastrarUsuarioNoBanco(segundoUser));

    }

    @Test
    @Transactional
    void cadastrarDoisUsuariosComOMesmoEmail(){
        String email = "teste_email@teste.com.br";
        UsuarioDTO primeiroUser = new UsuarioDTO("123", email, 'L', "Felipe", "Trino", "12345", 1545L);
        UsuarioDTO segundoUser = new UsuarioDTO("456", email, 'L', "Igor", "Max", "12345", 1545L);

        service.cadastrarUsuarioNoBanco(primeiroUser);

        assertThrows(DataIntegrityViolationException.class, () -> service.cadastrarUsuarioNoBanco(segundoUser));
    }

}
