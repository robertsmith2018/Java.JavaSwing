package ca.rassaker.qc;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ecriture {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("deuxiemeFichier.txt");
			PrintWriter sortie = new PrintWriter(fw);
			for(int i = 1; i<=5; i++) {
					for(int j=1; j<=5; j++) {
						sortie.print((i*j)+"");
					}
					sortie.println();
			}
			sortie.close();
			System.out.println("Ecriture du fichier termine - Fin du programme");
		} catch (IOException ex) {
			
			System.out.println(ex.getMessage());
		}
		

	}

}
