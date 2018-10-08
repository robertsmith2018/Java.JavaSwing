package ca.qc.ca;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileSystemView;

public class FenetrePrincipale extends JFrame implements ActionListener, DocumentListener {
	private Contact[] listeContacts = new Contact[100];
	private int nbreContacts = 0;
	private static int position = -1;
	private double[] notes = new double[100];
	//private JFileChooser fc = new JFileChooser();
	
	// Déclarer une copie de tableau notes pour avoir indexMedian. 
	// parceque le tableau notes sera toujours triée dans la fonction getIndexMediane (résultat interne )
	private double[] notes2 = new double[100];
	private double meilleur = 0;
	private double pire = 0;
	private int counter = 0;
	private Container contentPane;
	// private JDesktopPane desktop;
	JPanel panelCentre;
	JButton btnSuivant;
	JButton btnPrecedent;
	JButton btnMiseAJour;
	JButton btnLire;
	JButton btnEcrire;
	JButton btnNouveau;
	JButton btnDernier;
	JButton btnPremier;
	JButton btnMeilleur;
	JButton btnPire;
	JButton btnMoyenne;
	JButton btnMedianne;
	
	
	JTextField txtNom;
    JTextField txtPrenom;
    JTextField txtAge;
    JTextField txtTelephone;
    JTextField txtAdresse;
    JTextField txtCodePostal;
    JTextField txtVille; 
    JTextField txtPays;
    JTextField txtNote;
	
	public FenetrePrincipale(){
		 super("Gestion des comptes");
		 setBounds(150, 100,500, 550);
		 construireContenu();
		// desktop = new JDesktopPane();
		 // add (desktop);
		 setVisible(true);
	}
	
