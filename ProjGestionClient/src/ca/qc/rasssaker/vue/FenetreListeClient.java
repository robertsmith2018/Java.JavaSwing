package ca.qc.rasssaker.vue;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import ca.qc.rasssaker.modele.Client;
import ca.qc.rasssaker.modele.DBManager;



public class FenetreListeClient extends JInternalFrame {

	JTextField txtNom;
	JTextField txtPrenom;
	JTextField txtCourriel;
	JTextField txtTelephone;
	JTextField txtAdresse;
	String [] titreColonne ={"Nom","Prenom","Telephone","Courriel","Adresse"};
	String [][] donnees = new String[15][titreColonne.length];
	JTable table;
	
	JButton cmdAfficher;
	
	public FenetreListeClient() {
		super("Modification Client", true, true, true, true);
		setSize(500,430);
		JPanel contentPane = new JPanel();
		contentPane.add(getPanelCentre());
		
		add(contentPane);
		setResizable(false);
		setVisible(true);

	}
	
	public JPanel getPanelCentre(){
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridy = 0;
		c.gridx = 0;
		c.insets = new Insets(5,5,5,5);
		c.fill = GridBagConstraints.BELOW_BASELINE_TRAILING;
		
		panel.add(new JLabel("Nom"),c);
		c.gridx= 1;
		txtNom = new JTextField(15);
		panel.add(txtNom,c);
		
		c.gridx=2;
		panel.add(new JLabel("Prenom"),c);
		c.gridx= 3;
		txtPrenom = new JTextField(15);
		panel.add(txtPrenom,c);
		
		c.gridy=1;
		c.gridx=0;
		panel.add(new JLabel("Telephone"),c);
		c.gridx = 1;
		
		txtTelephone = new JTextField(15);
		panel.add(txtTelephone,c);
		c.gridx=2;
		panel.add(new JLabel("Courriel"),c);
        c.gridx=3;
        txtCourriel = new JTextField(15);
		panel.add(txtCourriel,c);
		
		c.gridy=2;
		c.gridx=1;
		cmdAfficher = new JButton("Afficher");
		cmdAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				afficher();
		
			}
		});
		panel.add(cmdAfficher,c);
		
		
		c.gridy=3;
		c.gridx=0;
		c.gridwidth=5;
		c.gridheight=3;
		table = new JTable(new ModeleTable(donnees, titreColonne));
		panel.add(new JScrollPane(table),c);
		
		return panel;
	}
	
	private void afficher(){
		try{
			DBManager.createConnection("localhost", "gestionclient", "root", "password2017", 3306);
			String nom = txtNom.getText();
			String prenom = txtPrenom.getText();
		//	String adresse = txtAdresse.getText();
			String telephone = txtTelephone.getText();
			String courriel = txtCourriel.getText();
			
			ArrayList<Client> listeClient = new ArrayList<Client>();
			
			if(nom.equals("") &&  prenom.equals("") && telephone.equals("") && courriel.equals("")){

				listeClient = Client.recupererListeClient();

			}else{
				HashMap<String, String>criteres = new HashMap<String, String>();
				
				if(!nom.equals("")){
					criteres.put("nom", nom);
				}
				if(!prenom.equals("")){
					criteres.put("prenom", prenom);
				}
				
				if(!telephone.equals("")){
					criteres.put("telephone", telephone);
				}
			
				if(!courriel.equals("")){
					criteres.put("courriel", courriel);
				}
				listeClient = Client.recupererListeClient(criteres);

			}
			
			
			donnees = new String[listeClient.size()][titreColonne.length];
			int i=0;
			for(Client cl : listeClient){
				
				donnees[i][0] = cl.getNom();
				donnees[i][1] = cl.getPrenom();
				donnees[i][2] = cl.getTelephone();
				donnees[i][3] = cl.getCourriel();
				donnees[i][4] = cl.getAdresse();
				i++;
				
			}
			//Ajouter un teste s'il ya pas de donnees il afficher rien dans la table
			if (i!=0){
			table.setModel(new ModeleTable(donnees, titreColonne));
			}
			
			
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(this, "Probleme systeme, contacter votre admin","Erreur system", JOptionPane.WARNING_MESSAGE );
			return;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
