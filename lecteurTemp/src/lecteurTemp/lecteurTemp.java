package lecteurTemp;

import javax.swing.JOptionPane;

public class lecteurTemp {

	public static void main(String[] args) {
		
		int temperature;
		String saisie;
		saisie = JOptionPane.showInputDialog("Entrez la température:");
		temperature = Integer.parseInt(saisie);
		
		if(temperature>=20){
			JOptionPane.showMessageDialog(null, "Il fait Chaud");

		}else if ( temperature >=0 && temperature <20){
			JOptionPane.showMessageDialog(null, "Il ne fait ni chaud ni froid");
		}else if (temperature < 0){
			JOptionPane.showMessageDialog(null, "Il fait froid");
		}
		
	}
}
