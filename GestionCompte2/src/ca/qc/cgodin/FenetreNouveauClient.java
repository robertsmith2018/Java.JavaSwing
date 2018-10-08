package ca.qc.cgodin;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class FenetreNouveauClient extends JInternalFrame{
	private Container contentPane;
	public FenetreNouveauClient() {
			super("Nouveau client", true, true, true, true);
			setSize(300,200);
			construireContenu();
			setVisible(true);
						
	}
	
	private void construireContenu() {
		
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JButton btnNord = new JButton("Nord");		
		JButton btnEst = new JButton("Est");
		JButton btnOuest = new JButton("Ouest");
		JButton btnCentre = new JButton("Centre");
		JButton btnEnregistrer = new JButton("Enregistrer");
		JButton btnAnnuler = new JButton("Annuler");
		
		JPanel panelSud = new JPanel();
		panelSud.setLayout(new FlowLayout());
		panelSud.add(btnEnregistrer);
		panelSud.add(btnAnnuler);
		
		contentPane.add(btnNord, BorderLayout.NORTH);		
		contentPane.add(panelSud, BorderLayout.SOUTH);
		contentPane.add(btnEst, BorderLayout.EAST);
		contentPane.add(btnOuest, BorderLayout.WEST);
		contentPane.add(btnCentre, BorderLayout.CENTER);

	}
}
