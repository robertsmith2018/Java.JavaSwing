import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Triage {
	
	public static void main(String[] args ) {
		
		final int NB_NOTES = 4;
		int i,nbMoins = 0;
		double totalNotes = 0;
			
		DecimalFormat uneDecimale = new DecimalFormat("0.0");
		double tabNotes[] = new double[NB_NOTES];
		
		for ( i = 0; i < tabNotes.length; i++) {
		tabNotes[i] = Double.parseDouble(JOptionPane.showInputDialog( "Entrez La Note : " + (i + 1)));
		/*System.out.println(i);*/
				totalNotes += tabNotes[i];
				if (tabNotes[i] < 60)
						nbMoins = nbMoins+1;
		}
		
		for(int i1 = 0; i1 < tabNotes.length - 1; i1++){
			for(int j1 = i1 + 1; j1 < tabNotes.length; j1++){
				if(tabNotes[j1] < (tabNotes[i1])){
				double	temp = tabNotes[i1];
					tabNotes[i1] = tabNotes[j1];
					tabNotes[j1] = temp;
				}
			}		
		}	
		/*System.out.println(temp);*/
		/*System.out.println(nbMoins);*/
		System.out.println("La note la plus elevé est :" + uneDecimale.format(tabNotes[3]));
		System.out.println("La Moyenne de la classe est de:" + (totalNotes/NB_NOTES) );
		System.out.println("Nombres d'élèves qui ont eu une note < 60 est: " +nbMoins );
		
		}

	}
	

