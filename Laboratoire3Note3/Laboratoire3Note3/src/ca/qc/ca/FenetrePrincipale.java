package ca.qc.ca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FenetrePrincipale extends JFrame implements ActionListener {
	private Container contentPane;
	// private JDesktopPane desktop;
	JPanel panelCentre;
	
	
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
		 JButton btnNord = new JButton("Super Contacts Ahunstic");
		 JButton btnSud = new JButton("Sud");
		 JButton btnEst = new JButton(">>(7)");
			btnEst.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCentre.setBackground(null);
				}
			});
		 JButton btnOuest = new JButton("<<(5)");
			btnOuest.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCentre.setBackground(null);
				}
			});
		 JButton btnCentre = new JButton("Centre");
		 
		 JButton btnSud1 = new JButton("<<<(1)");
			btnSud1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCentre.setBackground(null);
				}
			});
		 JButton btnSud2 = new JButton("Mise à...");
			btnSud2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCentre.setBackground(null);
				}
			});
		 JButton btnSud3 = new JButton("Lire");
		 JButton btnSud4 = new JButton("Écrire");
		 JButton btnSud5 = new JButton(">>>(14)");
			btnSud5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCentre.setBackground(null);
				}
			});
		 JButton btnSud6 = new JButton("Nouveau");
			btnSud6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCentre.setBackground(Color.green);
				}
			});
		 JButton btnSud7 = new JButton("Meilleur");
		 JButton btnSud8 = new JButton("Pire");
		 JButton btnSud9 = new JButton("Moyen...");
		 JButton btnSud10 = new JButton("Médiane");
		 
		 JTextField txtCentre1 = new JTextField("Nom",15);
		 JTextField txtCentre2 = new JTextField("Prénom",15);
		 JTextField txtCentre3 = new JTextField("Age",8);
		 JTextField txtCentre4 = new JTextField("Téléphone",15);
		 JTextField txtCentre5 = new JTextField("Adresse",30);
		 JTextField txtCentre6 = new JTextField("Code Postal",10);
		 JTextField txtCentre7 = new JTextField("Ville",20);
		 JTextField txtCentre8 = new JTextField("Pays",15);
		 JTextField txtCentre9 = new JTextField("Note",8);
		 
		 
		  panelCentre = new JPanel();
		 
    	/*	Color c = new Color(0, 102, 34);
		 panelCentre.setBackground(c);*/
		 
		 panelCentre.setLayout(new FlowLayout());
		 panelCentre.add(txtCentre1);
		 panelCentre.add(txtCentre2);
		 panelCentre.add(txtCentre3);
		 panelCentre.add(txtCentre4);
		 panelCentre.add(txtCentre5);
		 panelCentre.add(txtCentre6);
		 panelCentre.add(txtCentre7);
		 panelCentre.add(txtCentre8);
		 panelCentre.add(txtCentre9);
		
		 
		 
		 JPanel panelSud = new JPanel();
		 panelSud.setLayout(new GridLayout(2, 5));
		 panelSud.add(btnSud1);
		 panelSud.add(btnSud2);
		 panelSud.add(btnSud3);
		 panelSud.add(btnSud4);
		 panelSud.add(btnSud5);
		 panelSud.add(btnSud6);
		 panelSud.add(btnSud7);
		 panelSud.add(btnSud8);
		 panelSud.add(btnSud9);
		 panelSud.add(btnSud10);
			
			
		 contentPane.add(btnNord, BorderLayout.NORTH);
	     contentPane.add(panelSud, BorderLayout.SOUTH);
		 contentPane.add(btnEst, BorderLayout.EAST);
		 contentPane.add(btnOuest, BorderLayout.WEST);
		 contentPane.add(panelCentre, BorderLayout.CENTER);
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


