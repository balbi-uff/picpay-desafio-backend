package com.balbicorp.picpay.service;

import com.balbicorp.picpay.dto.UsuarioDTO;
import com.balbicorp.picpay.model.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UsuarioServiceTest {

    @Autowired
    UsuarioService service;

    @Test
    void cadastrarUsuarioNoBanco() {
        Long id_teste = 789L;
        UsuarioDTO dto = new UsuarioDTO(id_teste, "1234", "j@gmail.com", 'L', "Joca", "Job", "12345", 1545L);

        service.cadastrarUsuarioNoBanco(dto);
        assertTrue(service.repository.existsById(id_teste));
    }
}
