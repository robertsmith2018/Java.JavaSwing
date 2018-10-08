import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ExPage83 {
	public static void main(String[] args) {
		final String CONSONNES = "BCDFGHKJLMNPQRSTVWXZ";
		String chaine, soulignement = "";
		char carac;
		JTextArea sortie = new JTextArea();
		sortie.setFont(new Font("Courier", Font.BOLD, 15));
		chaine = JOptionPane.showInputDialog("Entrez votrechaine :", "Anticonstitutionnellement");
		for (int i = 0; i < chaine.length(); i++) {
			String myChar = chaine.charAt(i) + "";
			myChar = myChar.toUpperCase();
			if (CONSONNES.indexOf(myChar) == -1) {
				carac = ' ';
			} else {
				carac = '=';
			}
			soulignement += carac;
		}
		sortie.setText(chaine + "\n" + soulignement);
		JOptionPane.showMessageDialog(null, sortie, "SOULIGNEMENT DES CONSONNES", JOptionPane.PLAIN_MESSAGE);
	}
}