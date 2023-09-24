package oop.Prepojenie2tabuliek.priklad3;

import oop.Prepojenie2tabuliek.priklad2.Autor;

public class Kniha {
    private String nazov;
    private int rokVydania;
    private oop.Prepojenie2tabuliek.priklad2.Autor autor;


    public Kniha() {
    }

    public Kniha(String nazov, int rokVydania, oop.Prepojenie2tabuliek.priklad2.Autor autor) {
        this.nazov = nazov;
        this.rokVydania = rokVydania;
        this.autor = autor;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public oop.Prepojenie2tabuliek.priklad2.Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Kniha{" +
                "nazov='" + nazov + '\'' +
                ", rokVydania=" + rokVydania +
                ", autor=" + autor +
                '}';
    }
}
