import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {
public Principal consulta (double cantidadMoneda){
    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/993274b7eae5c47e38da5cb9/latest/USD");

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(direccion)
            .build();

    try {
        HttpResponse<String> response = null;
        response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
    return new Gson().fromJson(response.body(), Principal.class);
    } catch (Exception e) {
        throw new RuntimeException("No se encontro la divisa de ese pais¡");
    }
}

}
