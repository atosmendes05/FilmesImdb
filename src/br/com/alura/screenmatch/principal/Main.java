package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.Calculo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Pessoa;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Topgun",2021);
        meuFilme.setDuracaoEmMinutos(154);
        meuFilme.setSomaAvaliacao(5.5);


        meuFilme.avalia(3.2);
        meuFilme.avalia(2.5);
        meuFilme.exibirFicha();
        System.out.println("media da avaliaçao: " + meuFilme.mediaAvaliacao());
        System.out.println(meuFilme.getTotalDeAvalicao());

        Filme segundoFilme = new Filme("velores e furiosos",2001);
        segundoFilme.setDuracaoEmMinutos(130);




        Serie lost = new Serie("lost",2007);
        lost.setTemporada(7);
        lost.setNumeroDeEps(70);
        lost.setMinutosPorEps(20);
        System.out.println("duraçao: " + lost.getDuracaoEmMinutos());


        Calculo calculadora = new Calculo();
        calculadora.incluiFilme(meuFilme);
        calculadora.incluiFilme(segundoFilme);
        calculadora.incluiFilme(lost);
        System.out.println("soma total: " + calculadora.getTempoTotal());
        System.out.println("soma todal em horas: " + calculadora.tempoEmHora());

        FiltroRecomendacao meuFiltro = new FiltroRecomendacao();
        meuFiltro.filtro(meuFilme);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setNome("piloto");
        episodio.setTotalVizulizacao(100);
        meuFiltro.filtro(episodio);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(segundoFilme);
        System.out.println("filmes adicionado na lista de filmes " + listaDeFilmes.size());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);

        listaDeFilmes.forEach(filme -> {
            System.out.println("vendo os filmes pelo metodo forEach " + filme);
        });


        Pessoa atos = new Pessoa("atos",22,073.080);
        System.out.println(atos);


    }

}