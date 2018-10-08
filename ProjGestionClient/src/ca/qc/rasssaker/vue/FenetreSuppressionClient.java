package ca.qc.rasssaker.vue;

import java.awt.EventQueue;
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

public class FenetreSuppressionClient extends JInternalFrame {

	JTextField txtCode ;
	JTextField txtNom ;
	JTextField txtPrenom;
	JTextField txtCouriel ;
	JTextField txtTel ;
	JTextField txtAdresse ;
	JButton cmdSupprimer ;
	JButton cmdRecommencer ;
	Client cl ;
	
	public FenetreSuppressionClient(){
	super(" Supression", true , true , true , true);
	setSize(500, 430);
	add(getPanelCentre());
	setVisible( true);
	}
	
	private JPanel getPanelCentre(){
		JPanel panel = new JPanel (new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0 ;
		c.gridy = 0;
		c . insets = new Insets (5 , 5 , 5, 5) ;
		c . fill = GridBagConstraints.BOTH;
		panel.add (new JLabel ("Code" ) , c ) ;
		c .gridx = 1 ;
		txtCode = new JTextField ( 15 ) ;
		txtCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rechercherClient();
			}
		});
		panel .add(txtCode , c ) ;
		c . gridy=1;
		c . gridx=0;
		c . gridheight=5;
		c . gridwidth=2;
		
		JPanel panelinfo = new JPanel(new GridBagLayout());
		Border bordure = BorderFactory.createLoweredBevelBorder();
		TitledBorder titre = BorderFactory.createTitledBorder(bordure ,"Infos Du Client");
		panelinfo.setBorder(titre);
		GridBagConstraints c1 = new GridBagConstraints();
		c1 .gridx = 0;
		c1 .gridy = 0;
		c1 . insets = new Insets(5, 5, 5, 5);
		c1 .fill = GridBagConstraints. BOTH;
		panelinfo .add(new JLabel( "Nom" ) , c1);
		c1 .gridx = 1;
		txtNom = new JTextField(15);
		panelinfo .add( txtNom , c1);
		c1 .gridy = 1;
		c1 . gridx = 0;
		panelinfo .add(new JLabel( " Prenom" ), c1);
		c1 . gridx = 1;
		txtPrenom = new JTextField(15);
		panelinfo .add( txtPrenom , c1);
		
		c1 .gridy = 3;
		c1 .gridx = 0;
		panelinfo.add(new JLabel( "Couriel" ), c1);
		c1 .gridy = 3;
		c1 .gridx = 1;
		c1 .gridwidth=2;
		txtCouriel = new JTextField(15);
		panelinfo .add( txtCouriel , c1);
		c1.gridy = 4;
		c1.gridx = 0;
		panelinfo .add(new JLabel( "Tel" ) , c1);
		c1 .gridx = 1;
		txtTel = new JTextField(15);
		panelinfo.add( txtTel , c1);
		c1 .gridy = 5;
		c1 .gridx = 0;
		panelinfo.add(new JLabel( "Adresse" ) , c1);
		c1 .gridx = 1;
		txtAdresse = new JTextField(20);
		panelinfo .add( txtAdresse , c1);
		panel .add(panelinfo , c );
		
		c.gridwidth=1;
		cmdSupprimer = new JButton("Supprimer");
		cmdSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				supprimer();
			}
		});
		c.gridy = 6;
		c.gridx = 0;
		panel.add(cmdSupprimer, c);
		cmdRecommencer = new JButton("Recommencer");
		cmdRecommencer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nettoyer();
			}
		});
		c.gridx = 1;
		panel.add(cmdRecommencer, c);
		return panel;

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
	
	
	public void supprimer() {
	try {
	/*	DBManager.createConnection("localhost", "gestionclient", "root", "password2017", 3306);*/
	/*	Client cl2 = new Client("CL-013");*/
		cl.supprimer();
		nettoyer();
		JOptionPane.showMessageDialog(null, "Le Client a été supprimer !");
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}
	
}
