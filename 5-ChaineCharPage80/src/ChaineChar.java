import javax.swing.JOptionPane;

public class ChaineChar {

	public static void main(String[] args) {
		String texte, resultat = "\n"; char carac;
		// lecture du texte 
		texte = JOptionPane.showInputDialog("Entrez votre texte");
		// parcours du texte pour extraire seulement les lettres 
		for (int i = 0; i < texte.length(); i++) { 
			carac = texte.charAt(i); 
			if (Character.isLetter(carac)) 
				resultat += carac+"\n"; }
		// affichage des résultats 
		JOptionPane.showMessageDialog(null, "La chaîne obtenue est " + resultat + "\nqui contient " + resultat.length() + " caractères"); 
		System.exit(0);

	}

}
