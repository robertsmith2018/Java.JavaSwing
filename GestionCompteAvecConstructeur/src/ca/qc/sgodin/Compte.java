package ca.qc.sgodin;

public class Compte {
	
	private String numero; 
	private String type;
	private double solde;
	private String devise;
	
	public Compte(String numero, String type, double solde, String devise) {
		super();
		this.numero = numero;
		this.type = type;
		this.solde = solde;
		this.devise = devise;
	}
	
/*	public String toString(){
		return "Numero Compte"+ numero +" "+type+" "+solde+" "+devise;
	}*/
	
/*	public String toString() {
		return "Compte [numero=" + numero + ", type=" + type + ", solde=" + solde + ", devise=" + devise
				+ "]";
	}*/
 
	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", type=" + type + ", solde=" + solde + ", devise=" + devise
				+ ", toString()=" + super.toString() + "]";
	}
	
	/* private String app;
	 * private String numero;
	 * private String nomRue;
	 * private String ville;
	 * private String province;
	 * private String codePostal;
	 * private String pays;
	 * String adresse= " ";
	 * if(!app.equals("")}{
	 * adresse+=app+"-";
	 * adresse+=numero+""+nomRue+","+ville+","+province+","+codePostal+","+pays;
	 * return adresse;
	 */
	/*
	 * public Adresse(String app, String numero, double nomRue, String ville, String province,
	 * String codePostal, String pays) {
		super();
		this.numero = numero;
		this.type = type;
		this.solde = solde;
		this.devise = devise;
	}
	
	* public Adresse(String numero, double nomRue, String ville, String province,
	 * String codePostal, String pays) {
	   this("",numero,nomRue,ville,province,codePostal,pays);

	 */
	/*	public void creer(String pNumero, String pType,double pSolde, String pDevise){
		numero = pNumero;
		type = pType;
		solde = pSolde;
		devise = pDevise;
	}*/
	
	public void afficher(){
		System.out.println(numero +" "+ type + " " + solde + " " + devise );
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public String getDevise() {
		return devise;
	}
	public void setDevise(String devise) {
		this.devise = devise;
	}

	
}

