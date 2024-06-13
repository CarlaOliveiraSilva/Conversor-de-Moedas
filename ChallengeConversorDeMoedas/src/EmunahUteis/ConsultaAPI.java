package EmunahUteis;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConsultaAPI {
	
	public String consulta() {
	
		String apiKey = "f878c65ff38c15d7cbc2a772";
		String endereco = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";
		String json = "";
		
		HttpClient cliente = HttpClient.newHttpClient();
		HttpRequest solicitacao = HttpRequest.newBuilder()
				.uri(URI.create(endereco))
				.build();
		
		try {
			HttpResponse<String> resposta = cliente.send(solicitacao, HttpResponse.BodyHandlers.ofString());
			json = resposta.body();
		} catch(Exception e) {
			System.out.println("Ocorreu um erro ao obter os dados da API");
		}
		
		return json;
	}
}