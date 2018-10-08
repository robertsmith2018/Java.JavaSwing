package ca.games.rassaker;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Pendu {
	private char[][] disclosedPlayers = new char[2][16];
	private int[] playersScores = new int[2];
	private String[] uncoveredCharacters = new String[2];
	private String[] playersNames = new String[2];
	private String[] playersLetters = new String[2];
	private String[] playersChoice = new String[2];
	private String[] disclosed = new String[2];

	private char[] reponse = new char[2];
	public Pendu() {
		super();
		this.playersScores[0] = 6;
		this.playersScores[1] = 6;
		this.disclosed[0] = "";
		this.disclosed[1] = "";
		this.uncoveredCharacters[0] = "";
		this.uncoveredCharacters[1] = "";
	}

	public void initialize() {

		this.playersScores[0] = 6;
		this.playersScores[1] = 6;
		this.disclosed[0] = "";
		this.disclosed[1] = "";
		this.uncoveredCharacters[0] = "";
		this.uncoveredCharacters[1] = "";
	}

	public int[] getplayersScores() {
		return playersScores;
	}

	public void setplayersScores(int[] playersScores) {
		this.playersScores[0] = playersScores[0];
		this.playersScores[1] = playersScores[1];
	}

	public String[] getplayersChoice() {
		return playersChoice;
	}

	public void setplayersChoice(String[] playersChoice) {
		this.playersChoice[0] = playersChoice[0];
		this.playersChoice[1] = playersChoice[1];
	}

	public String[] getdisclosed() {
		return disclosed;
	}

	public void setdisclosed(String[] disclosed) {
		this.disclosed[0] = disclosed[0];
		this.disclosed[1] = disclosed[1];
	}

	public String[] getuncoveredCharacters() {
		return uncoveredCharacters;
	}

	public void setuncoveredCharacters(String[] uncoveredCharacters) {
		this.uncoveredCharacters[0] = uncoveredCharacters[0];
		this.uncoveredCharacters[1] = uncoveredCharacters[1];
	}

	public char[][] getdisclosedPlayers() {
		return disclosedPlayers;
	}

	public void setdisclosedPlayers(char[][] disclosedPlayers) {
		this.disclosedPlayers[0] = disclosedPlayers[0];
		this.disclosedPlayers[1] = disclosedPlayers[1];
	}

	public String[] getplayersLetters(String[] playersLetters) {
		return playersLetters;
	}

	public void setplayersLetters(String[] playersLetters) {
		this.playersLetters = playersLetters;
	}

	public String[] getplayerName(String[] nomsJoeurs) {
		return playersNames;
	}

	public void setplayersNames(String[] playersNames) {
		this.playersNames[0] = playersNames[0];
		this.playersNames[1] = playersNames[1];
	}

	public char[] getReponse(char[] reponse) {
		return reponse;
	}

	public void setReponse(char[] reponse) {
		this.reponse[0] = reponse[0];
		this.reponse[1] = reponse[1];
	}

	public void playGuessWord(int numJoueur) {
		int i = 0;

		do {
			this.playersChoice[numJoueur - 1] = JOptionPane.showInputDialog(null, "Choisir un mot !",
					this.playersNames[numJoueur - 1], JOptionPane.QUESTION_MESSAGE);

		} while ((this.playersChoice[numJoueur - 1].length() > 11) || (this.playersChoice[numJoueur - 1].length() < 5));

		for (i = 0; i < this.playersChoice[numJoueur - 1].length(); i++) {
			this.disclosedPlayers[numJoueur - 1][i] = '-';
		}

	}

	public void playGuessLetter(int numJoueur) {
		this.playersLetters[numJoueur - 1] = JOptionPane.showInputDialog(null, "Deviné Une Des Lettres Cachées !",
				this.playersNames[numJoueur - 1], JOptionPane.QUESTION_MESSAGE);
		this.reponse[numJoueur - 1] = Character.toLowerCase(this.playersLetters[numJoueur - 1].charAt(0));

		while (this.uncoveredCharacters[numJoueur - 1].indexOf(this.reponse[numJoueur - 1]) != -1) {
			JOptionPane.showMessageDialog(null, "Le caractère est déjà choisi !");
			this.playersLetters[numJoueur - 1] = JOptionPane.showInputDialog(null, "Deviné Une Des Lettres Cachées !",
					this.playersNames[numJoueur - 1], JOptionPane.QUESTION_MESSAGE);
			this.reponse[numJoueur - 1] = Character.toLowerCase(playersLetters[numJoueur - 1].charAt(0));
		
		}
		this.uncoveredCharacters[numJoueur - 1] += this.reponse[numJoueur - 1];

		int i = 0;
		int position;

		for (i = 0; i < this.playersChoice[Math.abs(numJoueur - 2)].length(); i++) {
			position = -1;
			position = this.playersChoice[Math.abs(numJoueur - 2)].indexOf(this.reponse[numJoueur - 1]);
			if (position != -1) {
				this.disclosedPlayers[Math.abs(numJoueur - 2)][position] = this.reponse[numJoueur - 1];

			}
		}
		i = 0;

		if (this.playersChoice[Math.abs(numJoueur - 2)].indexOf(this.reponse[numJoueur - 1]) == -1) {

			this.playersScores[numJoueur - 1] -= 1;
		}

		for (i = 0; i < this.playersChoice[numJoueur - 1].length(); i++) {
			position = -1;
			position = this.playersChoice[numJoueur - 1].indexOf(this.reponse[numJoueur - 1]);
			if (position != -1) {
				this.disclosedPlayers[numJoueur - 1][position] = this.reponse[numJoueur - 1];

			}
		}
		if (this.playersChoice[numJoueur - 1].indexOf(this.reponse[numJoueur - 1]) != -1) {
			this.uncoveredCharacters[Math.abs(numJoueur - 2)] += this.reponse[numJoueur - 1];
		}

		this.disclosed[numJoueur - 1] = Arrays.toString(this.disclosedPlayers[numJoueur - 1]);
		this.disclosed[Math.abs(numJoueur - 2)] = Arrays.toString(this.disclosedPlayers[Math.abs(numJoueur - 2)]);
		this.disclosed[numJoueur - 1] = this.disclosed[numJoueur - 1].replace(",", "");
		this.disclosed[numJoueur - 1] = this.disclosed[numJoueur - 1].replace("[", "");
		this.disclosed[numJoueur - 1] = this.disclosed[numJoueur - 1].replace("]", "");
		this.disclosed[numJoueur - 1] = this.disclosed[numJoueur - 1].replace(" ", "");
		disclosed[Math.abs(numJoueur - 2)] = disclosed[Math.abs(numJoueur - 2)].replace(",", "");
		disclosed[Math.abs(numJoueur - 2)] = disclosed[Math.abs(numJoueur - 2)].replace("[", "");
		disclosed[Math.abs(numJoueur - 2)] = disclosed[Math.abs(numJoueur - 2)].replace("]", "");
		disclosed[Math.abs(numJoueur - 2)] = disclosed[Math.abs(numJoueur - 2)].replace(" ", "");
		JOptionPane.showMessageDialog(null,
				this.playersNames[numJoueur - 1] + " : " + this.disclosed[numJoueur - 1] + "\n"
						+ this.playersNames[Math.abs(numJoueur - 2)] + " : " + disclosed[Math.abs(numJoueur-2)] + "\n"
						+ "Déja testé:  " + this.uncoveredCharacters[numJoueur - 1],"État de mots à trouver",JOptionPane.INFORMATION_MESSAGE
						/*+ "Score: " + this.playersScores[numJoueur - 1]+ "\n"*/
				
				);

		}
	
	public void guessWord() {

		int firstPlayer;
		int[] winnerNumber = { -1, -1 };
		firstPlayer = (int) (Math.random() * 2) + 1;
		do {

			this.initialize();
			this.playGuessWord(firstPlayer);
			this.playGuessWord(Math.abs(firstPlayer - 3));

			do {
				this.playGuessLetter(firstPlayer);
				this.playGuessLetter(Math.abs(firstPlayer - 3));

			} while ((this.disclosed[firstPlayer - 1].indexOf("-") != -1)
					&& (this.disclosed[Math.abs(firstPlayer - 2)].indexOf("-") != -1)
					&& (this.playersScores[firstPlayer - 1] != 0)
					&& (this.playersScores[Math.abs(firstPlayer - 2)] != 0));

			if (this.getdisclosed()[firstPlayer - 1].indexOf("-") == -1) {

			}

		} while ((this.getdisclosed()[firstPlayer - 1].indexOf("-") == -1)
				&& (this.disclosed[Math.abs(firstPlayer - 2)].indexOf("-") == -1)
				&& (this.playersScores[firstPlayer - 1] == 0) && (this.playersScores[Math.abs(firstPlayer - 2)] == 0));

		if (this.getdisclosed()[firstPlayer - 1].indexOf("-") == -1) {
			winnerNumber[firstPlayer - 1] = firstPlayer - 1;
		}

		if (this.getdisclosed()[Math.abs(firstPlayer - 2)].indexOf("-") == -1) {
			winnerNumber[Math.abs(firstPlayer - 2)] = Math.abs(firstPlayer - 2);
		}

		int i = 0;
		int winnersNumber = 0;

		for (i = 0; i < 2; i++) {
			if (winnerNumber[i] != -1) {
				int c =	JOptionPane.showConfirmDialog(null,
					"Bravo ! " + this.playersNames[i] + "\n" + "Les mots cachés étaient: \n" + this.playersNames[i]
					 + ": " + this.playersChoice[i] + " \n" + this.playersNames[Math.abs(i - 1)] + ":  "
					 + this.playersChoice[Math.abs(i - 1)], "Voulez Vous Voir Le Score ?",JOptionPane.OK_OPTION);	
					winnersNumber += 1;		
					if ( c== JOptionPane.OK_OPTION) {					
						JOptionPane.showMessageDialog(null, "Pointage Final:\n\n"+ this.playersNames[Math.abs(i - 1)] + " ### Score: "+ 
						this.playersScores[Math.abs(firstPlayer - 1)] + "\n"
						+ this.playersNames[Math.abs(i - 2)]+ " ### Score: "+ this.playersScores[Math.abs(firstPlayer - 2)], "La Gloire...",JOptionPane.CLOSED_OPTION);
					}
					
					
			}
			
		if (winnersNumber == 2) {			
			this.guessWord();
		}
			
		}
		

	}
	

	

	

}
