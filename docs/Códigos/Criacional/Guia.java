package br.meuprojeto.guia;

public class Guia {
    private String titulo;

    public Guia(String titulo) {
        this.titulo = titulo;
        System.out.println("Criação de guia " + titulo);
    }

    public void publicar(){System.err.println("Publicar guia sem anexo");}
}
