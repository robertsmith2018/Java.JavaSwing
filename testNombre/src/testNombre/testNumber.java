package testNombre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrice;
	private JLabel lblAffichageTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testNumber frame = new testNumber();
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
	public testNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEntrerLaQuantit = new JLabel("Entrer la quantit\u00E9:");
		lblEntrerLaQuantit.setBounds(10, 29, 106, 24);
		contentPane.add(lblEntrerLaQuantit);
		
		JTextPane txtQty = new JTextPane();
		txtQty.setBounds(195, 29, 155, 20);
		contentPane.add(txtQty);
		
		JLabel lblEntrerLePrix = new JLabel("Entrer le prix unitaire :");
		lblEntrerLePrix.setBounds(10, 74, 119, 14);
		contentPane.add(lblEntrerLePrix);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(195, 71, 155, 20);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculer");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int quantite;
				double prixUnitaire;
				String chaineQuantite = txtQty.getText();
				String chainePrixUnitaire = txtPrice.getText();
				if(chaineQuantite.equals("")||chainePrixUnitaire.equals("")) {
					JOptionPane.showMessageDialog(testNumber.this, "Il faut remplir tous les champs");
					return;
				}
				
				try {
					quantite = Integer.parseInt(JOptionPane.showInputDialog("Entrer la quantité"));
					prixUnitaire = Double.parseDouble(JOptionPane.showInputDialog("Entrer le prix unitaire"));
					double total = quantite * prixUnitaire;
					lblAffichageTotal.setText(""+total);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Il faut saisir un nombre");
					return;
				}
				JOptionPane.showMessageDialog(testNumber.this, "Total Calcule");
				
			}
		});
		btnCalculate.setBounds(261, 145, 89, 23);
		contentPane.add(btnCalculate);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(29, 149, 46, 14);
		contentPane.add(lblTotal);
		
		lblAffichageTotal = new JLabel("XXX");
		lblAffichageTotal.setBounds(87, 147, 94, 19);
		contentPane.add(lblAffichageTotal);
	}
	public JLabel getLblAffichageTotal() {
		return lblAffichageTotal;
	}
}
