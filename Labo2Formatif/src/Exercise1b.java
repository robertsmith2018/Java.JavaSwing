import javax.swing.JOptionPane;

public class Exercise1b {

	public static void main(String[] args) {

		int nombre;
		int n;
		int compteur = 1;
		int somme = 0;
		long produit = 1;
		double moyenne;
		String saisie;

		do {
			saisie = JOptionPane.showInputDialog("Donner le nombre de valeurs a saisir");
			n = Integer.parseInt(saisie);

		} while (n <= 0);

		do {
			saisie = JOptionPane.showInputDialog("Entrer la " + compteur + " e valeur");
			nombre = Integer.parseInt(saisie);
			somme += nombre;
			produit *= nombre;
			compteur++;
		} while (compteur <= n);
		moyenne = (double) somme / n;

		JOptionPane.showInputDialog(null, "La Somme des nombres est : " + somme + "\nLe produit des hombres est "
				+ produit + "\nLa moyenne des hombres est : " + moyenne);

	}

}
