package ca.games.rassaker;

import javax.swing.JOptionPane;

public class Joueur {
	
	private String playerName;
	private int playerNumber;

	public Joueur() {
		super();
	}

	public Joueur(int playerNumber) {
		super();
		this.playerNumber = playerNumber;
		this.playerName = JOptionPane.showInputDialog(null,"Entrer votre nom SVP ?","Individu#"+ playerNumber,JOptionPane.QUESTION_MESSAGE);
	}
	
	public String getplayerName() {
		return playerName;
	}

	public void setplayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getplayerNumber() {
		return playerNumber;
	}

	public void setplayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	
	public void initialiserJoueur(int playerNumber) {
		
		this.playerNumber = playerNumber;
		this.playerName = JOptionPane.showInputDialog(null,"Entrer votre nom SVP ?","Individu#"+ playerNumber,JOptionPane.QUESTION_MESSAGE);
	}
	


	
	
	
	
	

}
