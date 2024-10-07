package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Listas {
    public static void main(String[] args) {


        Serie lost = new Serie("lost",2007);
        Filme segundoFilme = new Filme("velores e furiosos",2001);
        Filme meuFilme = new Filme("Topgun",2021);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(lost);
        lista.add(segundoFilme);
        lista.add(meuFilme);

        meuFilme.avalia(8);
        segundoFilme.avalia(8);



        for (Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("classificaçao " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaAtor = new ArrayList<>();
        buscaAtor.add("merilu");
        buscaAtor.add("atos");
        buscaAtor.add("neto");

        System.out.println(buscaAtor);

        Collections.sort(buscaAtor);
        System.out.println("depois da ordenaçao");
        System.out.println(buscaAtor);

        System.out.println("lista de filmes depois da ordenaçao");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("ordenado por ano de lançamento");
        System.out.println(lista);

    }
}
