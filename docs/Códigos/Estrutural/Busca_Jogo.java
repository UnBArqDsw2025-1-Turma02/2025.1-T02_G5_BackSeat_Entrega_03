public class Busca_Jogo extends Busca {
    private String nomeJogo;

    public Busca_Jogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    @Override
    public void comporBusca() {
        System.out.println("[JOGO] Jogo encontrado: " + nomeJogo);
    }

    @Override
    public void analisarBusca() {
        // Pode adicionar lógica adicional se quiser
    }
}
