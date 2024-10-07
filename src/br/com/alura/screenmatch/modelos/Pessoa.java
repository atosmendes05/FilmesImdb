package br.com.alura.screenmatch.modelos;

public class Pessoa {
    private String nome;
    private int idade;
    private double cpf;

    public Pessoa(String nome,int idade,double cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return  String.format("""
        nome: %S
        idade: %d
        cpf: %,2f       
                
        """,nome,idade,cpf);
    }


}
