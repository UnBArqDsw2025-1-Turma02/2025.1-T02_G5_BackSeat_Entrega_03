import java.util.ArrayList;
import java.util.List;

class NotificadorDeReporte {
    private List<Moderador> moderadoresInscritos = new ArrayList<>();

    NotificadorDeReporte() {
    }

    public void inscreverModerador(Moderador moderador) {
        this.moderadoresInscritos.add(moderador);
        System.out.println("Moderador " + moderador.getNome() + " cadastrado no sistema.");
    }

    public void notificarModeradores(Guia guia) {
        System.out.println("Notificador: Enviando alerta sobre o guia '" + guia.getTitulo() + "'...");
        for (Moderador moderador : moderadoresInscritos) {
            moderador.receberNotificacaoGuiaReportado(guia.getTitulo(), guia.getAutor().getNome());
        }
    }
}