import javax.swing.JOptionPane;

public class TestEmploye {

	public static void main(String[] args) {
		Employe emp = new Employe("Emp-0001", "Pierre", "Andre", 35000);
		JOptionPane.showMessageDialog(null, emp);
		
		changerSalaire(emp, 25000);
		
		JOptionPane.showMessageDialog(null, emp);

	}
	
	private static void changerSalaire(Employe a, double salaire) {
		a.setSalaire(salaire);
	}
}
