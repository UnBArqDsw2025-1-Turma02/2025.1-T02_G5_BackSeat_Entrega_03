public class ExemploReporteSimples {
    public static void main(String[] args) {

        NotificadorDeReporte notificador = new NotificadorDeReporte();
        Moderador moderadorY = new Moderador("Galdinovski");
        
        notificador.inscreverModerador(moderadorY);

        Usuario usuarioX = new Usuario("fulano-de-tal");

        System.out.println("\n--- CRIAÇÃO DO GUIA ---");
        Guia meuGuia = usuarioX.criarGuia("Como matar um sim (The Sims 4)", notificador);

        System.out.println("\n--- GUIA SENDO REPORTADO PELA PRIMEIRA VEZ---");
        meuGuia.serReportado();
        System.out.println("Guia reportado! Quantidade de reports: " + meuGuia.getQuantidadeDeReports());
        
        System.out.println("\n--- SEGUNDO REPORT ---");
        meuGuia.serReportado();
        System.out.println("Guia reportado! Quantidade de reports: " + meuGuia.getQuantidadeDeReports());

        System.out.println("\n--- TERCEIRO REPORT ---");
        meuGuia.serReportado();
        System.out.println("Guia reportado! Quantidade de reports: " + meuGuia.getQuantidadeDeReports());
    }
}