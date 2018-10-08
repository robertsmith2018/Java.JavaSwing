package com.jeudupendu.poj;

import java.awt.*;           // Frame

class PPendu extends Frame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PPendu () {
	    setTitle     ("Jeu du pendu");
	    setBounds    (10, 10, 340, 450);
	    // setResizable (false);
	    addWindowListener (new FermerFenetre());           // voir page 221
	    add (new Pendu(), "Center");
	    setVisible (true);
	}
  
	public static void main (String[] args) {
		new PPendu();
	}
}  // PPendu