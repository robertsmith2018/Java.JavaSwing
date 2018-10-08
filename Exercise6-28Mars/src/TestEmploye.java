import javax.swing.JOptionPane;

public class TestEmploye {

	public static void main(String[] args) {

		Employe emp1 = new Employe("Emp-0001", "Pierre", "Andre", 35000);
		Employe emp2 = new Employe("Emp-0002", "Pierre", "Andre", 35000);
		Employe emp3 = new Employe("Emp-0001", "Pierre", "Andre", 35000);
		JOptionPane.showMessageDialog(null, "Employe 1 : " + emp1 + "\nEmploye 2 : " + emp2 + "\nEmploye 3 : " + emp3);
		if (emp1.equals(emp2)) {
			JOptionPane.showMessageDialog(null, "L'employe " + emp1 + " est le meme que l'employe " + emp2);
		} else {
			JOptionPane.showMessageDialog(null, "L'employe " + emp1 + " est different de l'employe " + emp2);
		}
		if (emp1.equals(emp3)) {
			JOptionPane.showMessageDialog(null, "L'employe " + emp1 + " est le meme que l'employe " + emp3);
		} else {
		
		JOptionPane.showMessageDialog(null, "L'employe " + emp1 + " est different de l'employe " + emp3);
		}
	}
}