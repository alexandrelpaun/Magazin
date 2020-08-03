package magazin;

public class ProdusePapetarie extends Produs {
	
public ProdusePapetarie(String nume, double pret) {
		
		this.nume = nume;
		this.pret = pret;
		
		
	}
	
	public ProdusePapetarie() {
	// TODO Auto-generated constructor stub
}

	@Override
	
	public String toString() {
		return "Acest produs se numeste " + " " + "costa" +  " " + this.pret  + "!"  ;
	}

}
