package magazin;
import java.util.*;

public class Magazin {
	private ArrayList<Produs> listeProduse = new ArrayList<Produs>();
	 private static Magazin instance;
	private Magazin(){
	    
    }
    
    public static final Magazin getInstance(){
    	
        if(instance == null)
            instance = new Magazin();
            
        return instance;  
             
       }
    
    public void afiseazaProdus() {
    	
    	listeProduse.forEach(System.out::println);
    	
    }
    public void  adaugaProdus(ProdusePapetarie p){
    	
    	if (p instanceof ProdusePapetarie ) {
        	System.out.println("Sa-a adaugat un produs de papetarie ");
        }else{
        	System.out.println("S-a adaugat un produs alimentar ");
        }
    	
    	listeProduse.add(p);
    	
    }
    public boolean verificaProdus(String nume){
    	
    	System.out.println(listeProduse.contains(nume));
    	return true;
    	
    	
    }
    public void stergeProdus(int index){
    	listeProduse.remove(index);
    	
    	
    }
    }

