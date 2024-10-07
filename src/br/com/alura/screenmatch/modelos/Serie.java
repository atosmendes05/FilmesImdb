package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporada;
    private  int numeroDeEps;
    private int minutosPorEps;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }


    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getNumeroDeEps() {
        return numeroDeEps;
    }

    public void setNumeroDeEps(int numeroDeEps) {
        this.numeroDeEps = numeroDeEps;
    }

    public int getMinutosPorEps() {
        return minutosPorEps;
    }

    public void setMinutosPorEps(int minutosPorEps) {
        this.minutosPorEps = minutosPorEps;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * numeroDeEps * minutosPorEps;
    }

    @Override
    public String toString() {
        return this.getNome() + "(" + this.getAnoLancamento() + ")";
    }
}
