package ca.rassaker.qc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecture {

	public static void main(String[] args) {
		
		try {
			String nomFichier = "premierFichier.txt";
			FileReader fr = new FileReader(nomFichier);
			BufferedReader entree = new BufferedReader(fr);
			String ligneLue;
			do {
				ligneLue = entree.readLine();
				if(ligneLue != null) {
					System.out.println(ligneLue);
				}
				
			}while(ligneLue != null);
			entree.close();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			
		} catch (IOException ex) {
			
			System.out.println(ex.getMessage());
		}
		
	}

}
