package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class Calculo {
    private  int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluiFilme(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int tempoEmHora(){
        return tempoTotal / 60;
    }
}
