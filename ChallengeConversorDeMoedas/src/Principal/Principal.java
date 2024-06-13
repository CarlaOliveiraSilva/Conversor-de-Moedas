package Principal;

import java.util.Scanner;

import EmunahUteis.ConsultaAPI;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.HttpURLConnection;
import java.net.URI;

import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import records.Moedas;
import records.TaxasDeMoedas;

public class Principal {
	public static void main(String[] args) throws IOException {
		
		Scanner leituraDoTeclado = new Scanner(System.in);
		
		int opcaoDeConversao = 0;
		String apresentacao = """
			***********************************************
				Seja bem-vindo(a) ao Conversor de Moeda!
				
			1) Dólar =>> Peso argentino
			2) Peso argentino =>> Dólar
			3) Dólar =>> Real brasileiro
			4) Real brasileiro =>> Dólar
			5) Dólar =>> Peso colombiano
			6) Peso colombiano =>> Dólar
			7) Sair
			Escolha uma opção válida:
			***********************************************
							""";
				
		ConsultaAPI consultaAPI = new ConsultaAPI();
				
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		Converte conversaoDeMoeda = new Converte();
		
		while(opcaoDeConversao != 7) {
		
			System.out.println(apresentacao);
			
			opcaoDeConversao = leituraDoTeclado.nextInt();
			
			TaxasDeConversao conversionRates = gson.fromJson(consultaAPI.consulta(), TaxasDeConversao.class);
			
			String taxasDeConversao = conversionRates.toString();
			
			Moedas moedas = gson.fromJson(taxasDeConversao, Moedas.class);
			
			TaxasDeMoedas taxas = new TaxasDeMoedas(moedas);
			

			System.out.println("Digite o valor que deseja converter:");			
					
			conversaoDeMoeda.converte(leituraDoTeclado.nextDouble(), moedas, opcaoDeConversao);
		}
	}
}
