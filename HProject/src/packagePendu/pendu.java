package packagePendu;

public class pendu {
	
	private String lettreTester;
	private String result;
	private int point; 
	private String[] tab= new String[11];
	
	public pendu(){	
		
		this.point=6;
		this.lettreTester="";
		this.result = "";
		
		for(int i=0; i < 11; i++){
			this.tab[i]="_";
		}
	}
	
	public void testPendu(String mot, String lettre){
		
		result="";
		char charMot,charLettre; //Declaration 2 variable char;
		
		charLettre =lettre.charAt(0); // Instruction prendre premier caracteure c'est comme convertir une lettre de type string to char
		
		for(int i=0; i< mot.length(); i++){
			
			charMot = mot.charAt(i); // Rcuperer les caracteres du mot un par un avec la boucl
			
			if(charMot == charLettre){ // Test si le carctere selectionne = a la lettre entrer.
				
				tab[i]=charLettre + ""; //Mettre le caracteur trouver dans le tableau dans le bon index du mot.
				lettreTester = charLettre + ""; //stocker le caracteur trouver.
				
			}
				result +=tab[i]; // cree le mot a afficher.	
		}
			
	}
	
	public String getResult(){		
		return result;
	}
	
	public String getLettreTester(){
		return lettreTester;
	}
	
	public int getPoint(){
		return point;
	}
	
	public void setPoint(){
		point--;
	}
	
	public String toString(){
		return result;
	}
	
	public void newGame(){
		for(int i=0; i < 11; i++){
			tab[i]="_";
		}
		point =6;
	}

}
