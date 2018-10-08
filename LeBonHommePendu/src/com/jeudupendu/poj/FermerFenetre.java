package com.jeudupendu.poj;

import java.awt.*;
import java.awt.event.*;

public class FermerFenetre  extends WindowAdapter {
	  public void   windowClosing   (WindowEvent evt) {
	      //System.out.println (evt.getWindow().getName());
	      if (evt.getWindow().getName().equals("frame0")) {
	          System.exit(0);                         // fermer l’application
	      } else {
	        evt.getWindow().dispose();                   // fermer la fenêtre
	      }
	   }
}
