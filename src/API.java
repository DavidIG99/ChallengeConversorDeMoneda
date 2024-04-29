import com.aluracursos.ChallengeConversorDeMoneda.Monedas.ConversionesDeMonedas;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.Scanner;

public class API {


    public void obtencionDeApi(String monedaSinConvertir , String monedaConvertida, double valorAConvertir) {

        Gson gson = new Gson();

        try {

            String direccion = "https://v6.exchangerate-api.com/v6/87a9fe6a962c5f3f9504b1de/pair/" + monedaSinConvertir + "/" + monedaConvertida;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            ConversionesDeMonedas conversionDeMoneda = gson.fromJson(json, ConversionesDeMonedas.class);
            Conversion conversion = new Conversion(conversionDeMoneda);
            Opciones opciones = new Opciones();
            var multiplicacion =conversion.valorDeMoneda * valorAConvertir;
            System.out.println("el valor de " + valorAConvertir + " [" + monedaSinConvertir + "] Es igual a " + multiplicacion + " [" + monedaConvertida +"]");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
