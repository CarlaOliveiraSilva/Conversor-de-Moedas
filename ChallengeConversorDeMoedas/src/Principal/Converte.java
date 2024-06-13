package Principal;

import records.Moedas;

public class Converte {
	double valorConvertido;
	double moeda;
	
	public void converte(double valor, Moedas moedas, int opcaoDeConversao) {
		
		
		switch (opcaoDeConversao) {
			case 1: {
				
				valorConvertido = valor * Double.valueOf(moedas.ars()).doubleValue();
				
				System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>>> " +
				valorConvertido + " [ARS]");
				
				break;
			}
			
			case 2: {
				valorConvertido = valor / Double.valueOf(moedas.ars()).doubleValue();
				
				System.out.println("Valor " + valor + " [ARS] corresponde ao valor final de =>>> " +
				valorConvertido + " [USD]");
				
				break;
			}
			case 3: {
				
				valorConvertido = valor * Double.valueOf(moedas.brl()).doubleValue();
				
				System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>>> " +
				valorConvertido + " [BRL]");
				
				break;
			}
			
			case 4: {
				valorConvertido = valor / Double.valueOf(moedas.brl()).doubleValue();
				
				System.out.println("Valor " + valor + " [BRL] corresponde ao valor final de =>>> " +
				valorConvertido + " [USD]");
				
				break;
			}
			case 5: {
				
				valorConvertido = valor * Double.valueOf(moedas.cop()).doubleValue();
				
				System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>>> " +
				valorConvertido + " [COP]");
				
				break;
			}
			
			case 6: {
				valorConvertido = valor / Double.valueOf(moedas.cop()).doubleValue();
				
				System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>>> " +
				valorConvertido + " [COP]");
				
				break;
			}
		}

		

	}
}


