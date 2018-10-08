import javax.swing.JOptionPane;

public class Exercise2b {

	public static void main(String[] args) {

	
		int n;

		long fact = 1;

		int compteur;

		String saisie;

		do{
		saisie = JOptionPane.showInputDialog("Donner un nombre pour calculer son factorielle");
		n = Integer.parseInt(saisie) ;

		}while(n< 0) ;


		for(compteur = 1; compteur <= n; compteur++){
		fact *= compteur;

		}


	JOptionPane.showInputDialog(null,"La Factorielle de "+n+" est "+fact);

}

}
