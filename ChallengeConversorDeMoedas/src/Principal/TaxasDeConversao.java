package Principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public record TaxasDeConversao(Object conversion_rates) {
	public String toString() {
		
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();

		Gson gson = builder.create();
		
		String conversionRates = gson.toJson(conversion_rates);
		
		return conversionRates.toLowerCase();
	}
}
