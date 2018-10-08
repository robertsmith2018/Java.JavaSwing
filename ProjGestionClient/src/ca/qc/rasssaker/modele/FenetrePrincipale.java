package ca.qc.rasssaker.modele;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

import ca.qc.rasssaker.vue.FenetreListeClient;
import ca.qc.rasssaker.vue.FenetreModificationClient;
import ca.qc.rasssaker.vue.FenetreNouveauClient;
import ca.qc.rasssaker.vue.FenetreSuppressionClient;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FenetrePrincipale extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktop;
	
	private JMenuItem optQuitClient;
	private JMenuItem optNouveauClient;
	private JMenuItem optModifierClient;
	private JMenuItem optSuppClient;
	
	public static void main(String[] args) {
		
		FenetrePrincipale f = new FenetrePrincipale();
		f.setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public FenetrePrincipale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		desktop = new JDesktopPane();
		desktop.setBackground(Color.WHITE);
		getContentPane().add(desktop);
		
		
		JMenuBar barreMenu = new JMenuBar();
		JMenu mnuClient = new JMenu("Client");
		
		barreMenu.add(mnuClient);
		setJMenuBar(barreMenu);
		
		// Client ===================================================
		mnuClient.setMnemonic(KeyEvent.VK_C);
		
		optNouveauClient = new JMenuItem("Nouveau");
		optNouveauClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FenetreNouveauClient fn =new FenetreNouveauClient();
				desktop.add(fn);
				desktop.setSelectedFrame(fn);
			}
		});
		optNouveauClient.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
        optModifierClient = new JMenuItem("Modifier");
        optModifierClient.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
				FenetreModificationClient fmc =new FenetreModificationClient();
				desktop.add(fmc);
				desktop.setSelectedFrame(fmc);
        	}
        });
		optSuppClient = new JMenuItem("Supprimer");
		optSuppClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FenetreSuppressionClient fsc =new FenetreSuppressionClient();
				desktop.add(fsc);
				desktop.setSelectedFrame(fsc);
			}
		});
	    optQuitClient = new JMenuItem("Quitter");
	    optQuitClient.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		System.exit(0);
	    		
	    	}
	    });
		optQuitClient.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK));
		
		mnuClient.add(optNouveauClient);
		mnuClient.add(optModifierClient);
		mnuClient.add(optSuppClient);
		
		JMenuItem optLister = new JMenuItem("Liste Client");
		optLister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FenetreListeClient flc = new FenetreListeClient();
				desktop.add(flc);
				desktop.setSelectedFrame(flc);
			}
		});
		mnuClient.add(optLister);
		mnuClient.addSeparator();
		mnuClient.add(optQuitClient);
		//Fin Aide =========================================================
	}

}
