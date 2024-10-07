package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class FiltroRecomendacao {


    public void filtro(Classificacao titulo){
        if(titulo.getClassificacao() >= 4){
            System.out.println("O mais recomendado no momento");
        }else if(titulo.getClassificacao() >=2 ){
            System.out.println("Recomendado");
        }else {
            System.out.println("menos recomendado");
        }
    }
}
