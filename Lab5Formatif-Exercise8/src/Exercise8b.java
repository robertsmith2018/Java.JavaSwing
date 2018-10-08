import javax.swing.JOptionPane;
public class Exercise8b {

    public static void main(String[] args) {

	String telephone; // (514-909-4834)
	
	do{
        	telephone=JOptionPane.showInputDialog("Entrer le numéro de telephone a verifier ou 0 (zero) pour quitter");
        	if(!telephone.equals("0")){
                	if(telephone.matches("[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]")) {
                	JOptionPane.showMessageDialog(null,"Le numéro de telephone : \""+telephone+"\" est valide");
                	}
                	else{
                	JOptionPane.showMessageDialog(null,"Le numéro de telephone : \""+telephone+"\" est invalide");
                	}
        	}
        }while(!telephone.equals("0"));

    
    }
}
