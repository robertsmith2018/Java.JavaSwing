package ca.rassaker.qc;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fichiers {

	public static void main(String[] args) {
		try {
			String nomFichier = "premierFichier.txt";
			FileWriter fw = new FileWriter(nomFichier);
			PrintWriter sortie = new PrintWriter(fw);
			for( int i=1; i<=5; i++) {
				sortie.println( i +"- Le carre de"+i+"est:"+(i*1));
	
			}
			sortie.close();
			System.out.println("Ecriture des informations dans le fichier terminé - Fin du programme");
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
