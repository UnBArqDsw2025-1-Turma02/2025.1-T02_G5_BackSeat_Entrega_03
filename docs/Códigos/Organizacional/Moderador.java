class Moderador {
    String nome;

    public Moderador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void receberNotificacaoGuiaReportado(String tituloGuia, String nomeAutor) {
        System.out.println("MODERADOR " + this.nome + " AVISADO: (Guia novo reportado: " + tituloGuia + " do usuário " + nomeAutor + ")");
    }
}