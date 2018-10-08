import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Exercise6b {

	public static void main(String[] args) {
		
		String equation;
		double resultat=0;
		do{
				equation = JOptionPane.showInputDialog("Enter l'équation a évaluer ou 0 pour quitter");
				try{
						if(!equation.equals("0") ){
								String[] txtDividende = equation.split("\\+");
								resultat=0;
								for(int i=0; i<txtDividende.length ; i++){
								double dividende = Double.parseDouble(txtDividende[i]);
								resultat += dividende;
								}
								JOptionPane.showMessageDialog(null, "Le résultat de l'équation :\n"
								+equation+" = "+resultat+"\n\n",
								"Evaluation de l'équation:",JOptionPane.PLAIN_MESSAGE);
						}
				}
				catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null, "Erreur\nL'équation: \""+equation
				+"\" est invalide, vérifier votre équation");
				}
		} while(!equation.equals("O"));
		System.exit(0);
		
		





	}

}
