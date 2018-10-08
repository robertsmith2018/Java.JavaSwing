import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Addition2 {

	public static void main(String[] args) {
		final int SENTINELLE = -1; 
		
		JTextArea sortie = new JTextArea();
		int nombre,
		somme = 0; 
		nombre = Integer.parseInt(JOptionPane.showInputDialog
		("Entrez un nombre ou " + SENTINELLE + " pour quitter:"));
		while (nombre != SENTINELLE)
		{
		somme += nombre; 
		nombre = Integer.parseInt(JOptionPane.showInputDialog 
				("Entrez un nombre ou " + SENTINELLE +" pour quitter:"));
		} 
		
		sortie.append("\n\nLa somme des nombres est " + somme); 
		JOptionPane.showMessageDialog(null, sortie, "RÉSULTATS", JOptionPane.PLAIN_MESSAGE);

	}

}
