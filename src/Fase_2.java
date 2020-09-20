import java.util.Arrays;

public class Fase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arrayCiutats  = {"Barcelona","Madrid", "Valencia", 
								   "Malaga","Cadis","Santander"};
		
		
		//Retorna els elements de l'array en ordre ascendent (natural), alfabètic en aquest cas.
        Arrays.sort(arrayCiutats); 
        System.out.println(Arrays.toString(arrayCiutats)); // retorna la representació en String del contingut de l'arryay.
         
	}

}


/*- Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array
(arrayCiutats).
- Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre
alfabetic.*/

