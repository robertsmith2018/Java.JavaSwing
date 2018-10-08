import javax.swing.JOptionPane;

public class TestRationnel {

	private static int numerateur;
	private static int denominateur;

	public static void main(String[] args) {
		
		String saisie = JOptionPane.showInputDialog(null, "Entrer le Numerateur");
		int numerateur = Integer.parseInt(saisie);
		String saisieDeno = JOptionPane.showInputDialog(null, "Entrer le Denominateur");
		int denominateur = Integer.parseInt(saisieDeno);
	/*	if (denominateur==0) {
			System.out.println("attention Le Denominateur ne dois pas etre Zero !");
			return;
		}*/
			
		Rationnel r1 = new Rationnel();
		r1.setDenominateur(denominateur);
		r1.setNumerateur(numerateur);
		
		
	/*	System.out.println(r1.getNumerateur()+"/"+r1.getDenominateur());*/
		System.out.println(r1);

	}

}
