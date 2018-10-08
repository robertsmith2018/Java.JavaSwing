
/**
 * @author Portable
 *
 */
public class Rationnel {
	private int numerateur;
	private int denominateur;
	
/*	public Rationnel(int numerateur, int denominateur) {
		super();
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	
	}*/
	

	public String toString() {
	return getNumerateur()+"/"+getDenominateur();
	}


	public int getNumerateur() {
		return numerateur;
	}


	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}


	public int getDenominateur() {
		return denominateur;
	}


	public void setDenominateur(int denominateur) {
		if ( denominateur == 0) {
			System.out.println("attention! Le Denominateur ne doit pas etre zero !");
			System.exit(0);;
		}else {
			this.denominateur = denominateur;
		}
	}
	
	

}
