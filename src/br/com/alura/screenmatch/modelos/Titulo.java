package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvalicao;
    private int duracaoEmMinutos;

    public  Titulo(String nome,int anoLancamento){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }


    public void exibirFicha(){
        System.out.println("nome do filme " + nome);
        System.out.println("ano de lançamento " + anoLancamento);
        System.out.println("duraçao do filme " + duracaoEmMinutos);
        System.out.println("avaliaçao: " + somaAvaliacao);
    }

    public void avalia(double nota){
        somaAvaliacao = somaAvaliacao + nota;
        totalDeAvalicao++;
    }

    public double mediaAvaliacao(){
        return  somaAvaliacao / totalDeAvalicao;
    }

    public void setSomaAvaliacao(double valor){
        this.somaAvaliacao = valor;
    }

    public int getTotalDeAvalicao(){
        return  totalDeAvalicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

}
