import javax.swing.JOptionPane;

public class SaisieDeMotDePasse {

	public static void main(String[] args) {
		String motDePasse;
		String confirmation;
		int retour;
		do{
				motDePasse = JOptionPane.showInputDialog("Entrer le mot de passe");
				confirmation = JOptionPane.showInputDialog("Confirmer le mot de passe");
				retour = veri£ierMotDePasse(motDePasse, confirmation);
				String message = null;
				switch(retour){
						case 0 : message = "Mot de passe correct\n\nFin du programme";
						break;
						case 1 : message = "Mot de passe non confirmé";
						break;
						case 2 : message = "Le mot de passe doit avoir 10 a 16 caractéres";
						break;
						case 3 : message = "Le mot de passe doit commencer par une lettre majuscule";
						break;
						case 4 : message = "Le mot de passe doit contenir des lettres ou des chiffres";
						break;
				}
						JOptionPane.showMessageDialog(null, message);
			}while(retour != 0);
		
	}
	
	public static int veri£ierMotDePasse(String password, String confirmation) {
		int validationPassword = 0;
		if (!password.equals(confirmation)) {
			validationPassword = 1;
		} else {
					int nombreCaracteres = password.length();
					if (nombreCaracteres < 10 || nombreCaracteres > 16) {
								validationPassword = 2;
								} else {
										if (!Character.isUpperCase(password.charAt(0))) {
											validationPassword = 3;
										} else {
											boolean estLettreOuChiffre = true;
											for (int i = 0; i < password.length() && (estLettreOuChiffre == true); i++){
												if (!Character.isLetterOrDigit(password.charAt(i))) {
													validationPassword = 4;
													estLettreOuChiffre = false;
												}
											}
										}
								}
			}

			return validationPassword;
	}

}
