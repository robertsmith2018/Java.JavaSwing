package ca.qc.cgodin;

public class Compte {
	
	private String numero; 
	private String type;
	private double solde;
	private String devise;
	
	
	public void creer(String pNumero, String pType,double pSolde, String pDevise){
		numero = pNumero;
		type = pType;
		solde = pSolde;
		devise = pDevise;
	}
	
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

