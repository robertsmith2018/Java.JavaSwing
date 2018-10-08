import javax.swing.JOptionPane;

public class Exercise7b {

	public static void main(String[] args) {
		String codePostal;
		do {
			codePostal=JOptionPane.showInputDialog("Entrer le code postal a verifier ou 0 pour quitter");
			if(!codePostal.equals("0")) {
				if(codePostal.matches("[a-zA-Z][0-9][a-zA-Z] [0-9][a-zA-Z][0-9]")) {
					JOptionPane.showMessageDialog(null, "Le code postal:\""+codePostal+"\"est valide");
				}
				else {
					JOptionPane.showMessageDialog(null, "Le code postal:\""+codePostal.toUpperCase()+"\"est invalide");
				}
			}
		}while(!codePostal.equals("0"));
		


	}

}
