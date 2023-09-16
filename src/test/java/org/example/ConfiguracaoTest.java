package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTest {

    @Test
    public void deveRetornarIdioma() {
        Configuracao.getInstance().setIdioma("Portuguese");
        assertEquals("Portuguese", Configuracao.getInstance().getIdioma());
    }

    @Test
    public void deveRetornarFamiliaDaFonte() {
        Configuracao.getInstance().setFamiliaFonte("Monospace");
        assertEquals("Monospace", Configuracao.getInstance().getFamiliaFonte());
    }

    @Test
    public void deveRetornarTamanhoDaFonte() {
        Configuracao.getInstance().setTamanhoFonte(11);
        assertEquals(11, Configuracao.getInstance().getTamanhoFonte());
    }

}