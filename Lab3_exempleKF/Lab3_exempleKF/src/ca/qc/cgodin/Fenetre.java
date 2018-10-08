package ca.qc.cgodin;

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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre extends JFrame implements ActionListener{
	private Employe[] listeEmploye = new Employe[100];   //créer le tableau d'employé
	private int nombreEmploye = 0;
	private int position = 0;
	JButton btnEnregistrer;
	JTextField txtNom;
	JTextField txtPrenom;
	JTextField txtSalaire;
	JButton btnPrecedent;
	JButton btnSuivant;
	JButton btnPremier;
	JButton btnDernier; //exposer bouton
	JButton btnLire;
	JButton btnEcrire;

	Container contentPane;
	public Fenetre(){
		super("Gestion des employes");
		setSize(400, 300);
		construireComposant(); // méthode appeler avant setVisible
		setVisible(true);
	}
	
	public void  construireComposant(){
		contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout()); //nord, sud, est, ouest, content, etc.
		btnPrecedent = new JButton("Precedent");
		btnPrecedent.addActionListener(this);
		btnSuivant = new JButton("Suivant");
		btnSuivant.addActionListener(this); //pour que le bouton réagisse, il envoie l'action à la fonction
		contentPane.add(btnPrecedent, BorderLayout.WEST);
		contentPane.add(btnSuivant, BorderLayout.EAST);
		
		// SUD =======================================
		JPanel panelSud = new JPanel(); //Pour le panel sud, utilisez un FlowLayout pour 
		panelSud.setLayout(new FlowLayout());
		btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(this);
		JButton btnAnnuler = new JButton("Annuler");
		panelSud.add(btnEnregistrer);
		panelSud.add(btnAnnuler);
		contentPane.add(panelSud, BorderLayout.SOUTH);

		// NORD =======================================
		JPanel panelNord = new JPanel();
		panelNord.setLayout(new GridLayout(1,4)); //On crée le panelNord avec le layout GridLayout ex: avec 2 lignes et 5 colonnes
		btnPremier = new JButton("Premier"); //On ajoute les 4 boutons dans le panelSud
		btnPremier.addActionListener(this);
		btnLire = new JButton("Lire");
		btnLire.addActionListener(this);
		btnEcrire = new JButton("Écrire");
		btnEcrire.addActionListener(this);
		btnDernier = new JButton("Dernier");
		btnDernier.addActionListener(this);
		panelNord.add(btnPremier);
		panelNord.add(btnLire);
		panelNord.add(btnEcrire);
		panelNord.add(btnDernier);
		contentPane.add(panelNord, BorderLayout.NORTH);
		
		// CENTRE =======================================
		JPanel panelCentre = new JPanel(new FlowLayout());
		
		JLabel lblNom = new JLabel("Nom");
		panelCentre.add(lblNom);  //ou panelCentre.add(new JLabel("Nom"));
		txtNom = new JTextField(14);
		panelCentre.add(txtNom);
		
		panelCentre.add(new JLabel("Prénom"));
		txtPrenom = new JTextField(14);
		panelCentre.add(txtPrenom);
		
		panelCentre.add(new JLabel("Salaire"));
		txtSalaire = new JTextField(14);
		panelCentre.add(txtSalaire);
		
		contentPane.add(panelCentre, BorderLayout.CENTER);

	}//border layout
	public void actionPerformed(ActionEvent e) { //avec le e il capture le bouton qui a fait l'action
		if(e.getSource() == btnEnregistrer){
			String nom = txtNom.getText();
			String prenom = txtPrenom.getText();
			double salaire = Double.parseDouble(txtSalaire.getText());
			Employe employe1 = new Employe(nom, prenom, salaire);
			listeEmploye[nombreEmploye] = employe1;
			nombreEmploye++;
			JOptionPane.showMessageDialog(this,  "Nouvel employe cree :" + "\n" + employe1);
			nettoyer();
		}
		else if(e.getSource() == btnSuivant){
			if(position < (nombreEmploye-1)){
				position++;
			}
			else{
				position = 0;
			}
			afficherEmploye(position);			
		}
		else if(e.getSource() == btnPrecedent){  //
			if(position > 0){
				position--;
			}
			else{
				position = nombreEmploye - 1;
			}
			afficherEmploye(position);			
		}
		else if(e.getSource() == btnPremier){  //
			position = 0;
			afficherEmploye(position);	
		}
		else if(e.getSource() == btnDernier){  //
			position = nombreEmploye - 1;
			afficherEmploye(position);	
		}
		else if(e.getSource() == btnLire){  //
			lireFichier(); //appeler une méthode...
		}
		else if(e.getSource() == btnEcrire){  //
			ecrireFichier(); //appeler une méthode... voir ci-bas:
		}
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
					Employe e = new Employe(ligneLue);
					listeEmploye[nombreEmploye] = e;
					nombreEmploye++;
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
			for(int i = 0; i < nombreEmploye; i++){
				if(i < (nombreEmploye - 1)){
					sortie.println(listeEmploye[i].toCSV());
				}
				else{
					sortie.print(listeEmploye[i].toCSV());
				}
			}
			sortie.close();
			JOptionPane.showMessageDialog(this, "Employes sauvegardés");
		}
		catch(IOException ex){
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}

	}
	
	private void afficherEmploye(int position){  //récupère dans l'index
		txtNom.setText(listeEmploye[position].getNom());
		txtPrenom.setText(listeEmploye[position].getPrenom());
		
		String salaire = String.format("%.2f", listeEmploye[position].getSalaire());
	//	txtSalaire.setText("" + listeEmploye[position].getSalaire());
		txtSalaire.setText("" + salaire);
		
	}
	
	private void nettoyer(){
		txtNom.setText("");
		txtPrenom.setText("");
		txtSalaire.setText("");
	}

}
