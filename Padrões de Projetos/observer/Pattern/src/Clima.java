import java.util.ArrayList;
import java.util.List;

public class Clima {

    private String climaAtual;
    private List<Individuo> pessoa = new ArrayList<>();

    public void inscrever(Individuo Individuo) {
        this.pessoa.add(Individuo);
    }

    public void desinscrever(Individuo Individuo) {
        this.pessoa.remove(Individuo);
    }

    public void setclima(String clima) {
        this.climaAtual = clima;

        for (Individuo Individuo : this.pessoa) {
            Individuo.update(this.climaAtual);
        }
    }

} 

