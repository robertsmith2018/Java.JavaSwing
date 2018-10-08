
public class Exercise6 {

	public static void main(String[] args) {

		char menu;
		do {
			System.out.print("------------MENU------------\n");
			System.out.print("	O)	Ouvrir un fichier\n");
			System.out.print("	N)	Nouveau fichier\n");
			System.out.print("	I)	Imprimer le fichier\n");
			System.out.print("	F)	Fermer le fichier\n");
			System.out.print("	S)	Sauvegarder le fichier\n");
			System.out.print("	Q)	Quitter le programme\n");
			System.out.print("\nChoisir une option:");
			menu = Clavier.lireChar();
			Clavier.viderTampon();

			switch (menu) {
			case 'o':
			case 'O': {
				System.out.println("\n Ouvrir un Fichier ......\n");
			}
				break;
			case 'n':
			case 'N': {
				System.out.println("\n Nouveau fichier ......\n");
			}
				break;
			case 'i':
			case 'I': {
				System.out.println("\n Imprimer le fichier ......\n");
			}
				break;
			case 'f':
			case 'F': {
				System.out.println("\n Fermer le fichier ......\n");
			}
				break;
			case 'S':
			case 's': {
				System.out.println("\n Fermer le fichier ......\n");
			}
				break;
			case 'q':
			case 'Q': {
				System.out.println("\n Quitter le programme ......\n");
			}
				break;
			default:
				System.out.println("\n Mauvais choix\n");

			}

		} while ((menu != 'q') && (menu != 'Q'));
	}		
}
