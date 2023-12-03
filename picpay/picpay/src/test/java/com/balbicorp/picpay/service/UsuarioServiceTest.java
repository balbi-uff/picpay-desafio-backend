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
        String expected_code = "1234";
        UsuarioDTO dto = new UsuarioDTO(expected_code, "j@gmail.com", 'L', "Joca", "Job", "12345", 1545L);

        Usuario user = service.cadastrarUsuarioNoBanco(dto);

        assertNotNull(service.getUsuarioNoBanco(user.getId()));
    }
}
