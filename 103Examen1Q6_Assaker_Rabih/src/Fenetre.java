import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Fenetre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre frame = new Fenetre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarteGauche = new JLabel("Carte Gauche");
		lblCarteGauche.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarteGauche.setBounds(29, 11, 189, 31);
		contentPane.add(lblCarteGauche);
		
		JButton btnGauche = new JButton("Cr\u00E9er");
		btnGauche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carte cGauche = new Carte();
				lblCarteGauche.setText((String.format("%s", cGauche.getValeur())));
			}
		});
		btnGauche.setBounds(29, 53, 189, 23);
		contentPane.add(btnGauche);
		
		JLabel lblCarteDroite = new JLabel("Carte Droite");
		lblCarteDroite.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarteDroite.setBounds(218, 11, 165, 31);
		contentPane.add(lblCarteDroite);
		
		JButton btnDroit = new JButton("Cr\u00E9er");
		btnDroit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carte cDroit = new Carte();
				lblCarteDroite.setText((String.format("%s", cDroit.getValeur())));
			}
		});
		btnDroit.setBounds(218, 53, 165, 23);
		contentPane.add(btnDroit);
	}

}
