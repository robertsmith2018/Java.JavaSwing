import javax.swing.JOptionPane;

public class Exercise8a {

    public static void main(String[] args) {
	String telephone;
	do {
	    telephone = JOptionPane.showInputDialog("Entrer le numero de telephone a verifier ou (zero) pour quitter");
	    if (!telephone.equals("0")) {
		boolean valide = true;
		if (telephone.length() != 12) {
		    valide = false;
		}
		for (int i = 0; i < 12 && valide; i++) {
		    switch (i) {
		    case 0:
		    case 1:
		    case 2:
		    case 4:
		    case 5:
		    case 6:
		    case 8:
		    case 9:
		    case 10:
		    case 11:
			if (!Character.isDigit(telephone.charAt(i)))
			    valide = false;
			break;
		    case 3:
		    case 7:
			if (telephone.charAt(i) != '-')
			    valide = false;
			break;

		    }
		}
		if (valide) {
		    JOptionPane.showMessageDialog(null,
			    "Le numero de telephone : \"" + telephone + "\" " + "est valide");

		} else {
		    JOptionPane.showMessageDialog(null,
			    "Le numerc de telephone : \"" + telephone + "\" " + "est invalide");
		}

	    }
	} while (!telephone.equals("D"));

    }

}
