
package ca.qc.rasssaker.modele;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;
import java.sql.Connection;

public class TestClient {
	
	private static HashMap<String, String> criteres;
	private static ArrayList<Client> liste;
	
	public static void main(String[] args) throws ClientException {
  		/*
  		 * test de l'ajout ou de modification d'un record 
  		 * test du constructeur avec 5 parametres
  		 * test de modification de valeurs
  		 */
/*	try {
			DBManager.createConnection("localhost", "gestionclient", "root", "password2017", 3306);

			Client cl1 = new Client ("Bamboo", "Nicolette", "185 Boul Gouin", "514-000-0008", "lavitrine@hotmail.com");
			System.out.println(cl1.getCode());
			cl1.enregistrer();
			//To modify previous adresse :		
			cl1.setAdresse("532 Boul Maisoneneuve");
			cl1.setTelephone("514-245-0001");
			cl1.modifier();
		}
		catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	
	}*/
	
		// Tester le Constructeur avec un seul parametre :
/*	try {
		DBManager.createConnection("localhost", "gestionclient", "root", "password2017", 3306);
		Client cl2 = new Client("CL-008");
		System.out.println(cl2);

		}
		catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}*/
			
		/*
		 * Récuperer toute la liste des recordes dans la base de donnée
		 */
/*	try {
		DBManager.createConnection("localhost", "gestionclient", "root", "password2017", 3306);
		ArrayList<Client> liste = Client.recupererListeClient();
		System. out.println( "Affichage de la liste des clients" );
				for (Client cl : liste) {
						System. out.println(cl);
				}
		}
		catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}*/
		
		/*
		 * Rechercher dans la base de donnée tous les clients de nom Bamboo
		 */
/*	try {
		DBManager.createConnection("localhost", "gestionclient", "root", "password2017", 3306);
			HashMap<String, String> criteres = new HashMap<String, String>();
			criteres .put( "nom" , "Bamboo" );
			ArrayList<Client> liste = Client.recupererListeClient (criteres);
			System. out.println( "Affichage des clients nommes Bamboo" );
			for (Client cl : liste) {
				System. out.println(cl);
			}
		}
		catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}*/
		
		/*
		 * Rechercher dans la base de donnée tous les clients de nom Bamboo et prenom Nicolette
		 */
	/*try {
			DBManager.createConnection("localhost", "gestionclient", "root", "password2017", 3306);
			
			HashMap<String, String> criteres = new HashMap<String, String>();
			HashMap<String, String> second = new HashMap<String, String>();
			criteres .put( "prenom" , "Nicolette" );
			second .put( "nom" , "Bamboo" );
			ArrayList<Client> liste = Client.recupererListeClient(criteres);
			ArrayList<Client> secondListe = Client.recupererListeClient(second);
			
			System. out.println( "Affichage des clients nommes Labranche" );
			for (Client cl : liste) {
				System. out.println(cl);
			}
			
			System. out.println( "Affichage des clients nommes Nicolette Bamboo" );
			for (Client cl2 : secondListe) {
				
				System. out.println(cl2);
			}	
	
		}
		catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}*/
	
	/*
	 * Supprimer Un Client
	 */
	/*try {
		DBManager.createConnection("localhost", "gestionclient", "root", "password2017", 3306);
		Client cl2 = new Client("CL-008");
		System.out.println(cl2);
		cl2.supprimer();
		}
		catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}*/

	
		
}

