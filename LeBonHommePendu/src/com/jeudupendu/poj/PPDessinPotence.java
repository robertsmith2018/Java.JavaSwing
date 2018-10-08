package com.jeudupendu.poj;

//PPDessinPotence.java
//Programme Principal de Dessin 
//des �tats de la Potence

import java.awt.*; // Frame

public class PPDessinPotence extends Frame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	PPDessinPotence	 () {
	// les caract�ristiques de la fen�tre principale
	    setTitle ("Les " + Potence.maxEtat + " �tats de la potence");
	    setBackground (Color.lightGray);  // d�faut : blanc
	    setBounds (10,10, 400, 550);      // d�faut : petite taille
	    
	    // mise en page par colonnes de 3; 10 pixels entre composants
	    setLayout (new GridLayout (0, 3, 10, 10));
	    // un tableau d�objets Potence
	    Potence[] dessin = 	new Potence	 [Potence.maxEtat];       // de 0 � 8
	    for (int i=0; i < dessin.length; i++) {
	        dessin[i] =  	new Potence ();
	            dessin[i].setBackground (Color.cyan);
	             dessin[i].setForeground (Color.red);
	        	   dessin[i].setEtat (i);
	        		      add (dessin[i]);
	     }
	            addWindowListener (new FermerFenetre());           // voir page 221
	        	setVisible (true);                            // d�faut : invisible
	 } // constructeur PPDessinPotence
	        		  
	public static void 	main (String[] arg) {
	         new PPDessinPotence();
	} // main
	    

}	 // class PPDessinPotence

