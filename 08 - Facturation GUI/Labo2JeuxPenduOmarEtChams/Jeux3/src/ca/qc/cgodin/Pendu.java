package ca.qc.cgodin;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Pendu {
    private  int[]  joueursResultats = new int[2];
	
	//private static int i = 0;
	
	private  String[] choixJoueurs = new String[2];
	private  String divulguer1;
	private  String divulguer2;
	private  String carractersChoisisJoueur1;
	private  String carractersChoisisJoueur2;
	private  String[] carractersChoisisJoueurs = new String[2];
	private String[] nomsJoueurs = new String[2];
	private  String[] reponsesJoueurs = new String[2] ;
	private String[] divulguer = new String[2];
	//private  char reponseJoueur2 ;
	
	private  char[][] divulguerJoueurs = new char[2][16];
	private char[] reponse = new char[2];
	
	
	
	public Pendu() {
		super();
		// TODO Auto-generated constructor stub
		this.joueursResultats[0]= 6;
		this.joueursResultats[1]= 6;
		/*this.choixJoueurs[0] = "";
		this.choixJoueurs[1] = "";*/
		this.divulguer[0] = "";
		this.divulguer[1] = "";
		this.carractersChoisisJoueurs[0] = "";
		this.carractersChoisisJoueurs[1] = "";
	}
	
	public void initialiserPendu() {
		
		// TODO Auto-generated constructor stub
		this.joueursResultats[0]= 6;
		this.joueursResultats[1]= 6;
		/*this.choixJoueurs[0] = "";
		this.choixJoueurs[1] = "";*/
		this.divulguer[0] = "";
		this.divulguer[1] = "";
		this.carractersChoisisJoueurs[0] = "";
		this.carractersChoisisJoueurs[1] = "";
	}
	


	

	public int[] getJoueursResultats() {
		return joueursResultats ;
	}


	public void setJoueursResultats(int[] joueursResultats) {
		this.joueursResultats[0] = joueursResultats[0];
		this.joueursResultats[1] = joueursResultats[1];
	}

	
	
	
	public String[] getChoixJoueurs() {
		return choixJoueurs;
	}


	public void setChoixJoueurs(String[] choixJoueurs) {
		this.choixJoueurs[0] = choixJoueurs[0];
		this.choixJoueurs[1] = choixJoueurs[1];
	}


	public String[] getDivulguer() {
		return divulguer;
	}


	public void setDivulguer(String[] divulguer) {
		this.divulguer[0] = divulguer[0];
		this.divulguer[1] = divulguer[1];
	}

	
	////
	
	public String[] getCarractersChoisisJoueurs() {
		return carractersChoisisJoueurs;
	}

	public void setCarractersChoisisJoueurs(String[] carractersChoisisJoueurs) {
		this.carractersChoisisJoueurs[0] = carractersChoisisJoueurs[0];
		this.carractersChoisisJoueurs[1] = carractersChoisisJoueurs[1];
	}

	
	///
	


	
	
	public  char[][] getDivulguerJoueurs() {
		return divulguerJoueurs;
	}


	public  void setDivulguerJoueurs(char[][] divulguerJoueurs) {
		this.divulguerJoueurs[0] = divulguerJoueurs[0];
		this.divulguerJoueurs[1] = divulguerJoueurs[1];
	}


	public String[] getReponsesJoueurs(String[] reponsesJoueurs) {
		return reponsesJoueurs;
	}


	public void setReponsesJoueurs(String[] reponsesJoueurs) {
		this.reponsesJoueurs = reponsesJoueurs;
	}
	
	
	public String[] getNomJoueur(String []  nomsJoeurs) {
		return nomsJoeurs;
	}
	
	public void setNomsJoueurs(String[] nomsJoueurs) {
		this.nomsJoueurs[0] = nomsJoueurs[0];
		this.nomsJoueurs[1] = nomsJoueurs[1];
	}
	
	public char[] getReponse(char []  reponse) {
		return reponse;
	}
	
	public void setReponse(char[] reponse) {
		this.reponse[0] = reponse[0];
		this.reponse[1] = reponse[1];
	}


	
	
   public void jouerChoisirMot(int numJoueur)
   {
	  int i =0;
	 
		  do
		  {
		   this.choixJoueurs[numJoueur -1] = JOptionPane.showInputDialog(null,"Quelle est votre mot",this.nomsJoueurs[numJoueur -1],JOptionPane.QUESTION_MESSAGE);   
		   
		  }  while((this.choixJoueurs[numJoueur -1].length() > 11) || (this.choixJoueurs[numJoueur -1].length() < 5));
		  
		 
		   for(i =0; i < this.choixJoueurs[numJoueur -1].length(); i++)
			{
				this.divulguerJoueurs[numJoueur -1][i] = '-';
			}
		  
	
   }
   
   
   public void jouerReponseLettre(int numJoueur)
   {
	   this.reponsesJoueurs[numJoueur - 1]  = JOptionPane.showInputDialog(null,"Quelle est votre réponse",this.nomsJoueurs[numJoueur - 1],JOptionPane.QUESTION_MESSAGE);
	   this.reponse[numJoueur - 1] = Character.toLowerCase(this.reponsesJoueurs[numJoueur - 1].charAt(0));
	   
	// traitement si le joueur 1 a deja choisi le carractere 
	   while (this.carractersChoisisJoueurs[numJoueur -1].indexOf(this.reponse[numJoueur - 1]) != -1)
	   {
		     JOptionPane.showMessageDialog(null, "Le carracters est deja choisi ou divulgué");
		     this.reponsesJoueurs[numJoueur -1] = JOptionPane.showInputDialog(null,"Quelle est votre réponse",this.nomsJoueurs[numJoueur - 1],JOptionPane.QUESTION_MESSAGE);
			 this.reponse[numJoueur - 1] = Character.toLowerCase(reponsesJoueurs[numJoueur - 1].charAt(0));
		   
	   }
	  this.carractersChoisisJoueurs[numJoueur -1] +=  this.reponse[numJoueur - 1];
	  
	     int i = 0;
	     int position;
		// traitement si reponse joueur  juste    
			for (i = 0;i < this.choixJoueurs[Math.abs(numJoueur - 2)].length();i++)
			{
			    position = -1;
				position = this.choixJoueurs[Math.abs(numJoueur - 2)].indexOf(this.reponse[numJoueur -1]);
			  if (position != -1) 
			  {
				  this.divulguerJoueurs[Math.abs(numJoueur - 2)][position] = this.reponse[numJoueur -1];
				 
			  }
			}
			i=0;
			// traitement si réponse joueur numJoueur fausse
			 if (this.choixJoueurs[Math.abs(numJoueur - 2)].indexOf(this.reponse[numJoueur -1]) == -1)
			 {
			   //Phase pour divulguer les carracteres de mot de joueur1 si le mot de joueur1 contient le carractere
				 this.joueursResultats[numJoueur -1] -= 1;
			 }	
			 
			 for (i =0;i < this.choixJoueurs[numJoueur -1].length();i++)
				{
				    position = -1;
					position = this.choixJoueurs[numJoueur -1].indexOf(this.reponse[numJoueur -1]);
				  if (position != -1) 
				  {
					  this.divulguerJoueurs[numJoueur -1][position] = this.reponse[numJoueur -1];
					 					  
				  }
				}
			 if (this.choixJoueurs[numJoueur -1].indexOf(this.reponse[numJoueur -1]) != -1)
			 {
				 this.carractersChoisisJoueurs[Math.abs(numJoueur - 2)] += this.reponse[numJoueur -1];
			 }
			 
			 this.divulguer[numJoueur -1] = Arrays.toString(this.divulguerJoueurs[numJoueur -1]);
			 this.divulguer[Math.abs(numJoueur - 2)] = Arrays.toString(this.divulguerJoueurs[Math.abs(numJoueur - 2)]);
			 this.divulguer[numJoueur -1] =  this.divulguer[numJoueur -1].replace(",", "");
			 this.divulguer[numJoueur -1]=  this.divulguer[numJoueur -1].replace("[", "");
			 this.divulguer[numJoueur -1] =  this.divulguer[numJoueur -1].replace("]", "");
			 this.divulguer[numJoueur -1] =  this.divulguer[numJoueur -1].replace(" ", "");
			 divulguer[Math.abs(numJoueur - 2)] = divulguer[Math.abs(numJoueur - 2)].replace(",", "");
			 divulguer[Math.abs(numJoueur - 2)] = divulguer[Math.abs(numJoueur - 2)].replace("[", "");
			 divulguer[Math.abs(numJoueur - 2)] = divulguer[Math.abs(numJoueur - 2)].replace("]", "");
			 divulguer[Math.abs(numJoueur - 2)] = divulguer[Math.abs(numJoueur - 2)].replace(" ", "");
			 JOptionPane.showMessageDialog(null, this.nomsJoueurs[numJoueur - 1] + " : " +  this.divulguer[numJoueur -1] + "\n" +
					                             this.nomsJoueurs[Math.abs(numJoueur - 2)] + " : " + divulguer[Math.abs(numJoueur - 2)] + "\n" +
					                             "Déja testé:  " + this.carractersChoisisJoueurs[numJoueur - 1] + "\n" +
	                                             "Score:" + this.joueursResultats[numJoueur -1]);
			
   }
   
   
 
   public void jouerReponseMot()
   {
	   int premierJoueur;
	   int[] numJoueurGagne =  {-1,-1};
	   premierJoueur = (int)(Math.random() * 2) + 1; 
     do
     { 
    	 JOptionPane.showMessageDialog(null, "Démarrer une  partie");
         this.initialiserPendu();         
         this.jouerChoisirMot(premierJoueur);
         this.jouerChoisirMot(Math.abs(premierJoueur -3));
        
	   do
       {
		  this.jouerReponseLettre(premierJoueur); 
		  this.jouerReponseLettre(Math.abs(premierJoueur - 3));
    	   
    	   
       }while((this.divulguer[premierJoueur - 1].indexOf("-") != -1) &&  (this.divulguer[Math.abs(premierJoueur - 2)].indexOf("-") != -1)
    		   && (this.joueursResultats[premierJoueur -1] != 0) && (this.joueursResultats[Math.abs(premierJoueur - 2)] !=0));	
	   
	   if(this.getDivulguer()[premierJoueur - 1].indexOf("-") == -1)
	   {
		   
	   }
	   
	   
     }while((this.getDivulguer()[premierJoueur - 1].indexOf("-") == -1) &&  (this.divulguer[Math.abs(premierJoueur - 2)].indexOf("-") == -1)
  		   && (this.joueursResultats[premierJoueur -1] == 0) && (this.joueursResultats[Math.abs(premierJoueur - 2)] ==0));
     
      
       if(this.getDivulguer()[premierJoueur - 1].indexOf("-") == -1)
       {
    	   numJoueurGagne[premierJoueur - 1] = premierJoueur -1;
       }
       
       if(this.getDivulguer()[Math.abs(premierJoueur - 2)].indexOf("-") == -1)
       {
    	   numJoueurGagne[Math.abs(premierJoueur - 2)] =Math.abs(premierJoueur - 2);
       }
       
       int i = 0;
       int nombreJoueursGagn = 0;
       
       for(i=0;i<2;i++)
       {
    	   if (numJoueurGagne[i] != -1)
    	   {
    		   JOptionPane.showMessageDialog(null, "Bravo " + this.nomsJoueurs[i] + "\n" + 
    	                                           "Le mot était: \n" +
    	                                           this.nomsJoueurs[i] + " " + this.choixJoueurs[i] + " \n" +
    	                                           this.nomsJoueurs[Math.abs(i -1)] + ":  "  + 
    	                                           this.choixJoueurs[Math.abs(i - 1)] );
    		   nombreJoueursGagn += 1;
    	   }
    	   
       }
       if(nombreJoueursGagn ==2)
       {
    	   this.jouerReponseMot();
       }
     }
    
     
	

}

