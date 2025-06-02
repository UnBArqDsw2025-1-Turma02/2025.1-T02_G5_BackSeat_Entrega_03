public class Busca_Texto_Digitado extends Busca {
    private String texto;

    public Busca_Texto_Digitado(String texto) {
        this.texto = texto;
    }

    @Override
    public void comporBusca() {
        System.out.println("[TEXTO] Texto digitado: " + texto);
    }

    @Override
    public void analisarBusca() {
        // Análise adicional se quiser
    }
}
