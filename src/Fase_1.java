import javax.swing.JOptionPane;// importa el paquet JOptionPane.

public class Fase_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String Ciutat ="";
			String Ciutat1 = "";
			String Ciutat2 = "";
			String Ciutat3 = "";
			String Ciutat4 = "";
			String Ciutat5 = "";
			
											
			Ciutat = JOptionPane.showInputDialog("Introdueix el nom d'una ciutat: ");
			System.out.println(Ciutat);
			
			Ciutat1 = JOptionPane.showInputDialog("Introdueix el nom d'una ciutat: ");
			System.out.println(Ciutat1);
			
			Ciutat2 = JOptionPane.showInputDialog("Introdueix el nom d'una ciutat: ");
			System.out.println(Ciutat2);
			
			Ciutat3 = JOptionPane.showInputDialog("Introdueix el nom d'una ciutat: ");
			System.out.println(Ciutat3);
			
			Ciutat4 = JOptionPane.showInputDialog("Introdueix el nom d'una ciutat: ");
			System.out.println(Ciutat4);
			
			Ciutat5 = JOptionPane.showInputDialog("Introdueix el nom d'una ciutat: ");
			System.out.println(Ciutat5);
	}

}

/*- Crea sis variables tipu string buides.
- Demana per consola que s’introdueixin els noms.
- Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per
teclat.
- Mostra per consola el nom de les 6 ciutats.
*/