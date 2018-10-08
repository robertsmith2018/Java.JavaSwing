package ca.qc.rasssaker.vue;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import ca.qc.rasssaker.modele.Client;
import ca.qc.rasssaker.modele.DBManager;

public class FenetreNouveauClient extends JInternalFrame {
	JTextField txtNom;
	JTextField txtPrenom;
	JTextField txtCourriel;
	JTextField txtTel;
	JTextField txtAdresse;
	JButton cmdEnregistrer;
	JButton cmdAnnuler;

	public FenetreNouveauClient() {

		super("Nouveau Client", true, true, true, true);
		setSize(500, 430);
		add(getPanelCentre());
		setResizable(false);
		setVisible(true);
	}

	private JPanel getPanelCentre() {
		JPanel panel = new JPanel(new GridBagLayout());
		Border border = BorderFactory.createRaisedBevelBorder();
		TitledBorder titreBordure = BorderFactory.createTitledBorder(border, "Informations du client");
		panel.setBorder(titreBordure);
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(5, 5, 5, 5);
		c.fill = GridBagConstraints.BOTH;

		panel.add(new JLabel("Nom"), c);
		c.gridx = 1;
		txtNom = new JTextField(15);
		panel.add(txtNom, c);

		c.gridy = 1;
		c.gridx = 0;
		panel.add(new JLabel("Prenom"), c);
		c.gridx = 1;
		txtPrenom = new JTextField(15);
		panel.add(txtPrenom, c);
		c.gridy = 3;
		c.gridx = 0;
		panel.add(new JLabel("Couriel"), c);
		c.gridy = 3;
		c.gridx = 1;
		c.gridwidth = 2;
		txtCourriel = new JTextField(15);
		panel.add(txtCourriel, c);
		c.gridy = 4;
		c.gridx = 0;
		panel.add(new JLabel("Telephone"), c);
		c.gridx = 1;
		txtTel = new JTextField(15);
		panel.add(txtTel, c);

		c.gridy = 5;
		c.gridx = 0;
		panel.add(new JLabel("Adresse"), c);
		c.gridx = 1;
		txtAdresse = new JTextField(20);
		panel.add(txtAdresse, c);

		c.gridy = 6;
		c.gridx = 0;
		c.gridwidth = 1;
		cmdEnregistrer = new JButton("Enregistrer");
		cmdEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enregistrer();
			}
		});
		panel.add(cmdEnregistrer, c);

		c.gridx = 1;
		cmdAnnuler = new JButton("Annuler");
		cmdAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nettoyer();
			}
		});
		panel.add(cmdAnnuler);
		return panel;
		
	}
	
	public void enregistrer() {
			
		String nom = txtNom.getText();
		String prenom = txtPrenom.getText();
		String adresse = txtAdresse.getText();
		String telephone = txtTel.getText();
		String courriel = txtCourriel.getText();
		if (nom.equals("") || prenom.equals("") || adresse.equals("") || telephone.equals("") || courriel.equals("")) {
			JOptionPane.showMessageDialog(this, "Il faut remplir le formulaire", "Information manquante",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			DBManager.createConnection("localhost", "gestionclient", "root", "password2017", 3306);

			Client cl = new Client(nom, prenom, adresse, telephone, courriel);
			cl.enregistrer();
			JOptionPane.showMessageDialog(this, "Un client vient d'etre enregistre.\nSon code est " + cl.getCode(),
					"Client enregistre", JOptionPane.PLAIN_MESSAGE);
			nettoyer();
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this,

					"Un probleme existe dans le systeme , veuillez contacter\nl'administrateur du systeme",
					"Erreur Systeme", JOptionPane.ERROR_MESSAGE);

			System.out.println(ex.getMessage());
			return;
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public void nettoyer() {
		txtNom.setText("");
		txtPrenom.setText("");
		txtAdresse.setText("");
		txtCourriel.setText("");
		txtTel.setText("");
		
		Client cl = null;
		
	}
	


}
