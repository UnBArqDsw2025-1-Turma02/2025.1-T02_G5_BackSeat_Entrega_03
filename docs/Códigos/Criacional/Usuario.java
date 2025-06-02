package br.meuprojeto.usuario;

import br.meuprojeto.guia.Guia;

public class Usuario {

    public String nome;

    public Usuario(String nome) {
        this.nome = nome;
        System.out.println("Usuário criado: " + nome);
    }
    
    public Guia criarGuia(String titulo) {
        return new Guia(titulo); 
    }
}
