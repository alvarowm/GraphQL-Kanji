package br.alvaro.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kanji {

    @Id
    private String ideograma;
    private String onyomi;
    private String kunyomi;
    private String significado;
    private String exemplos;

    public String getIdeograma() {
        return ideograma;
    }

    public void setIdeograma(String ideograma) {
        this.ideograma = ideograma;
    }

    public String getOnyomi() {
        return onyomi;
    }

    public void setOnyomi(String onyomi) {
        this.onyomi = onyomi;
    }

    public String getKunyomi() {
        return kunyomi;
    }

    public void setKunyomi(String kunyomi) {
        this.kunyomi = kunyomi;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getExemplos() {
        return exemplos;
    }

    public void setExemplos(String exemplos) {
        this.exemplos = exemplos;
    }
}
