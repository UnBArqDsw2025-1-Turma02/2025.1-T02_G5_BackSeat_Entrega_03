class Guia {
    String titulo;
    Usuario autor;
    NotificadorDeReporte notificador;
    boolean reportado;
    int quantidadeDeReports;

    public Guia(String titulo, Usuario autor, NotificadorDeReporte notificador) {
        this.titulo = titulo;
        this.autor = autor;
        this.notificador = notificador;
        this.reportado = false;
        this.quantidadeDeReports = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public Usuario getAutor() {
        return autor;
    }

    public boolean isReportado() {
        return reportado;
    }

    public int getQuantidadeDeReports() { 
        return quantidadeDeReports;
    }

    public void serReportado() {
        if (!this.reportado) {
            this.reportado = true;
            this.quantidadeDeReports = 1;
            System.out.println("O guia '" + this.titulo + "' foi reportado pela primeira vez.");
            this.notificador.notificarModeradores(this);
        } else {
            this.quantidadeDeReports++;
            System.out.println("O guia '" + this.titulo + "' já havia sido reportado. Este é o reporte de número " + this.quantidadeDeReports + ".");
            // this.notificador.notificarModeradores(this);
        }
    }
}