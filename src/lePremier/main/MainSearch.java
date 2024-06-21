package lePremier.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {

    public static void main(String []args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Search for a movie title ...");
        var search=scan.nextLine();
        String address="https://www.omdbapi.com/?t="+search+"&apikey=b4451ba3";       //got from javadoc both request and response
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            //    .uri(URI.create("https://www.omdbapi.com/?t=the+nun&apikey=b4451ba3"))
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
