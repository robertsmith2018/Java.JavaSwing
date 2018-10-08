package ca.qc.cgodin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class FenetrePrincipale extends JFrame implements ActionListener {
	
	private JDesktopPane desktop;
	private JMenuItem optQuitter;
	private JMenuItem optNouveauClient;
	private JMenuItem optModifierClient;
	JMenuItem optSupprimerClient;
	
	public FenetrePrincipale() {
		super("Gestion des comptes");
		setSize(500, 400);	
		setLocation(150,100);
		//setBounds(150,100,500,400);		
		construireBarreMenu();
		desktop = new JDesktopPane();
		add(desktop);
		setVisible(true);
		
	}

	private void construireBarreMenu() {
		
		JMenuBar barreMenu = new JMenuBar();
		
		JMenu mnuClient = new JMenu("Client");
		mnuClient.setMnemonic(KeyEvent.VK_C);
		
		JMenu mnuCompte = new JMenu("Compte");
		mnuCompte.setMnemonic(KeyEvent.VK_O);
		
		JMenu mnuAide = new JMenu("Aide");
		mnuAide.setMnemonic(KeyEvent.VK_A);
		
		barreMenu.add(mnuClient);
		barreMenu.add(mnuCompte);
		barreMenu.add(mnuAide);
		
		//JMenuItem optNouveauClient = new JMenuItem("Nouveau");
		
		optNouveauClient = new JMenuItem("Nouveau");
		optModifierClient = new JMenuItem("Modifier Client");
		
		optNouveauClient.setAccelerator(
				KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK)
				);
		
		optModifierClient.setAccelerator(
				KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.ALT_MASK)
				);
		
		optNouveauClient.addActionListener(this);
		optModifierClient.addActionListener(this);
				
		optSupprimerClient = new JMenuItem("Supprimer");
		optSupprimerClient.addActionListener(this);
		
		JMenuItem optQuitter = new JMenuItem("Sortir du programme");
		optQuitter.setAccelerator(
				KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.ALT_MASK)
				);
		optQuitter.addActionListener(this);
				
		mnuClient.add(optNouveauClient);
		mnuClient.add(optModifierClient);
		mnuClient.add(optSupprimerClient);
		mnuClient.addSeparator();
		mnuClient.add(optQuitter);
		
		JMenuItem optRetrait = new JMenuItem("Retrait");
		JMenuItem optDepot = new JMenuItem("Dépot");
		JMenuItem optVirement = new JMenuItem("Virement");
		JMenuItem optAffichage = new JMenuItem("Affichage");
		
		mnuCompte.add(optRetrait);
		mnuCompte.add(optDepot);
		mnuCompte.add(optVirement);
		mnuCompte.addSeparator();
		mnuCompte.add(optAffichage);
		
		JMenuItem optGuide = new JMenuItem("Guide de l'utilisateur");
		JMenuItem optAPropos = new JMenuItem("A Propos");
		
		mnuAide.add(optGuide);
		mnuAide.addSeparator();
		mnuAide.add(optAPropos);
		
		setJMenuBar(barreMenu);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == optQuitter) {
			System.exit(0);
		}
		else if(e.getSource() == optNouveauClient ) {
			FenetreNouveauClient f = new FenetreNouveauClient();
			desktop.add(f);
			desktop.setSelectedFrame(f);
			
		}
		else if(e.getSource() == optModifierClient ) {
			FenetreModifierClient M = new FenetreModifierClient();
			desktop.add(M);
			desktop.setSelectedFrame(M);
			
		}
		else if(e.getSource() == optSupprimerClient) {
			JOptionPane.showMessageDialog(null, "Vous avez affiché supprimé");
		}
	}
	

}
