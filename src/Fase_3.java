import java.util.Arrays;

public class Fase_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String [] arrayCiutatsModificades = new String [6]; --> Per inicialitzar array amb valor per defecte
		
				
		String [] arrayCiutatsModificades = {"B4rcelon4","M4drid","V4lenci4","M4l4ga","C4dis","S4nt4nder"};
		
		Arrays.sort(arrayCiutatsModificades); 
        System.out.println(Arrays.toString(arrayCiutatsModificades));
	}

}


/*
- Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades).

- Mostreu per consola l’array modificat i ordenat per ordre alfabetic.*/