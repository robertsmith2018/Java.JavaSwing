import javax.swing.JOptionPane;

public class Exercise1c {

	public static void main(String[] args) {
			
		int nombre;
		int n;
		int compteur;
		int somme = 0;
		long produit =1;
		double moyenne;
		String saisie ;

		do {
		saisie = JOptionPane.showInputDialog("Donner Le nombre de valeurs à saisir" ) ;
		n = Integer.parseInt (saisie) ;

		}while(n <= 0);

		for(compteur = 1; compteur <= n; compteur++) {
		saisie =JOptionPane.showInputDialog("Entrer la " + compteur + " e valeur") ;
		nombre = Integer.parseInt(saisie) ;
		somme += nombre;
		produit *=nombre ;
		} 

		moyenne = (double) somme/n;

		

		JOptionPane.showInputDialog(null,"La Somme des nombres est : " + somme +
		"\nLe produit des hombres est : " + produit +
		"\nLa moyenne des hombres est " + moyenne);



	}

}
