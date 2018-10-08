
public class Exercise8 {

	public static void main(String[] args) {

		int jour;
		int mois;
		int annee;
		boolean estValide = true;

		System.out.print("Entrer 1e jour : ");
		jour = Clavier.lireInt();
		System.out.print("Entrer 1e mois : ");
		mois = Clavier.lireInt();
		System.out.print("Entrer 1e année : ");

		annee = Clavier.lireInt();

		switch (mois) {

		case 1:

		case 3:

		case 5:

		case 7:

		case 8:

		case 10:

		case 12: {
			if (jour < 1 || jour > 31) {
				estValide = false;
			}
		}
			break;
		case 4:
		case 6:
		case 9:
		case 11: {
			if (jour < 1 || jour > 30) {
				estValide = false;
			}
		}
			break;

		case 2: {
			if (jour < 1 || jour > 28) {
				estValide = false;
			} else if (jour == 29) {
				if (annee % 4 == 0) {
					estValide = false;
				} else if ((annee % 100 == 0) && (annee % 400 != 0)) {
					estValide = false;
				}
			} // Fin Else if
		} // Fin Case 2

		default: {
			estValide = false;
		} // Fin default
		}
		if (estValide) {
			System.out.println("La date " + jour + "/" + mois + "/" + annee + " est valide");

		} else {

			System.out.println("La date " + jour + "/" + mois + "/" + annee + " n'est pas valide");

		}
	}// Fin main

}
