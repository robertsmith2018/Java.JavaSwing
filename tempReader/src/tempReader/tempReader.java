package tempReader;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class tempReader {

	public static void main(String[] args) {
		
		final int SENTINELLE = 25; 
		int tempInput=0,comp=0;
		
		JTextArea sortie = new JTextArea();
		
	while (tempInput < SENTINELLE)
		
		{
			tempInput = Integer.parseInt(JOptionPane.showInputDialog
					("Entrez un nombre ou " + SENTINELLE + " pour quitter:"));
			comp++;
			sortie.append("\nLa "+comp+ " temperature est :" + tempInput); 
		} 
		

		JOptionPane.showMessageDialog(null, sortie, "RÉSULTATS", JOptionPane.PLAIN_MESSAGE);

	}

}
