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
		// affichage des r�sultats 
		JOptionPane.showMessageDialog(null, "La cha�ne obtenue est " + resultat + "\nqui contient " + resultat.length() + " caract�res"); 
		System.exit(0);

	}

}
