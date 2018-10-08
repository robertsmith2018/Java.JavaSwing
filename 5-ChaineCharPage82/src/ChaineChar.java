import javax.swing.JOptionPane;

public class ChaineChar {



	public static void main(String[] args) {
		int i, start=0, end=0;
		
		String input =JOptionPane.showInputDialog(null, "Veuillez Entrez Votre Nom SVP:");
		
		   StringBuilder input1 = new StringBuilder();
		   
	        // append a string into StringBuilder input1
	        input1.append(input);
	 
	        // reverse StringBuilder input1
	        input1 = input1.reverse();
	 
	        // print reversed String
	        for ( i=0; i<input1.length(); i++) {
	        JOptionPane.showMessageDialog(null, "Le mot Inverser est: "+input1);
	        }
	        System.exit(0);

	}
	

	    

}
