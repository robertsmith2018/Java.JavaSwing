package ca.qc.rassaker;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;

public class FenetrePrincipale extends JFrame implements ActionListener {
	
	private Contact[] listStudents = new Contact[100];
	private int nombreEtudiant = 0;
	private int position = 0;

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtAge;
	private JTextField txtPhone;
	private JTextField txtAddress;
	private JTextField txtCodePostal;
	private JTextField txtVille;
	private JTextField txtPays;
	private JTextField txtNote;
	
	JButton btnNew;
	JButton btnNext;
	JButton btnUpdate;
	JButton btnPrevious;
	JButton btnPremier;
	JButton btnLire;
	JButton btnEcrire;
	JButton btnLast;
	JButton btnPire;
	JButton btnMoyenne;
	JButton btnMediane;
	JButton btnMeilleure;
	
	JPanel panelCentre;
	private JLabel lblNom;
	private JLabel lblPrenom;
	private JLabel lblAge;
	private JLabel lblPhone;
	private JLabel lblAddress;
	private JLabel lblPostalcode;
	private JLabel lblCity;
	private JLabel lblCountry;
	private JLabel lblNote;
	private double[] notes = new double[100];
	private double[] notes2 = new double[100];
	private JButton btnBest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale frame = new FenetrePrincipale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FenetrePrincipale() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 420);
		setSize(450, 300);
		setLocation(350,250);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSud = new JPanel();
		contentPane.add(panelSud, BorderLayout.SOUTH);
		panelSud.setLayout(new GridLayout(2,5));
		
	//	JButton btnPremier = new JButton("<<< (1)");
		btnPremier = new JButton("<<< ");
		btnPremier.setEnabled(false);
		btnPremier.addActionListener(this);
		panelSud.add(btnPremier);
		
	//	JButton btnUpdate = new JButton("Mise \u00E0 jour...");
		btnUpdate = new JButton("Mise \u00E0 jour...");
		btnUpdate.addActionListener(this);
		panelSud.add(btnUpdate);
		
	//	JButton btnLire = new JButton("Lire");
		btnLire = new JButton("Lire");
		btnLire.addActionListener(this);
	//	btnNew.setEnabled(true);
		panelSud.add(btnLire);
		
	//	JButton btnEcrire = new JButton("\u00C9crire");
		btnEcrire = new JButton("\u00C9crire");
		btnEcrire.addActionListener(this);
		panelSud.add(btnEcrire);
		
	//	JButton btnLast = new JButton(">>>(14)");
		btnLast = new JButton(">>>");
		btnLast.setEnabled(false);
		btnLast.addActionListener(this);
		panelSud.add(btnLast);
		
	//	JButton btnNew = new JButton("Nouveau");
		btnNew = new JButton("Nouveau");
		btnNew.setEnabled(false);
		btnNew.addActionListener(this);
		panelSud.add(btnNew);
		
	//	JButton btnPire = new JButton("Pire");
		btnPire = new JButton("Pire");
		btnPire.setEnabled(false);
		btnPire.addActionListener(this);
		panelSud.add(btnPire);
		
		btnBest = new JButton("Meilleure");
		btnBest.setEnabled(false);
		btnBest.addActionListener(this);
		panelSud.add(btnBest);
		
		
	//	JButton btnMoyenne = new JButton("Moyenne...");
		btnMoyenne = new JButton("Moyenne...");
		btnMoyenne.setEnabled(false);
		btnMoyenne.addActionListener(this);
		panelSud.add(btnMoyenne);
		
	//	JButton btnMediane = new JButton("M\u00E9diane");
		btnMediane = new JButton("M\u00E9diane");
		btnMediane.setEnabled(false);
		btnMediane.addActionListener(this);
		panelSud.add(btnMediane);
		
		JButton btnNord = new JButton("Super Contacts Rassaker");
		contentPane.add(btnNord, BorderLayout.NORTH);
		
	//	JButton btnPrevious = new JButton("<<(5)");
		btnPrevious = new JButton("<<");
		btnPrevious.addActionListener(this);
		contentPane.add(btnPrevious, BorderLayout.WEST);
		
	//	JButton btnNext = new JButton(">>(7)");
		btnNext = new JButton(">>");
		btnNext.addActionListener(this);
		contentPane.add(btnNext, BorderLayout.EAST);
		
		//JPanel panelCentre = new JPanel();
		panelCentre = new JPanel();
		
		contentPane.add(panelCentre, BorderLayout.CENTER);
		
		lblNom = new JLabel("Nom:");
		panelCentre.add(lblNom);
		
		txtNom = new JTextField();
		txtNom.setText("Nom");
		txtNom.addActionListener(this);
		panelCentre.add(txtNom);
		txtNom.setColumns(10);
		
		
		lblPrenom = new JLabel("Prenom:");
		panelCentre.add(lblPrenom);
		
		txtPrenom = new JTextField();
		txtPrenom.setText("Prenom");
		txtPrenom.addActionListener(this);
		panelCentre.add(txtPrenom);
		txtPrenom.setColumns(10);
		
		lblAge = new JLabel("Age:");
		panelCentre.add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setText("18");
		txtAge.addActionListener(this);
		panelCentre.add(txtAge);
		txtAge.setColumns(5);
		
		lblPhone = new JLabel("Phone:");
		panelCentre.add(lblPhone);
		
		txtPhone = new JTextField();
		txtPhone.setText("514-123-4567");
		txtPhone.addActionListener(this);
		panelCentre.add(txtPhone);
		txtPhone.setColumns(10);
		
		lblAddress = new JLabel("Address:");
		panelCentre.add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setText("Address");
		txtAddress.addActionListener(this);
		panelCentre.add(txtAddress);
		txtAddress.setColumns(10);
		
		lblPostalcode = new JLabel("PostalCode");
		panelCentre.add(lblPostalcode);
		
		txtCodePostal = new JTextField();
		txtCodePostal.setText("H1N 3C8");
		txtCodePostal.addActionListener(this);
		panelCentre.add(txtCodePostal);
		txtCodePostal.setColumns(10);
		
		lblCity = new JLabel("City:");
		panelCentre.add(lblCity);
		
		txtVille = new JTextField();
		txtVille.setText("Montreal");
		txtVille.addActionListener(this);
		panelCentre.add(txtVille);
		txtVille.setColumns(10);
		
		lblCountry = new JLabel("Country:");
		panelCentre.add(lblCountry);
		
		txtPays = new JTextField();
		txtPays.setText("Canada");
		txtPays.addActionListener(this);
		panelCentre.add(txtPays);
		txtPays.setColumns(10);
		
		lblNote = new JLabel("Note:");
		panelCentre.add(lblNote);
		
		txtNote = new JTextField();
		txtNote.setToolTipText("");
		txtNote.addActionListener(this);
		txtNote.setText("20.00");
		panelCentre.add(txtNote);
		txtNote.setColumns(10);
	}
		
	private void nettoyer(){
		txtNom.setText("");
		txtPrenom.setText("");
		txtPhone.setText("");
		txtAddress.setText("");
		txtCodePostal.setText("");
		txtVille.setText("");
		txtPays.setText("");
		txtNote.setText("");
		txtAge.setText("");		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == btnNew){			
			nettoyer();
			panelCentre.setBackground(Color.GREEN);
			
		}
		else if(e.getSource() == txtNom){			
			panelCentre.setBackground(Color.YELLOW);	
		}
		else if(e.getSource() == txtPrenom){			
			panelCentre.setBackground(Color.YELLOW);	
		}
		else if(e.getSource() == txtAge){			
			panelCentre.setBackground(Color.YELLOW);	
		}
		else if(e.getSource() == txtPhone){			
			panelCentre.setBackground(Color.YELLOW);	
		}
		else if(e.getSource() == txtAddress){			
			panelCentre.setBackground(Color.YELLOW);	
		}
		else if(e.getSource() == txtPays){			
			panelCentre.setBackground(Color.YELLOW);	
		}
		else if(e.getSource() == txtVille){			
			panelCentre.setBackground(Color.YELLOW);	
		}
		else if(e.getSource() == txtNote){			
			panelCentre.setBackground(Color.YELLOW);	
		}
		else if(e.getSource() == txtCodePostal){			
			panelCentre.setBackground(Color.YELLOW);	
		}
		else if(e.getSource() == btnUpdate) {
			panelCentre.setBackground(Color.GREEN);	
			String nom = txtNom.getText();
			String prenom = txtPrenom.getText();
			int age = Integer.parseInt(txtAge.getText());
			String phone = txtPhone.getText();
			String address = txtAddress.getText();
			String codePostal = txtCodePostal.getText();
			String ville = txtVille.getText();
			String pays = txtPays.getText();
			double note = Double.parseDouble(txtNote.getText());
			
			
			Contact s = new Contact(nom, prenom, age, phone, address, codePostal, ville, pays, note);
			
			listStudents[nombreEtudiant] = s;
			//ecrireFichier();
			nombreEtudiant++;
			JOptionPane.showMessageDialog(this, "Nouvel employe cree :" + "\n" + s);
			nettoyer();
			btnEcrire.setEnabled(true);
			
		}
		else if(e.getSource() == btnNext) {
			panelCentre.setBackground(null);

			if(position < (nombreEtudiant-1)){
				position++;
				if((position+1) == 100) {
					afficherEtudiant(position);
						btnPrevious.setText("<< "+(position-1));
						btnNext.setText(">> ");
				}
				else{		
					btnNext.setText(">> "+ (position+1));
					btnPrevious.setText("<< "+(position-1));
				}
			}

			afficherEtudiant(position);
		}
		else if(e.getSource() == btnPrevious) {
			if( position+1 == 0) {
				position=0;
				btnPrevious.setText("<< ");
				btnNext.setText(">> "+ (position+1));	
			}
			else if(position > 0 ) {
				position--;
				if((position-1) ==-1) {
				afficherEtudiant(position);
					btnPrevious.setText("<< ");
					btnNext.setText(">> "+ (position+1));
				}else {
					btnPrevious.setText("<< "+(position-1));
					btnNext.setText(">> "+ (position+1));
				}
			}	
			afficherEtudiant(position);
		}
		else if(e.getSource() == btnPremier) {
			
				position = 0;
				afficherEtudiant(position);	
				btnPrevious.setText("<< ");
				btnNext.setText(">> "+ (position+1));
			
			/*position = 0;
			afficherEtudiant(position);	*/
		}
		else if(e.getSource() == btnLire){  //
			lireFichier(); //appeler une méthode...
			btnBest.setEnabled(true);
			//btnMeilleure.setEnabled(true);
			btnPire.setEnabled(true);
			btnMoyenne.setEnabled(true);
			btnMediane.setEnabled(true);
			btnNew.setEnabled(true);
			btnUpdate.setEnabled(true);
			btnPremier.setEnabled(true);
			btnLast.setEnabled(true);
					
		}
		else if(e.getSource() == btnPire){  //

			if(nombreEtudiant > 0)
			{
				int i =0;
				while ( i < nombreEtudiant)
				{
					notes[i] = listStudents[i].getNote();
					notes2[i] = listStudents[i].getNote();
					i++;
				}
				  int indexMin =  getIndexMin(notes);				 
				  position = indexMin;	
				  afficherEtudiant(indexMin);
			}
		}
		
		else if(e.getSource() == btnBest){
			if(nombreEtudiant > 0)
			{
				  int indexMax =  getIndexMax(notes);				 
				  position = indexMax;								 
				  afficherEtudiant(indexMax);
				  
			}
		 }
		
		else if(e.getSource() == btnMoyenne)
		 {
			if(nombreEtudiant > 0)
			{
				  double moyenne = getMoyenne(notes);
				  JOptionPane.showMessageDialog(null, "Moyenne des notes est: " + String.format("%.2f", moyenne));
				  
			}
		 } 
		 else if(e.getSource() == btnMediane)
		 {
			if(nombreEtudiant > 0)
			{
				  int indexMediane = getIndexMediane(notes,nombreEtudiant);
				  position = indexMediane;
				  afficherEtudiant(indexMediane);
				  
				  
			}
		 }

		else if(e.getSource() == btnEcrire){  //
			ecrireFichier(); //appeler une méthode...
		}
		else if(e.getSource() == btnLast){  //
			
			if(position > 0 || position < nombreEtudiant) {
				position = nombreEtudiant - 1;
				afficherEtudiant(position);
				btnPrevious.setText("<< "+(position-1));
				btnNext.setText(">> "+ (position+1));
			}
			/*else if(position >0 || position < 100) {
				btnPrevious.setText("<< " + (position -1));
				btnNext.setText(">> "+ (position+1));
			}*/
			/*position = nombreEtudiant - 1;
			afficherEtudiant(position);	*/
		}

	}
	
	private void afficherEtudiant(int position) {
		NumberFormat formatter = new DecimalFormat("#.##");    
		txtNom.setText(listStudents[position].getNom());
		txtPrenom.setText(listStudents[position].getPrenom());
		txtPhone.setText(listStudents[position].getPhone());
		txtAddress.setText(listStudents[position].getAddress());
		txtCodePostal.setText(listStudents[position].getCodePostal());
		txtVille.setText(listStudents[position].getVille());
		txtPays.setText(listStudents[position].getPays());
		
		//String note = String.format("%.2f", listStudents[position].getNote());
		String note = formatter.format(listStudents[position].getNote());
		txtNote.setText( note);
		
		//String age = String.format("", listStudents[position].getAge());
		String age = String.format("%d", listStudents[position].getAge());
			
		txtAge.setText(age);	
	}
	
	private void lireFichier(){
		try{
			String nomFichier = "resources\\contacts.csv";
			FileReader fr = new FileReader(nomFichier);
			BufferedReader entree = new BufferedReader(fr);
			String ligneLue;
			do{
				ligneLue = entree.readLine();
				if(ligneLue != null){
					Contact e = new Contact(ligneLue);// On utiliser un constructeur "public Contact(String csv)" pour lire un fichier
					listStudents[nombreEtudiant] = e;// csv
					nombreEtudiant++;
				}
			}while(ligneLue != null);
			//Nouvellement ajouter pour btnPire :
			int i = 0;
			if(nombreEtudiant > 0)
			{
				while ( i < nombreEtudiant)
				{
					notes[i] = listStudents[i].getNote();
					notes2[i] = listStudents[i].getNote();
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
	
	private void ecrireFichier(){
		try{
			String nomFichier = "resources\\contacts.csv";
			FileWriter fw = new FileWriter(nomFichier);
			PrintWriter sortie = new PrintWriter(fw);
			for(int i = 0; i < nombreEtudiant; i++){
				if(i < (nombreEtudiant - 1)){
					sortie.println(listStudents[i].toCSV()); //On A Utiliser la methode to csv pour ecrire dans le fichier csv
				}
				else{
					sortie.print(listStudents[i].toCSV());
				}
			}
			sortie.close();
			JOptionPane.showMessageDialog(this, "Employes sauvegardés");
		}
		catch(IOException ex){
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}

	}
	
	 public  int getIndexMin(double[] inputArray){ 
		    double minValue = inputArray[0]; 
		    int j = 0;
		    for(int i=1;i<nombreEtudiant;i++){ 
		      if((inputArray[i] < minValue)){ 
		        minValue = inputArray[i]; 
		        j = i;
		      } 
		    } 
		    return j; 
	} 
	 
	 public  int getIndexMax(double[] inputArray){ 
		    double maxValue = inputArray[0]; 
		    int j =0;
		     for(int i=1;i<nombreEtudiant;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		         j = i;
		      } 
		    }
		    
		    return j; 
	}
	
	 public double getMoyenne(double[] inputArray)
	 {
		 double somme = 0;
		 for(int i=0;i < nombreEtudiant; i++){
			 somme += inputArray[i];
		 }
		 double moyenne = somme / nombreEtudiant;
		 return moyenne;
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
		public double[] trierTab(double[] inputArray,int taille)
		{
			double[] tabtrie = new double[taille];
			int i = 0, j = 1;
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
		
}
