import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        String key = "AIzaSyDq4MK2k4foNWxUawdcUMOBMfwahe6nUdc";

        System.out.print("Digite um livro para buscar: ");
        String query = input.nextLine();
        String address = "https://www.googleapis.com/books/v1/volumes?q=" + query + ":&key=" + key;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =  HttpRequest.newBuilder().uri(URI.create(address)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}