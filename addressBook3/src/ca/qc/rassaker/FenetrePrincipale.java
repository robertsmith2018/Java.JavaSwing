package ca.qc.rassaker;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;







public class FenetrePrincipale extends JFrame implements ActionListener {
	private Contact[] listStudents = new Contact[100];
	private int nombreEtudiant = 0;
	private int position = 0;
	
	JPanel panelCentre;
	JTextField txtNom;
	JTextField txtPrenom;
	JTextField txtPhone;
	JTextField txtAddress;
	JTextField txtCodePostal;
	JTextField txtVille;
	JTextField txtPays;
	JTextField txtNote;
	JTextField txtAge;
	
	JButton btnNew;
	JButton btnNext;
	JButton btnPrevious;
	JButton btnLast;
	JButton btnLire;
	JButton btnEcrire;
	JButton btnUpdate;
	JButton btnPremier;
	
	private Container contentPane;
	public FenetrePrincipale(){
		 super("Gestion des comptes");
		 setSize(500,300);
		 construireContenu();
		 setVisible(true);
	}
	
	 private void construireContenu(){
		 contentPane = getContentPane();
		 contentPane.setLayout(new BorderLayout());
		 JButton btnNord = new JButton("Super Contacts Ahunstic");
		 
		 
		 btnNext = new JButton(">>(7)");
		 btnNext.addActionListener(this);
		 
		 btnPrevious = new JButton("<<(5)");
		 btnPrevious.addActionListener(this);
			/*btnPrevious.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCentre.setBackground(null);
				}
			});*/
		 
		 btnPremier = new JButton("<<<(1)");
		 btnPremier.addActionListener(this);
			/*btnPremier.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCentre.setBackground(null);
				}
			});*/
		 btnUpdate = new JButton("Mise à...");
		 btnUpdate.addActionListener(this);
			/*btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCentre.setBackground(null);
				}
			});*/
		 btnLire = new JButton("Lire");
		 btnLire.addActionListener(this);
		 
		 btnEcrire = new JButton("Écrire");
		 btnEcrire.addActionListener(this);
		 
		 btnLast = new JButton(">>>(14)");
		 btnLast.addActionListener(this);
			/*btnLast.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCentre.setBackground(null);
				}
			});*/
		 btnNew = new JButton("Nouveau");
		 btnNew.addActionListener(this);
			
		 JButton btnBest = new JButton("Meilleur");
		 JButton btnLowest = new JButton("Pire");
		 JButton btnMoyenne = new JButton("Moyen...");
		 JButton btnMediane = new JButton("Médiane");
		 
		 JTextField txtNom = new JTextField("Nom",15);
		 JTextField txtPrenom = new JTextField("Prenom",15);
		 JTextField txtAge = new JTextField("13",8);
		 JTextField txtPhone = new JTextField("Phone",15);
		 JTextField txtAddress = new JTextField("Address",30);
		 JTextField txtCodePostal = new JTextField("Code Postal",10);
		 JTextField txtVille = new JTextField("Ville",20);
		 JTextField txtPays = new JTextField("Pays",15);
		 JTextField txtNote = new JTextField("12.00",8);
		 
		 
		  panelCentre = new JPanel();
		 
    	/*	Color c = new Color(0, 102, 34);
		 panelCentre.setBackground(c);*/
		 
		 panelCentre.setLayout(new FlowLayout());
		 panelCentre.add(txtNom);
		 panelCentre.add(txtPrenom);
		 panelCentre.add(txtAge);
		 panelCentre.add(txtPhone);
		 panelCentre.add(txtAddress);
		 panelCentre.add(txtCodePostal);
		 panelCentre.add(txtVille);
		 panelCentre.add(txtPays);
		 panelCentre.add(txtNote);
		
		 JPanel panelSud = new JPanel();
		 panelSud.setLayout(new GridLayout(2, 5));
		 panelSud.add(btnPremier);
		 panelSud.add(btnUpdate);
		 panelSud.add(btnLire);
		 panelSud.add(btnEcrire);
		 panelSud.add(btnLast);
		 panelSud.add(btnNew);
		 panelSud.add(btnBest);
		 panelSud.add(btnLowest);
		 panelSud.add(btnMoyenne);
		 panelSud.add(btnMediane);
			
			
		 contentPane.add(btnNord, BorderLayout.NORTH);
	     contentPane.add(panelSud, BorderLayout.SOUTH);
		 contentPane.add(btnNext, BorderLayout.EAST);
		 contentPane.add(btnPrevious, BorderLayout.WEST);
		 contentPane.add(panelCentre, BorderLayout.CENTER);
	 }

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNew){
			nettoyer();
		}
			/*
		String nom = txtNom.getText();
		String prenom = txtPrenom.getText();
		String phone = txtPhone.getText();
		String address = txtAddress.getText();
		String codePostal = txtCodePostal.getText();
		String ville = txtVille.getText();
		String pays = txtPays.getText();
		double note = Double.parseDouble(txtNote.getText());
		int age = Integer.parseInt(txtAge.getText());
		
		Contact student = new Contact(nom, prenom, phone, address, codePostal, ville, pays, note, age);
		
		listStudents[nombreEtudiant] = student;
		nombreEtudiant++;
		JOptionPane.showMessageDialog(this, "Nouvel employe cree :" + "\n" + student);
		
		
		panelCentre.setBackground(Color.green);
		*/
		}/*
		else if(e.getSource() == btnNext){
			panelCentre.setBackground(null);
			if(position < (nombreEtudiant-1)){
				position++;
			}
			else{
				position = 0;
			}
			afficherEtudiant(position);			
		}
		else if(e.getSource() == btnPrevious){  //
			if(position > 0){
				position--;
			}
			else{
				position = nombreEtudiant - 1;
			}
			afficherEtudiant(position);			
		}
		else if(e.getSource() == btnPremier){  //
			position = 0;
			afficherEtudiant(position);	
		}
		else if(e.getSource() == btnLast){  //
			position = nombreEtudiant - 1;
			afficherEtudiant(position);	
		}
		else if(e.getSource() == btnLire){  //
			lireFichier(); //appeler une méthode...
		}
		else if(e.getSource() == btnEcrire){  //
			ecrireFichier(); //appeler une méthode... voir ci-bas:
		}
	}*/
	
	private void lireFichier(){
		try{
			String nomFichier = "resources\\contacts.csv";
			FileReader fr = new FileReader(nomFichier);
			BufferedReader entree = new BufferedReader(fr);
			String ligneLue;
			do{
				ligneLue = entree.readLine();
				if(ligneLue != null){
					Contact e = new Contact(ligneLue);
					listStudents[nombreEtudiant] = e;
					nombreEtudiant++;
				}
			}while(ligneLue != null);
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
					sortie.println(listStudents[i].toCSV());
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
	
	private void afficherEtudiant(int position) {
		txtNom.setText(listStudents[position].getNom());
		txtPrenom.setText(listStudents[position].getPrenom());
		txtPhone.setText(listStudents[position].getPhone());
		txtAddress.setText(listStudents[position].getAddress());
		txtCodePostal.setText(listStudents[position].getCodePostal());
		
		String note = String.format("%.1f", listStudents[position].getNote());
		txtNote.setText("" + note);
		
		String age = String.format("%", listStudents[position].getAge());
		txtAge.setText("" + age);
		
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
	
}


