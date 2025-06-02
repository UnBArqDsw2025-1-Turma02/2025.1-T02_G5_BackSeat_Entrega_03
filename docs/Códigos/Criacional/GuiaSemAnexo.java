package br.meuprojeto.guia;

public class GuiaSemAnexo extends Guia {

    public GuiaSemAnexo(String titulo) {
        super(titulo);
        System.out.println("Guia sem anexo.");
    }

    @Override
    public void publicar() {
        System.out.println("Publicar guia sem anexo.");
    }
}
