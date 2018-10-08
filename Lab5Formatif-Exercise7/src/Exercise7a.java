import javax.swing.JOptionPane;
public class Exercise7a {

	public static void main(String[] args) {
		String codePostal;
		do {
			codePostal=JOptionPane.showInputDialog("Entrer le code postal a verifier ou 0 pour quitter");
			if(!codePostal.equals("0")) {
				if(codePostal.length()==7 && Character.isLetter(codePostal.charAt(0)) && 
				   Character.isDigit(codePostal.charAt(1)) && Character.isLetter(codePostal.charAt(2))&&
				   Character.isWhitespace(codePostal.charAt(3))&& Character.isDigit(codePostal.charAt(4))&&
				   Character.isLetter(codePostal.charAt(5)) && Character.isDigit(codePostal.charAt(6))){
					JOptionPane.showMessageDialog(null, "Le code postal:\""+codePostal+"\"est valide");
				}
				else {
					JOptionPane.showMessageDialog(null, "Le code postal:\""+codePostal.toUpperCase()+"\"est invalide");
				}
			}
		}while(!codePostal.equals("0"));
		




	}

}
