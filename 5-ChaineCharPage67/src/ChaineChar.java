import javax.swing.JOptionPane;

public class ChaineChar {

	public static void main(String[] args) {
		
		double notes, sommeNotes=0, maxNote=0;
		final int NB_NOTES =4;
		int nb = 0, echec=0;
		
		for (nb = 0; nb < NB_NOTES; nb++) {
		String text = JOptionPane.showInputDialog("Entrez votre Note");
		notes = Double.parseDouble(text);
		sommeNotes+=notes;
			if(maxNote<notes) {
				double temp = maxNote;
				maxNote = notes;
				notes = temp;
				
			}
			if(notes < 60) {
				
				 echec++;
			}
		
			
		}
		JOptionPane.showMessageDialog(null, "La note maximale est :" + maxNote+"\n"+"La moyenne des notes est : " + sommeNotes/4+
				"\n"+echec+" éleves ont echoués"); 
		
			


	}

}
