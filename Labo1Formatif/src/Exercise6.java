package anneeBisextile1;

import javax.swing.JOptionPane;

public class Exercise6 {

	public static void main(String[] args) {

		int annee;
		boolean anneeBisex = true;
		String saisie;

		saisie = JOptionPane.showInputDialog("Entrer une année pour savoir si elle est bisextile");
		annee = Integer.parseInt(saisie);

		if (annee % 4 != 0) {
			anneeBisex = false;
		} else if (annee % 100 == 0 && annee % 400 != 0) {
			anneeBisex = false;

		}

		if (anneeBisex) {

			JOptionPane.showInputDialog(null, annee + " Est une année bisextile!");
		} else {

			JOptionPane.showInputDialog(null, annee + " N\'est pas une année bisextile!");

		}

	}

}
