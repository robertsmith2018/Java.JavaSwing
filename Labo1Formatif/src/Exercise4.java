import javax.swing.JOptionPane;

public class Exercise4 {

	public static void main(String[] args) {
		
		int extraHours;
		float bonus = 0;
		
		String tauxHr = JOptionPane.showInputDialog("Veuillez Entrer Le Taux Horaire Régulier SVP :");
		
		double tauxHoraire = Double.parseDouble(tauxHr);
		System.out.println(tauxHoraire);
		
		String nbreHr = JOptionPane.showInputDialog("Veuillez Entrer Le Nbre des Heures:");
		
		int nbreHours = Integer.parseInt(nbreHr);
		System.out.println(nbreHours);
		
		if(nbreHours > 35){
			extraHours = nbreHours - 35;
			bonus = (float) (extraHours * (2*tauxHoraire));
		}

		double total = bonus + nbreHours*tauxHoraire;
		
		JOptionPane.showMessageDialog(null, "Le salaire hebdomadaire est de: " +total);
		
		
			
		
	}

}
