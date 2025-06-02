import java.util.*;

public class TelaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CatalogoJogo catalogo = new CatalogoJogo();
        Busca_Composta buscaComposta = new Busca_Composta();

        System.out.print("Digite sua busca: ");
        String entrada = scanner.nextLine().toLowerCase();

        buscaComposta.analisarTextoUsuario(entrada);

        // Buscar jogos se alguma tag for detectada
        for (String palavra : entrada.split(" ")) {
            if (CatalogoJogo.class.getDeclaredFields().length > 0 && buscaComposta != null) {
                List<Jogo> encontrados = catalogo.buscarPorTag(palavra);
                if (!encontrados.isEmpty()) {
                    System.out.println("\n>> Jogos com a tag '" + palavra + "':");
                    for (Jogo jogo : encontrados) {
                        System.out.println("- " + jogo.getNome());
                    }
                }
            }
        }

        System.out.println("\n>> Composição da busca:");
        buscaComposta.comporBusca();
    }
}
