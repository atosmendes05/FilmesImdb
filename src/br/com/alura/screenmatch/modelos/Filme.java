package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String direto;

    public Filme(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }


    public String getDireto() {
        return direto;
    }

    public void setDireto(String direto) {
        this.direto = direto;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacao() / 2;
    }

    @Override
    public String toString() {
        return this.getNome() + "(" + this.getAnoLancamento() + ")";
    }
}
