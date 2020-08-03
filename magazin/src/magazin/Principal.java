package magazin;
import java.util.Scanner;

public class Principal {

	public static void main(String [] args) {
		
		Magazin magazin = Magazin.getInstance();
		Scanner sc = new Scanner(System.in);
		
		while(true){
            System.out.println("Introduecti tipul produsului si datele: ");
            String s = sc.nextLine();
            String [] s1 = s.split(" ");
            
            if(s1[0].equals("exit")){
                System.out.println("Inchidem bucla de while");
                break;
            }
            
            if(s1[0].equals("adaugaPapetarie")){
            	Produs produsPapetarie = new ProdusePapetarie();
              
            }
            else{
                if(s1[0].equals("adaugaAlimentar")){
                	Produs produsAlimentar = new ProduseAlimentare();
               
                }else{
                   System.out.println("Comanda gresita");
                }
		
}
			
   }
	  }
	     }
