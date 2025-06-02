public class Busca_Tag extends Busca {
    private String tag;

    public Busca_Tag(String tag) {
        this.tag = tag;
    }

    @Override
    public void comporBusca() {
        System.out.println("[TAG] Tag encontrada: " + tag);
    }

    @Override
    public void analisarBusca() {
        // Lógica de análise de tag, se quiser
    }
}
