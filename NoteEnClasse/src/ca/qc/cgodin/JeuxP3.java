package ca.qc.cgodin;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class JeuxP3 {
	
  
	
   	public static void main(String[] args) {
		// TODO Auto-generated method stub
   		
		String[] nomsJoueurs = new String[2];
		String[] divulguer = new String[2]; 
		char[] reponsesJoueurs = new char[2];
	  
		      
		   
		Pendu pendu = new Pendu();
			
			
		Joueur Joueur1 = new Joueur(1);
	    Joueur Joueur2 = new Joueur(2);
		    
		
	    nomsJoueurs[0] = Joueur1.getNomJoueur();
	    nomsJoueurs[1] = Joueur2.getNomJoueur();
		pendu.setNomsJoueurs(nomsJoueurs);
		pendu.jouerReponseMot();
			
			
		
		
		
		
			
			

   	}

}
