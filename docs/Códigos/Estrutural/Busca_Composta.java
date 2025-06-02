import java.util.*;

public class Busca_Composta extends Busca {
    private List<Busca> buscas = new ArrayList<>();

    private static final Set<String> jogosConhecidos = new HashSet<>(Arrays.asList(
        "minecraft", "call", "gta", "outlast", "resident", "stardew" // pode ajustar
    ));

    private static final Set<String> tagsConhecidas = new HashSet<>(Arrays.asList(
        "ação", "terror", "aventura", "simulação", "rpg", "corrida"
    ));

    public void analisarTextoUsuario(String texto) {
        String[] palavras = texto.toLowerCase().split(" ");

        for (String palavra : palavras) {
            if (jogosConhecidos.contains(palavra)) {
                buscas.add(new Busca_Jogo(palavra));
            } else if (tagsConhecidas.contains(palavra)) {
                buscas.add(new Busca_Tag(palavra));
            } else {
                buscas.add(new Busca_Texto_Digitado(palavra));
            }
        }
    }

    public void adicionarBusca(Busca busca) {
        buscas.add(busca);
    }

    @Override
    public void comporBusca() {
        System.out.println(">> Compondo busca composta:");
        for (Busca busca : buscas) {
            busca.comporBusca();
        }
    }

    @Override
    public void analisarBusca() {
        for (Busca busca : buscas) {
            busca.analisarBusca();
        }
    }
}
