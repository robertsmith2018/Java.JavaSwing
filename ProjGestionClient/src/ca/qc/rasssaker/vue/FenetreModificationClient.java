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
import ca.qc.rasssaker.modele.ClientException;
import ca.qc.rasssaker.modele.DBManager;

public class FenetreModificationClient extends JInternalFrame {
	JTextField txtCode;
	JTextField txtNom;
	JTextField txtPrenom;
	JTextField txtCouriel;
	JTextField txtTel;
	JTextField txtAdresse;
	JButton cmdModifier;
	JButton cmdRecommencer;
	Client cl;

	public FenetreModificationClient() {
		super("Modification Client", true, true, true, true);
		setSize(500, 430);
		add(getPanelCentre());
		setVisible(true);
	}

	private JPanel getPanelCentre() {
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints cmc = new GridBagConstraints();
		cmc.gridx = 0;
		cmc.gridy = 0;
		cmc.insets = new Insets(5, 5, 5, 5);
		cmc.fill = GridBagConstraints.BASELINE;
		panel.add(new JLabel("Code"), cmc);
		cmc.gridx = 1;
		txtCode = new JTextField(15);
		txtCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rechercherClient();
			}
		});
		panel.add(txtCode, cmc);
		cmc.gridy = 1;
		cmc.gridx = 0;
		cmc.gridheight = 5;
		cmc.gridwidth = 2;

		JPanel panelModifier = new JPanel(new GridBagLayout());
		Border bordure = BorderFactory.createRaisedBevelBorder();
		TitledBorder titre = BorderFactory.createTitledBorder(bordure, "Infos a modifier");
		panelModifier.setBorder(titre);
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;
		c1.gridy = 0;
		c1.insets = new Insets(5, 5, 5, 5);
		c1.fill = GridBagConstraints.BOTH;
		panelModifier.add(new JLabel("Nom"), c1);
		c1.gridx = 1;
		txtNom = new JTextField(15);
		panelModifier.add(txtNom, c1);
		c1.gridy = 1;
		c1.gridx = 0;
		panelModifier.add(new JLabel(" Prenom"), c1);
		c1.gridx = 1;
		txtPrenom = new JTextField(15);
		panelModifier.add(txtPrenom, c1);

		c1.gridy = 3;
		c1.gridx = 0;
		panelModifier.add(new JLabel("Couriel"), c1);
		c1.gridy = 3;
		c1.gridx = 1;
		c1.gridwidth = 2;
		txtCouriel = new JTextField(15);
		panelModifier.add(txtCouriel, c1);
		c1.gridy = 4;
		c1.gridx = 0;
		panelModifier.add(new JLabel("Tel"), c1);
		c1.gridx = 1;
		txtTel = new JTextField(15);
		panelModifier.add(txtTel, c1);
		c1.gridy = 5;
		c1.gridx = 0;
		panelModifier.add(new JLabel("Adresse"), c1);
		c1.gridx = 1;
		txtAdresse = new JTextField(20);
		panelModifier.add(txtAdresse, c1);
		panel.add(panelModifier, cmc);

		cmc.fill = GridBagConstraints.CENTER;
		cmc.gridwidth = 1;
		cmdModifier = new JButton("Modifier");
		cmdModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modifier();
			}
		});
		cmc.gridy = 6;
		cmc.gridx = 0;
		panel.add(cmdModifier, cmc);

		cmdRecommencer = new JButton("Recommencer");
		cmdRecommencer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nettoyer();
			}
		});
		cmc.gridx = 1;
		panel.add(cmdRecommencer, cmc);

		return panel;
	}

	private void modifier() {

		String nom = txtNom.getText();
		String prenom = txtPrenom.getText();
		String adresse = txtAdresse.getText();
		String telephone = txtTel.getText();
		String courriel = txtCouriel.getText();
		if (nom.equals(" ") || prenom.equals("") || adresse.equals("") || telephone.equals(" ")
				|| courriel.equals("")) {
			JOptionPane.showMessageDialog(this, "Il faut remplir le formulaire", "Information manquante",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			DBManager.createConnection("localhost", "gestionclient", "root", "password2017", 3306);
			cl.setNom(nom);
			cl.setPrenom(prenom);
			cl.setAdresse(adresse);
			cl.setTelephone(telephone);
			cl.setCourriel(courriel);
			cl.modifier();
			JOptionPane.showMessageDialog(this, "Le client de code " + cl.getCode() + " vient d'etre modifie:",
					"Client Modifie", JOptionPane.PLAIN_MESSAGE);
			nettoyer();
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this,
					"Un probleme existe dans le systeme, veuillez contacter" + "\nl'administrateur du systeme",
					"Erreur systeme", JOptionPane.ERROR_MESSAGE);
			System.out.println(ex.getMessage());
			return;
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

	private void rechercherClient() {
		String code = txtCode.getText();
		if (code.equals("")) {
			JOptionPane.showMessageDialog(this, "Il faut fournir le code du client", "Information manquante",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			DBManager.createConnection("localhost", "gestionclient", "root", "password2017", 3306);
			cl = new Client(code);
			txtNom.setText(cl.getNom());
			txtPrenom.setText(cl.getPrenom());
			txtAdresse.setText(cl.getAdresse());
			txtTel.setText(cl.getTelephone());
			txtCouriel.setText(cl.getCourriel());
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(this,
					"Un probleme existe dans le systeme, veuillez contacter" + "\nl'administrateur du systeme",
					"Erreur systeme", JOptionPane.ERROR_MESSAGE);
			System.out.println(ex.getMessage());
			return;
		}

		catch (ClientException ex) {

			JOptionPane.showMessageDialog(this, ex.getMessage(), "Client non trouve", JOptionPane.WARNING_MESSAGE);
			return;
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

	public void nettoyer() {
		txtNom.setText("");
		txtPrenom.setText("");
		txtAdresse.setText("");
		txtCouriel.setText("");
		txtTel.setText("");

		Client cl = null;

	}

}
