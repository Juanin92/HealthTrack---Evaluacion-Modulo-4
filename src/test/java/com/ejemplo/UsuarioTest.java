package com.ejemplo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    void setUp(){
        usuario = new Usuario("juan", 75.5);
    }

    @Test
    @DisplayName("El usuario aumenta su peso correctamente")
    void actualizarPeso_aumentoDePeso() {
        usuario.actualizarPeso(78);
        assertEquals(78, usuario.getPeso());
    }

    @Test
    @DisplayName("El usuario disminuye su peso correctamente")
    void actualizarPeso_disminucionDePeso() {
        usuario.actualizarPeso(70);
        assertEquals(70, usuario.getPeso());
    }
}
