package br.meuprojeto.guia;

public class GuiaComAnexo extends Guia {

    public GuiaComAnexo(String titulo) {
        super(titulo);
        System.out.println("Guia com anexo.");
    }

    @Override
    public void publicar() {
        System.out.println("Publicar Guia com anexo.");
    }
}
