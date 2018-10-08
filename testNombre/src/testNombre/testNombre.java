package testNombre;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class testNombre {

	public static void main(String[] args) {
		int quantite;
		double prixUnitaire;
		try {
			quantite = Integer.parseInt(JOptionPane.showInputDialog("Entrer la quantité"));
			prixUnitaire = Double.parseDouble(JOptionPane.showInputDialog("Entrer le prix unitaire"));
			double total = quantite * prixUnitaire;
			JOptionPane.showMessageDialog(null, "Le cout total est:"+total);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Il faut saisir un nombre");
			
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "Fin du programme");
	}

}
