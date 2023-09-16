package org.example;

public class Configuracao {

    private static Configuracao instance = new Configuracao();
    private String idioma;
    private String familiaFonte;
    private int tamanhoFonte;

    private Configuracao() {
    }

    public static Configuracao getInstance() {
        return instance;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFamiliaFonte() {
        return familiaFonte;
    }

    public void setFamiliaFonte(String familiaFonte) {
        this.familiaFonte = familiaFonte;
    }

    public int getTamanhoFonte() {
        return tamanhoFonte;
    }

    public void setTamanhoFonte(int tamanhoFonte) {
        this.tamanhoFonte = tamanhoFonte;
    }
}