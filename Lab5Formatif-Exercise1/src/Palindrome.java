import javax.swing.JOptionPane;

public class Palindrome {

	public static void main(String[] args) {
		String saisie;
		do{
			saisie = JOptionPane.showInputDialog("Entrer une chaine de caracteres");
			String caption = saisie.toUpperCase();
			if(!saisie.equals("")){
				if(estPalindrome(caption)){
					JOptionPane.showMessageDialog(null, "La chaine " + saisie + " est un palindrome");
					}else{
					JOptionPane.showMessageDialog(null, "La chaine " + saisie + " n'est pas un palindrome");
					}
			}	
		} while (!saisie.equals(""));

	}
		
	public static boolean estPalindrome(String chaine){
		boolean testPalindrome = true;
		for(int i = 0, j = chaine.length() - 1; (i < j) && (testPalindrome == true); i++, j--){
				if(chaine.charAt(i) != chaine.charAt(j)){
					testPalindrome = false;
				}

		}

		return testPalindrome;

	}
		
}