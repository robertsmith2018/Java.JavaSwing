import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Exercise5a {

	public static void main(String[] args) {

			String chaine = "La première chaïne a découper en jettons.";
			String token;
			String resultat = "";
			StringTokenizer chaineDecomposer = new StringTokenizer(chaine," ");
			int compteur=chaineDecomposer.countTokens();
			String[] ChaineDecomposee = new String[compteur];
			for(int i = 0; i < compteur ; i++ ){
			token = chaineDecomposer.nextToken();
			ChaineDecomposee[i]= token;
			}
			for(int i = 0; i < compteur ; i++){
			resultat+=(i+1)+". "+ ChaineDecomposee[i]+"\n";
			}
			JOptionPane.showMessageDialog(null,"La chaine : \""+chaine+"\"\n\n Le nombre d'éléments = "
			+compteur+"\n\n La liste des jetons :\n"+resultat,"Utilisation de la classe StringTokenizer",
			JOptionPane.PLAIN_MESSAGE);


	}
	
	/*






	 */

}
