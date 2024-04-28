import com.aluracursos.ChallengeConversorDeMoneda.Monedas.ConversionesDeMonedas;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class API {

    public void obtencionDeApi() {

        Scanner lectura = new Scanner(System.in);
        String moneda = "";
        String monedaDeCambio = "";
        int opcionDelUsuario = 0;

        opcionDelUsuario = lectura.nextInt();
        switch(opcionDelUsuario) {

            case 1:
                moneda = "USD";
                monedaDeCambio = "ARS";
        }


        Gson gson = new Gson();


        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/87a9fe6a962c5f3f9504b1de/pair/USD/BRL"))
                    .build();

            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            ConversionesDeMonedas conversionDeMoneda = gson.fromJson(json, ConversionesDeMonedas.class);
            Conversion conversion = new Conversion(conversionDeMoneda); //tengo el valor de la moneda







        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
