
public class Exercise1a {

	public static void main(String[] args) {
		
		int n;

		int nombre;
		boolean ok = true;
		int somme = 0;
		long produit = 1;
		double moyenne;
		int compteur = 1;
	
		/*do{
		System.out.print("Enter la valeur de N : ");
		n = Clavier.lireInt();

		} while(n < 1);

	*/
		do{
		System.out.print("Enter la valeur de N : ");
		n = Clavier.lireInt();
		ok = false;
		}while ( ok == true);

		while (compteur <= n){
		System.out.print("Entrer le " + compteur + " e nombre : ");
		nombre = Clavier.lireInt();
		somme += nombre;
		produit *= nombre;

		compteur++;
		}
		moyenne=(double) somme/n;
		System.out.println("La somme des nombres est : " + somme);
		System.out.println("La moyenne des nombres est : " + moyenne);
		System.out.println("Le produit des nombres est : " + produit);

	}

}