	 private void construireContenu(){
		 contentPane = getContentPane();
		 contentPane.setLayout(new BorderLayout());
		 JButton btnNordSuperContacts = new JButton("Super Contacts Ahunstic");
		// JButton btnSud = new JButton("Sud");
		 btnSuivant = new JButton(">>(7)");
		 btnSuivant.addActionListener(this);
		 btnPrecedent = new JButton("<<(5)");
		 btnPrecedent.addActionListener(this);
		 //JButton btnCentre = new JButton("Centre");
		 
		 btnPremier = new JButton("<<<(1)");
		 btnPremier.addActionListener(this);
		 btnMiseAJour = new JButton("Mise à...");
		 btnMiseAJour.addActionListener(this);
		 btnLire = new JButton("Lire");
		 btnLire.addActionListener(this);
		 btnEcrire = new JButton("Ecrire");
		 btnEcrire.addActionListener(this);
		 btnDernier = new JButton(">>>(14)");
		 btnDernier.addActionListener(this);
		 btnNouveau = new JButton("Nouveau");
		 btnNouveau.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		initialiser();
		 	}
		 });
		// btnNouveau.addActionListener(this);
		 btnMeilleur = new JButton("Meilleur");
		 btnMeilleur.addActionListener(this);
		 btnPire = new JButton("Pire");
		 btnPire.addActionListener(this);
		 
		 btnMoyenne = new JButton("Moyen...");
		 btnMoyenne.addActionListener(this);
		 btnMedianne = new JButton("Médiane");
		 btnMedianne.addActionListener(this);
		 
		 txtNom = new JTextField("Nom",15);
		 txtNom.getDocument().addDocumentListener(this);
		 txtPrenom = new JTextField("Prénom",15);
		 txtPrenom.getDocument().addDocumentListener(this);
		 txtAge = new JTextField("Age",8);
		 txtAge.getDocument().addDocumentListener(this);
		 txtTelephone = new JTextField("Téléphone",15);
		 txtTelephone.getDocument().addDocumentListener(this);
		 txtAdresse = new JTextField("Adresse",30);
		 txtAdresse.getDocument().addDocumentListener(this);
		 txtCodePostal = new JTextField("Code Postal",10);
		 txtVille = new JTextField("Ville",20);
		 txtVille.getDocument().addDocumentListener(this);
		 txtPays = new JTextField("Pays",15);
		 txtPays.getDocument().addDocumentListener(this);
		 txtNote = new JTextField("Note",8);
		 txtNote.getDocument().addDocumentListener(this);
		 
		 
		 panelCentre = new JPanel();
		 
    	 Color c = new Color(0, 102, 34);
    		
		 panelCentre.setBackground(c);
		 panelCentre.setBackground(Color.gray);
		 
		 panelCentre.setLayout(new FlowLayout());
		 panelCentre.add(txtNom);
		 panelCentre.add(txtPrenom);
		 panelCentre.add(txtAge);
		 panelCentre.add(txtTelephone);
		 panelCentre.add(txtAdresse);
		 panelCentre.add(txtCodePostal);
		 panelCentre.add(txtVille);
		 panelCentre.add(txtPays);
		 panelCentre.add(txtNote);
		
		 
		 
		 JPanel panelSud = new JPanel();
		 panelSud.setLayout(new GridLayout(2, 5));
		 panelSud.add(btnPremier);
		 panelSud.add(btnMiseAJour);
		 panelSud.add(btnLire);
		 panelSud.add(btnEcrire);
		 panelSud.add(btnDernier);
		 panelSud.add(btnNouveau);
		 panelSud.add(btnMeilleur);
		 panelSud.add(btnPire);
		 panelSud.add(btnMoyenne);
		 panelSud.add(btnMedianne);
			
			
		 contentPane.add(btnNordSuperContacts, BorderLayout.NORTH);
	     contentPane.add(panelSud, BorderLayout.SOUTH);
		 contentPane.add(btnSuivant, BorderLayout.EAST);
		 contentPane.add(btnPrecedent, BorderLayout.WEST);
		 contentPane.add(panelCentre, BorderLayout.CENTER);
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnLire)
		{
			lireFichier();
		} else if(e.getSource() == btnSuivant)
		{
			
			
			if((nbreContacts > 0) && (position < nbreContacts - 1))
			{
				position++;
				afficherContact(position);
				
			}
			
			
		} else if(e.getSource() == btnPrecedent)
		{
			if((nbreContacts > 0) && (position ) > 0)
			{
				position--;
				afficherContact(position);
			}
		} else if(e.getSource() == btnPremier)
		{
			if(nbreContacts > 0)
			{
				afficherContact(0);
				position = 0;
			}
		} else if(e.getSource() == btnDernier)
		 {
			if(nbreContacts > 0)
			{
				afficherContact(nbreContacts - 1);
				position = nbreContacts - 1;
			}
		 }  
		else if(e.getSource() == btnMeilleur){
			if(nbreContacts > 0)
			{
				  int indexMax =  getIndexMax(notes);				 
				  position = indexMax;								 
				  afficherContact(indexMax);
				  
			}
		 } 
		
		 else if(e.getSource() == btnPire) {
			if(nbreContacts > 0)
			{
				  int indexMin =  getIndexMin(notes);				 
				  position = indexMin;	
				  afficherContact(indexMin);
				  
			}
		 } 
		 
		 else if(e.getSource() == btnMoyenne)
		 {
			if(nbreContacts > 0)
			{
				  double moyenne = getMoyenne(notes);
				  JOptionPane.showMessageDialog(null, "La moyenne est: " + String.format("%.2f", moyenne));
				  
			}
		 }  
		 
		 else if(e.getSource() == btnMedianne)
		 {
			if(nbreContacts > 0)
			{
				  int indexMediane = getIndexMediane(notes,nbreContacts);
				  position = indexMediane;
				  afficherContact(indexMediane);
				  
				  
			}
		 } 
		 
		 else if(e.getSource() == btnMiseAJour)
		 {
			if(nbreContacts > 0)
			{
				 sauvegardeTab(position);
				 ecrireFichier("resources\\contacts.csv");
				 
				  
			}
		 } /*else if(e.getSource() == btnNouveau)
		 {
			position = nbreContacts;
			nbreContacts++;
			initialiser();
			panelCentre.setBackground(Color.gray);
			
		 } */else if(e.getSource() == btnEcrire)
		 {
			ecrireDansFichier();
			
		 }
			
		
	}
	
	public void initialiser(){
		txtNom.setText("");
		txtPrenom.setText("");
		txtAge.setText("");
		txtTelephone.setText("");
		txtAdresse.setText("");
		txtCodePostal.setText("");
		txtVille.setText("");
		txtPays.setText("");
		txtNote.setText("");
	
	}
	
	public void lireFichier(){
		try{
			//int f = JOptionPane.getInitialSelectionValue();
			String nomFichier ="resources\\contacts.csv";
			FileReader fr = new FileReader(nomFichier);
			BufferedReader entree = new BufferedReader(fr);
			String ligneLue;
			
			do{
				ligneLue = entree.readLine();
				if(ligneLue != null){
					Contact c = new Contact(ligneLue);
					listeContacts[nbreContacts] = c;
					nbreContacts++;
				}
			}while(ligneLue != null);
			
			int i =0;
			if(nbreContacts > 0)
			{
				while (i < nbreContacts)
				{
					notes[i] = listeContacts[i].getNote();
					notes2[i] = listeContacts[i].getNote();
					i++;
				}
			}
			entree.close();
			
			
			JOptionPane.showMessageDialog(this, "Lecture terminée");
		}
		catch(FileNotFoundException ex){
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
		catch(IOException ex){
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}	
	
	
	public void ecrireDansFichier()
	{
		 // https://www.mkyong.com/swing/java-swing-jfilechooser-example/
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
		  String path = selectedFile.getAbsolutePath();
		  
		  ecrireFichier(path);
		  
		}
	}
	
	public void afficherContact(int position)
	{
		
		txtNom.setText(listeContacts[position].getNom());
		txtPrenom.setText(listeContacts[position].getPrenom());
		txtAge.setText("" + listeContacts[position].getAge());
		txtTelephone.setText(listeContacts[position].getTelephone());
		txtAdresse.setText(listeContacts[position].getAdresse());
		txtCodePostal.setText(listeContacts[position].getCodePostal());
		txtVille.setText(listeContacts[position].getVille());
		txtPays.setText(listeContacts[position].getPays());
		txtNote.setText("" + listeContacts[position].getNote());
		
	}
	
	 public  int getIndexMax(double[] inputArray){ 
		    double maxValue = inputArray[0]; 
		    int j =0;
		     for(int i=1;i<nbreContacts;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		         j = i;
		      } 
		    }
		    
		    return j; 
	}
	 
	 public  int getIndexMin(double[] inputArray){ 
		    double minValue = inputArray[0]; 
		    int j = 0;
		    for(int i=1;i<nbreContacts;i++){ 
		      if((inputArray[i] < minValue)){ 
		        minValue = inputArray[i]; 
		        j = i;
		      } 
		    } 
		    return j; 
		  } 
	 public double getMoyenne(double[] inputArray)
	 {
		 double somme = 0;
		 for(int i=0;i < nbreContacts; i++){
			 somme += inputArray[i];
		 }
		 double moyenne = somme / nbreContacts;
		 return moyenne;
	 }
	 
	 
   //
	 private void ecrireFichier(String nomFichier){
			try{
				//String nomFichier ="resources\\contacts.csv";
				FileWriter fw = new FileWriter(nomFichier);
				PrintWriter sortie = new PrintWriter(fw);
				for(int i = 0; i < nbreContacts; i++){
					if(i < (nbreContacts - 1)){
						sortie.println(listeContacts[i].toCSV());
					}
					else{
						sortie.print(listeContacts[i].toCSV());
					}
				}
				sortie.close();
				JOptionPane.showMessageDialog(this, "contacts sauvegardés");
			}
			catch(IOException ex){
				JOptionPane.showMessageDialog(this, ex.getMessage());
			}
		}
	 
	 private void sauvegardeTab(int position)
	 {
		 
		   String nom = txtNom.getText();
		   String prenom =	txtPrenom.getText();
		   int age = Integer.parseInt(txtAge.getText());
		   String telephone = txtTelephone.getText();
		   String adresse = txtAdresse.getText();
		   String codePostal =	txtCodePostal.getText();
		   String ville =	txtVille.getText();
		   String pays = txtPays.getText();
		   double note = Double.parseDouble(txtNote.getText());
		   Contact c = new Contact(nom,prenom,age,telephone,adresse,codePostal,ville,pays,note);
		   listeContacts[position] = c;
		 		   
	 }
	 

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
		panelCentre.setBackground(Color.yellow);
		
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		panelCentre.setBackground(Color.green);
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		panelCentre.setBackground(Color.red);
	}
	
	public double[] trierTab(double[] inputArray,int taille)
	{
		double[] tabtrie = new double[taille];
		//tabtrie[0] = inputArray[0];
		int i = 0, j = 1;
		//int indexMediane, centre = taille / 2 -1;
		double  temp;
		String afficheTrie = "";
		for(i=0;i<taille -1;i++)
		{
			for(j=i+1; j<taille;j++)
			{
				if(inputArray[j] < inputArray[i])
				{
					temp = inputArray[j];
					inputArray[j] = inputArray[i];
					inputArray[i] = temp;
				}
				
			}
			
			
		}
		
		 return inputArray;
		
	}
	
	public int getIndexMediane(double[] inputArray, int taille)
	{
		double[] tabTrie = trierTab(inputArray, taille);
		int centre = taille /2,indexMediane = 0;
		int i = 0;
		
		for(i=0; i <taille; i++)
		{
		  if(notes2[i] == tabTrie[centre])
			  {
			     indexMediane = i;
			     break;
	          }
		}
		
		return indexMediane;
	}

		 
}

	
/*  JOptionPane.showMessageDialog(null, "index max " + indexMax + "\n" +
"position" + position + "\n" +
 "Le max: " + notes[indexMax]);
 */

/*
JOptionPane.showMessageDialog(null, "position dans boutton suivant " + position + "\n" +
        "nombre contacts " + nbreContacts);
        */

/*
JOptionPane.showMessageDialog(null, "position " + position + "\n" +
                                    "nombre contacts " + nbreContacts);
                                    */


/*
String trier = "";
for (i = 0; i<nbreContacts; i++)
{
  trier = trier + "  " + notes[i] + " ";
}

JOptionPane.showMessageDialog(null, "Tableau notes trie notes 2 est  " + trier);

*/

/*
afficheTrie += " " + inputArray[taille-1];
JOptionPane.showMessageDialog(null, "Tableau notes trie est  " + afficheTrie);

*/