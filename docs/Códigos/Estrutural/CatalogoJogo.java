import java.util.ArrayList;
import java.util.List;

public class CatalogoJogo {
    private List<Jogo> jogos = new ArrayList<>();

    public CatalogoJogo() {
        jogos.add(new Jogo("Minecraft", "aventura"));
        jogos.add(new Jogo("Call of Duty", "acao"));
        jogos.add(new Jogo("GTA V", "acao"));
        jogos.add(new Jogo("Outlast", "terror"));
        jogos.add(new Jogo("Resident Evil", "terror"));
        jogos.add(new Jogo("Stardew Valley", "simulacao"));
    }

    public List<Jogo> buscarPorTag(String tag) {
        List<Jogo> resultado = new ArrayList<>();
        for (Jogo jogo : jogos) {
            if (jogo.getTag().equalsIgnoreCase(tag)) {
                resultado.add(jogo);
            }
        }
        return resultado;
    }
}
