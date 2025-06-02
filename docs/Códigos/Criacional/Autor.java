package br.meuprojeto.usuario;

import br.meuprojeto.guia.Guia;
import br.meuprojeto.guia.GuiaComAnexo;
import br.meuprojeto.guia.GuiaSemAnexo;

public class Autor extends Usuario {

    public Autor(String nome) {
        super(nome);
        System.out.println("Usuário é autor.");
    }
    public Guia criarGuia(String titulo, Boolean existeanexo) {
        if(existeanexo) {
            System.out.println("Criar Guia com anexo.");
            return new GuiaComAnexo(titulo);
        } else {
            System.out.println("Criar Guia com anexo.");
            return new GuiaSemAnexo(titulo);
        }
    }
}
