import javax.swing.JOptionPane;

public class Exercise5b {

	public static void main(String[] args) {
	
		String chaine = "La premiere chaine a découper en jetons. ";
		String[] chaineDecomposee = chaine.split("\\s");
		String resultat = "";
		int compteur=chaineDecomposee.length;
		for(int i = 0; i < compteur ; i++){
		resultat+=(i+1)+". "+ chaineDecomposee[i]+"\n";
		}
		JOptionPane.showMessageDialog(null,"La chaine : \""
		+chaine+"\"\n\nLe nombre d'éléments = "+compteur
		+"\n\n La Lists des jetons :\n"+resultat,
		"Utilisation de La classe String",JOptionPane.PLAIN_MESSAGE);

	}
	


}
