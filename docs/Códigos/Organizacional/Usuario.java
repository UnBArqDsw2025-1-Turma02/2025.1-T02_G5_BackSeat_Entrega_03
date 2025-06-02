class Usuario {
    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Guia criarGuia(String titulo, NotificadorDeReporte notificador) {
        System.out.println(this.nome + " criou o guia: '" + titulo + "'");
        return new Guia(titulo, this, notificador);
    }
}