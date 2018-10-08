package packagePendu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class formPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textNom1;
	private JTextField textNom2;
	private JTextField textLetter1;
	private JTextField textLetter2;
	
	private JLabel lblrabih;
	private JLabel lblhamza;
	private JLabel lblCharTester;
	
	private static JButton btnJoueur2;
	private static JButton btnJoueur1;
	
	String lettreTester="";

// Declaration des deux joueurs =================
	pendu p1 = new pendu();
	pendu p2 = new pendu();
//===============================================
		
	String mot1;
	String mot2;
	String lettre;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formPrincipal frame = new formPrincipal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
					/*Je recupere les secondes de l'heure system
					  si le seconde paire il désactive button joueur1 
					  sinon il désactive  button joueur2*/
					
						Calendar calendar = Calendar.getInstance();
						int seconde = calendar.getTime().getSeconds();
						if(seconde%2 ==0){
							btnJoueur1.setEnabled(false);
							btnJoueur2.setEnabled(true);
						}else{
							btnJoueur1.setEnabled(true);
							btnJoueur2.setEnabled(false);
						}
					//=======================================================
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public formPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNom1 = new JTextField("canada");
		textNom1.setBounds(25, 66, 138, 20);
		contentPane.add(textNom1);
		textNom1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("[HAMZA] Entrer un mot :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(25, 49, 138, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblrabihEntrerUn = new JLabel("[RABIH] Entrer un mot :");
		lblrabihEntrerUn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblrabihEntrerUn.setBounds(307, 50, 146, 14);
		contentPane.add(lblrabihEntrerUn);
		
		textNom2 = new JTextField("france");
		textNom2.setBounds(307, 66, 138, 20);
		contentPane.add(textNom2);
		textNom2.setColumns(10);
		
		textLetter1 = new JTextField();
		textLetter1.setBounds(38, 137, 100, 20);
		contentPane.add(textLetter1);
		textLetter1.setColumns(10);
		
		textLetter2 = new JTextField();
		textLetter2.setText("");
		textLetter2.setBounds(321, 137, 100, 20);
		contentPane.add(textLetter2);
		textLetter2.setColumns(10);
		
		JLabel lblEntrerUneLettre = new JLabel("Entrer une lettre :");
		lblEntrerUneLettre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEntrerUneLettre.setBounds(38, 112, 105, 14);
		contentPane.add(lblEntrerUneLettre);
		
		JLabel lblNewLabel_1 = new JLabel("Entrer une lettre :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(324, 112, 112, 14);
		contentPane.add(lblNewLabel_1);
		
		btnJoueur1 = new JButton("Jouer ");
		btnJoueur1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

//========================================================================================================
//Button Joueur Hamza========================================================================================
				
				if(textLetter1.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Entrer un caractere");
					return;
				}
				
				
				btnJoueur1.setEnabled(false);
				btnJoueur2.setEnabled(true);

				
				mot1 = textNom1.getText();
				mot2 = textNom2.getText();
				lettre = textLetter1.getText();
				
				if(mot1.contains(lettre) && mot2.contains(lettre) ){ // si la lettre existe dans les deux mots
					p1.testPendu(mot1, lettre);
					p2.testPendu(mot2, lettre);
				}else{ //sinon il cherche dans le mot de l'adverser Rabih
					p2.testPendu(mot2, lettre);
				}
				
				if(!lettreTester.contains(p1.getLettreTester())){
					   lettreTester += lettre; //stocker le caracteur trouver.
				}
				
				if(!lettreTester.contains(p2.getLettreTester())){
					   lettreTester += lettre; //stocker le caracteur trouver.
				}
				
				//Afficher les resultat ========================
				lblCharTester.setText(lettreTester);
				lblrabih.setText(p1.getResult());
				lblhamza.setText(p2.getResult());
				
				textLetter1.setText("");
	
				if(mot2.equals(p2.getResult()) && mot1.equals(p1.getResult())){
					JOptionPane.showMessageDialog(null, "Bravo!! Match null");
					p1.newGame();
					p2.newGame();
					return;
				}
				
				if(mot2.equals(p2.getResult())){
					JOptionPane.showMessageDialog(null, "Bravo!! Hamza");
					p1.newGame();
					p2.newGame();
				}
				

//fin Button Joueur hamza  ==================================================================================
			}
		});
		btnJoueur1.setBounds(38, 168, 99, 23);
		contentPane.add(btnJoueur1);
		
	    btnJoueur2 = new JButton("Jouer");
		btnJoueur2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//========================================================================================================
//Button Joueur Rabih ========================================================================================
				
				if(textLetter2.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Entrer un caractere");
					return;
				}
				
				btnJoueur1.setEnabled(true);
				btnJoueur2.setEnabled(false);
				
				mot1 = textNom1.getText();
				mot2 = textNom2.getText();
				lettre = textLetter2.getText();
				
				if(mot1.contains(lettre) && mot2.contains(lettre) ){ // si la lettre existe dans les deux mots
					p1.testPendu(mot1, lettre);
					p2.testPendu(mot2, lettre);
				}else{ //sinon il cherche dans le mot de l'adverser Hamza
					p1.testPendu(mot1, lettre);
				}
				
				if(!lettreTester.contains(p1.getLettreTester())){
					   lettreTester += lettre; //stocker le caracteur trouver.
				}
				
				if(!lettreTester.contains(p2.getLettreTester())){
					   lettreTester += lettre; //stocker le caracteur trouver.
				}
				
				//Afficher les resultat ========================
				lblCharTester.setText(lettreTester);
				lblrabih.setText(p1.getResult());
				lblhamza.setText(p2.getResult());
				
				textLetter2.setText("");
				
				if(mot2.equals(p2.getResult()) && mot1.equals(p1.getResult())){
					JOptionPane.showMessageDialog(null, "Bravo!! Match null");
					p1.newGame();
					p2.newGame();
					return;
				}
				
				if(mot1.equals(p1.getResult())){
					JOptionPane.showMessageDialog(null, "Bravo!! Rabih");
					p1.newGame();
					p2.newGame();
					
				}
				

//fin Button joueur 02 ========================================================================		
			}
		});
		btnJoueur2.setBounds(321, 168, 100, 23);
		contentPane.add(btnJoueur2);
		
		JLabel lblHamza = new JLabel("HAMZA :");
		lblHamza.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHamza.setBounds(157, 212, 70, 14);
		contentPane.add(lblHamza);
		
		JLabel lblRabih = new JLabel("RABIH:");
		lblRabih.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRabih.setBounds(157, 237, 70, 14);
		contentPane.add(lblRabih);
		
		lblrabih = new JLabel("_");
		lblrabih.setBounds(226, 212, 138, 14);
		contentPane.add(lblrabih);
		
		lblhamza = new JLabel("_");
		lblhamza.setBounds(226, 235, 128, 14);
		contentPane.add(lblhamza);
		
		JLabel lblCaracterTester = new JLabel("Caracter tester :");
		lblCaracterTester.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCaracterTester.setBounds(127, 11, 100, 14);
		contentPane.add(lblCaracterTester);
		
		lblCharTester = new JLabel("");
		lblCharTester.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCharTester.setHorizontalAlignment(SwingConstants.LEFT);
		lblCharTester.setBounds(226, 11, 128, 14);
		contentPane.add(lblCharTester);
	}
}
