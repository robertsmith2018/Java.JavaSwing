import javax.swing.JOptionPane;

public class fortesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rayon = 5.0;
		
		double aire = calculerAire(rayon);
		String message ="Aire du cercle est:" + aire;
		
		fortesting.afficher(message);
		System.exit(0);

	}
	
	public static double calculerAire(double rayon){
		double resultat = Math.PI*rayon*rayon;
		return resultat;
	}
	
	public static void afficher(String message){
		JOptionPane.showMessageDialog(null, message);
	}

}
