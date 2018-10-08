package ca.rassaker.qc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class lectureToken {

	public static void main(String[] args) {
		try {
			String nomFichier = "deuxiemeFichier.txt";
			FileReader fr = new FileReader(nomFichier);
			BufferedReader in = new BufferedReader(fr);
			String ligneLue;
			do {
				ligneLue = in.readLine();
				if(ligneLue != null) {
					System.out.print(ligneLue);
					StringTokenizer tokens = new StringTokenizer(ligneLue,"");
					int nombreElement = tokens.countTokens();
					int somme = 0 ;
					for(int i=0; i < nombreElement; i++) {
						String token = tokens.nextToken();
						int element = Integer.parseInt(token);
						somme += element;	
					}
					System.out.println("-La somme des elements de la ligne est :" + somme);
					
				}
			}while(ligneLue != null);
			in.close();
			
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		

	}

}
