import javax.swing.JOptionPane;

public class Exercise4a {

	public static void main(String[] args) {
		boolean ok;
		float Somme =0;
		double x=0.0;
		
		do // boucle de lecture d'une valeur jusqu'a correcte
		{
			ok = false;
			
			String rep = (String) JOptionPane.showInputDialog(null, "Veuillez Entrer la valeur ",
					"MOYENNES", JOptionPane.QUESTION_MESSAGE);
			if (rep == null)
				continue; 
			try {
				x = Double.parseDouble(rep);
				for(int i = 1;i <= x;i++){
					Somme = 1.0f / i;}
				ok = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "reponse incorrecte");
			}
		} while (!ok);
		JOptionPane.showMessageDialog(null, "La Somme des "+x+" premiers termes de la série harmonique : " + Somme);

	}

}
