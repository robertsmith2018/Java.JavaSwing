package ca.qc.cgodin;

import javax.swing.JOptionPane;

public class Joueur {
	private String nomJoueur;
	private int numJoueur;

	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Joueur(int numJoueur) {
		super();
		this.numJoueur = numJoueur;
		this.nomJoueur = JOptionPane.showInputDialog(null,"Quelle est votre nom","Joueur#"+ numJoueur,JOptionPane.QUESTION_MESSAGE);
	}
	
	

	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public int getNumJoueur() {
		return numJoueur;
	}

	public void setNumJoueur(int numJoueur) {
		this.numJoueur = numJoueur;
	}
	
	
	public void initialiserJoueur(int numJoueur) {
		
		this.numJoueur = numJoueur;
		this.nomJoueur = JOptionPane.showInputDialog(null,"Quelle est votre nom","Joueur#"+ numJoueur,JOptionPane.QUESTION_MESSAGE);
	}
	


	
	
	
	
	

}
