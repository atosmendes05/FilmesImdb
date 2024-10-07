package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificacao;

public class Episodio implements Classificacao {
    private String nome;
    private  int numero;
    private Serie serie;
    private  int totalVizulizacao;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVizulizacao() {
        return totalVizulizacao;
    }

    public void setTotalVizulizacao(int totalVizulizacao) {
        this.totalVizulizacao = totalVizulizacao;
    }

    @Override
    public int getClassificacao() {
        if(totalVizulizacao > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
