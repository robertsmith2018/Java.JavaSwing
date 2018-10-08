import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class addition {

	public static void main(String[] args) {
		final int SENTINELLE = -1; 
		int nombre,
		somme = 0; 
		nombre = Integer.parseInt(JOptionPane.showInputDialog
		("Entrez un nombre ou " + SENTINELLE +
		" pour quitter:"));
		while (nombre != SENTINELLE)
		{
		somme += nombre; 
		nombre = Integer.parseInt(JOptionPane.showInputDialog
		("Entrez un nombre ou " + SENTINELLE +
		" pour quitter:"));
		} 
		
		
		JOptionPane.showMessageDialog(null, somme, "RÉSULTATS",
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0);

	}

}
