package ca.qc.rasssaker.modele;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Client {
	private String code;
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	private String courriel;
	
	public Client(String nom, String prenom, String adresse, String telephone, String courriel)throws SQLException {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.courriel = courriel;
		genererCode();
	}
	
	public Client (String code , String nom , String prenom, String adresse ,String telephone , String courriel) {
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.courriel = courriel;
	}
	
	public Client (String code) throws SQLException, ClientException{
		String requete = "select * from client where code='"+ code +"'";
		ResultSet res = DBManager.executeQuery(requete);
		boolean trouve = false ;
		while (res.next()) {
				this.code = res.getString("code");
				nom = res.getString("nom") ;
				prenom = res.getString("prenom") ;
				adresse = res.getString("adresse") ;
				telephone = res.getString("telephone");
				courriel = res.getString("courriel");
				trouve = true ;
		}
		if (!trouve) {
			throw new ClientException("Ce client n'existe pas" );
		}
	}
	
	private void genererCode()throws SQLException {
		String requete = "select * from nombreclient";
		ResultSet res = DBManager.executeQuery(requete);
		int nombre = 0;
		while(res.next()){
			nombre = res.getInt("nombre");
		}
		nombre++;
		requete = "update nombreclient set nombre =" + nombre;
		DBManager.executeUpdate(requete);
		if (nombre < 10)
			code = "CL-00" + nombre;
		else if (nombre < 100)
			code = "CL-0" + nombre;
		else
			code = "CL-" + nombre;
		
	}
	
	public void enregistrer() throws SQLException{
	String requete = "insert into client values ('" + code + "', '" + nom + "', '" + prenom + "', '" + telephone + "', '" + adresse + "', '"+ courriel + "')";
	DBManager.executeUpdate(requete);
	}
	
	public void modifier() throws SQLException {
		String requete =  "update client set nom ='" + nom  +  "', prenom='"
				+ prenom + "', telephone:='" + telephone + "', adresse='" + adresse
				+ "', courriel='" + courriel + "' where code='" + code + "'" ;
		DBManager.executeUpdate(requete);
	}
	
	public void supprimer() throws SQLException {
		String requete = "delete from client where code='" + code + "'";
		DBManager.executeUpdate(requete);
	}
	
	public static ArrayList<Client> recupererListeClient() throws SQLException{
		ArrayList<Client> liste = new ArrayList<Client>();
		String requete = "select * from client";
		ResultSet res = DBManager.executeQuery (requete);
		while (res.next()) {
		
			String code = res.getString("code");
			String nom = res.getString("nom");
			String prenom = res.getString("prenom");
			String adresse = res.getString("adresse");
			String telephone = res.getString("telephone");
			String courriel = res.getString("adresse");
			Client cl = new Client(code, nom, prenom, adresse, telephone, courriel);
			liste.add(cl);
			
		}
		return liste ;
	}
	
	public static ArrayList<Client> recupererListeClient(HashMap<String, String> criteres) throws SQLException{
			boolean deuxiemeCritere = false ;
			ArrayList<Client> liste = new ArrayList<Client>();
			String requete = "select * from client" ;
			if (! criteres.isEmpty()) {
					requete += " where " ;
					String nom = criteres.get("nom");
					String prenom = criteres.get("prenom");
					String telephone = criteres.get("telephone");
					String courriel = criteres.get("courriel");
					String code = criteres.get("code");
					if (nom != null){
						requete += " nom='" + nom + "'";
						deuxiemeCritere = true ;
					}
					if (prenom != null) {
						if (deuxiemeCritere)
							requete += " and " ;
						requete += " prenom='" + prenom + "'";
						deuxiemeCritere = true ;
					}
					if (telephone != null) {
						if (deuxiemeCritere)
							requete += " and " ;
							requete += " telephone='" + telephone + "'";
							deuxiemeCritere = true ;
					}
					if (courriel != null) {
						if (deuxiemeCritere)
							requete += " and " ;
						requete += " courriel='" + courriel +"'";
						deuxiemeCritere = true ;
					}
					if (code != null) {
						if (deuxiemeCritere)
							requete += " and " ;
						requete += " code='" + code + "'";
						deuxiemeCritere = true ;
					}
			}
			
			ResultSet res = DBManager.executeQuery(requete);
			while (res.next()) {
					String code = res.getString("code");
					String nom = res.getString("nom");
					String prenom = res.getString("prenom");
					String adresse = res.getString("adresse");
					String telephone = res.getString("telephone");
					String courriel = res.getString("adresse");
					Client cl = new Client( code, nom, prenom, adresse, telephone, courriel );
					liste.add(cl);
			}
			return liste;
	}
	
	@Override
	public String toString() {
		return code + " " + nom + " " + prenom + " " + adresse + " " +telephone+ " " + courriel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
    
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public String getCode() {
		return code;
	}
		
	
}//curseur de la classe
