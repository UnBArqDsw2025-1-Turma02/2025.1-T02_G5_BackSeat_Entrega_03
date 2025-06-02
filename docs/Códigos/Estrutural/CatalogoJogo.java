import java.util.ArrayList;
import java.util.List;

public class CatalogoJogo {
    private List<Jogo> jogos = new ArrayList<>();

    public CatalogoJogo() {
        jogos.add(new Jogo("Minecraft", "aventura"));
        jogos.add(new Jogo("Uncharted", "aventura"));
        jogos.add(new Jogo("Mario", "plataforma"));
        jogos.add(new Jogo("Sonic", "plataforma"));
        jogos.add(new Jogo("Zelda", "aventura"));
        jogos.add(new Jogo("Fallout", "aventura"));
        jogos.add(new Jogo("GTA", "acao"));
        jogos.add(new Jogo("Halo", "acao"));
        jogos.add(new Jogo("Outlast", "terror"));
        jogos.add(new Jogo("Resident Evil", "terror"));
        jogos.add(new Jogo("Roblox", "simulacao"));
        jogos.add(new Jogo("Sims", "simulacao"));
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
