import javax.swing.JOptionPane;
public class UpperCaseAndDollarSign {

	public static void main(String[] args) {
		
		String saisie = JOptionPane.showInputDialog("Entrer une phrase");
		if(saisie.indexOf(' ') == -1){
		saisie = saisie.toUpperCase();
		}
		else{
		saisie = saisie.replace(' ', '$');
		}
		JOptionPane.showMessageDialog(null, saisie);


	}
	


}
