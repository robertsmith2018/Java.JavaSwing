import javax.swing.JOptionPane;

public class Exercise3 {

	public static void main(String[] args) {

		int x;
		int N;
		float produit;
		int compteur;
		String saisie;

		saisie = JOptionPane.showInputDialog("Enter la valeur as X : ");
		x = Integer.parseInt(saisie);
		saisie = JOptionPane.showInputDialog("Enter la valeur as N : ");

		N = Integer.parseInt(saisie);

		produit = 1.0f;
		if (N > 0) {
			for (compteur = 1; compteur <= N; compteur++) {
				produit *= x;
			}
		}

		else if (N < 0) {
			for (compteur = 1; compteur <= -N; compteur++) {
				produit *= x;
			}
			produit = 0.1f / produit;

		}

		else {

			produit = 0;
		}

		if (!(x == 0 && N < 0))
			JOptionPane.showMessageDialog(null, x + " puissance " + N + " = " + produit);
		else
			JOptionPane.showMessageDialog(null, "\"Erreur\"  N doit etre positif lorsque x=0 ");

	}

}
