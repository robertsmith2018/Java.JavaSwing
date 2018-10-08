
public class Compte {
	private String numero;
	private String type;
	private double solde;
	private String devise;
	
	public Compte(String numero, String type, double solde, String devise) throws CompteException{
		
		if( solde<100) {
			CompteException ex = new CompteException("Le solde d'ouverture doit >=100$");
			throw ex;
			
		}
		
		this.numero=numero;
		this.type=type;
		this.solde=solde;
		this.devise=devise;
		
	}
	public void debiter(double montant) throws CompteException {
		if((solde - montant) <100 ) {
			CompteException ex = new CompteException("Le retrait mettre le solde en dessous de 100$");
			throw ex;
		}
		solde = solde - montant;
	}

}
