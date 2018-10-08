import javax.swing.JOptionPane;

public class hub {

	public static void main(String[] args) {

		int choix;
		choix = Integer.parseInt(JOptionPane.showInputDialog ("1: Choix 1\n2: Choix 2\n3: Quitter" + "\n Entrez votre choix (1, 2 ou 3)")); 
		switch(choix) { 
			case 1: 
			case 2: 
			JOptionPane.showMessageDialog(null,"Choix " + choix); 
			
			break; 
			case 3: JOptionPane.showMessageDialog(null,"Au revoir"); 
			break; 
			default: JOptionPane.showMessageDialog(null, "Choix invalide", "ERREUR", JOptionPane.ERROR_MESSAGE); 
			} //fin

		}
		
	
	}
