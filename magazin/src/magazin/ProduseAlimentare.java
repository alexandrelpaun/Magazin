package magazin;

public class ProduseAlimentare extends Produs {
	int valabilitate;
	
	public ProduseAlimentare(String nume, double pret, int valabilitate) {
		
		this.nume = nume;
		this.pret = pret;
		this.valabilitate = valabilitate;
		
	}
	
	public ProduseAlimentare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	
	public String toString() {
		return "Acest produs se numeste " + " " + "costa" +  " " + this.pret + " " + "are o valabilitate de " + " " + this.valabilitate + "!"  ;
	}

}
