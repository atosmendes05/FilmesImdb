package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Buscar {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lerFilme = new Scanner(System.in);
        System.out.println("Digite o nome do filme:");

        String filme = lerFilme.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t="+filme+"&apikey=38124d1e"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        Gson gson = new Gson();
        Titulo meutitulo = gson.fromJson(response.body(), Titulo.class);
        System.out.println("titulo: " + meutitulo.getNome() +  ", ano de lançamento: " + meutitulo.getAnoLancamento());




    }
}
