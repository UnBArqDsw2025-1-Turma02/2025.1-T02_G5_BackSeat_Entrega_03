package br.meuprojeto;

import br.meuprojeto.guia.Guia;
import br.meuprojeto.guia.GuiaComAnexo;
import br.meuprojeto.guia.GuiaSemAnexo;
import br.meuprojeto.usuario.Usuario;
import br.meuprojeto.usuario.Autor;

public class Main {
    public static void main(String[] args) {
        // Teste com Usuario
        Usuario usuario = new Usuario("João");
        Guia guiaGenerica = usuario.criarGuia("Guia God Of War");
        guiaGenerica.publicar();

        // Teste com Autor
        Autor autor = new Autor("Maria");
        Guia guiaAutorSemAnexo = autor.criarGuia("Guia Autor Sem Anexo The Last Of Us", false);
        guiaAutorSemAnexo.publicar();

        Guia guiaAutorComAnexo = autor.criarGuia("Guia Autor Com Anexo EAFC 25", true);
        guiaAutorComAnexo.publicar();
    }
}