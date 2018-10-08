
public class Carte {

	private int valeur;
	public int Force;
	public String couleur;
	public String Face;
	public int value;
	
	
	public Carte(){
		int valeur= (int) (Math.random()*52+1);
		setValeur(valeur);	
	}
	


	@Override
	public String toString() {
		return ""+ valeur ;
	}

	public String getFace() {
		return Face;
	}

	public int getValeur() {
		return valeur;
	}
	

	private void setValeur(int value) {
		
		if(value < 1 || value >52 ) {
			 value = 2;
			 // ajouter la fonction getCouleur
		}else {
			this.valeur = value;
		}
	}
	
	public int getForce() {
		return Force;
	}

	public String getCouleur() {
		return couleur;
	}

	
}
