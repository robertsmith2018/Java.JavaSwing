import javax.swing.JOptionPane;

public class TestEmploye2 {

	public static void main(String[] args) {
		Employe emp1 = new Employe("Emp-0001","Pierre","Andre",35000);
		Employe emp2 = emp1;
		JOptionPane.showMessageDialog(null, "Employe 1: "+emp1 +"\nEmploye2: "+emp2);
		emp1.setSalaire(50000);
		JOptionPane.showMessageDialog(null, "Employe 1: "+emp1 +"\nEmploye2: "+emp2);

	}

}
