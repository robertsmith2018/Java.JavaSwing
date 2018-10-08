package ca.games.rassaker;

public class GoPendu {

	public static void main(String[] args) {

		String[] indvNames = new String[2];

		Pendu pendu = new Pendu();

		Joueur Joueur1 = new Joueur(1);
		Joueur Joueur2 = new Joueur(2);

		indvNames[0] = Joueur1.getplayerName();
		indvNames[1] = Joueur2.getplayerName();
		pendu.setplayersNames(indvNames);
		pendu.guessWord();

	}

}
