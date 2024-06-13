package records;

public class TaxasDeMoedas {
	public String usd;
	public String ars;
	public String brl;
	public String cop;
	
	public TaxasDeMoedas(Moedas moedas) {
		this.usd = moedas.usd();
		this.ars = moedas.ars();
		this.brl = moedas.brl();
		this.cop = moedas.cop();
	}
	
	public String toString() {
		return usd;
	}
}
