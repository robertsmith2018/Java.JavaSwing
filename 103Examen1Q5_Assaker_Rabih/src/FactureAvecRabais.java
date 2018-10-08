import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class FactureAvecRabais extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuantity;
	private double prixProduit;
	private double[] tablePrixProduits = {0,350.25, 219.13, 97.42,99.05};
	
/*	private JPanel contentPane;
	private JTextField textNbreHeure;

	private JComboBox cboPoste;
	private JLabel lblTaux;*/

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FactureAvecRabais frame = new FactureAvecRabais();
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
	public FactureAvecRabais() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduit = new JLabel("Produit");
		lblProduit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProduit.setBounds(32, 40, 83, 14);
		contentPane.add(lblProduit);
		
		JLabel lblPrix = new JLabel("Prix");
		lblPrix.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrix.setBounds(32, 81, 46, 14);
		contentPane.add(lblPrix);
		
		JLabel lblQuantity = new JLabel("Quantit\u00E9");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQuantity.setBounds(32, 123, 46, 14);
		contentPane.add(lblQuantity);
		
		JLabel lblRabais = new JLabel("Rabais");
		lblRabais.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRabais.setBounds(32, 164, 46, 14);
		contentPane.add(lblRabais);
		
		JLabel lblTotal = new JLabel("Total apr\u00E8s rabais");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(32, 197, 122, 14);
		contentPane.add(lblTotal);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(198, 120, 131, 20);
		contentPane.add(txtQuantity);
		txtQuantity.setColumns(10);
		
		JLabel resRabais = new JLabel("XXX");
		resRabais.setFont(new Font("Tahoma", Font.BOLD, 11));
		resRabais.setBounds(198, 164, 131, 14);
		contentPane.add(resRabais);
		
		JLabel resTotal = new JLabel("XXX");
		resTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		resTotal.setBounds(198, 197, 131, 14);
		contentPane.add(resTotal);
		
		JLabel resPrix = new JLabel("XXX");
		resPrix.setFont(new Font("Tahoma", Font.BOLD, 11));
		resPrix.setBounds(198, 81, 131, 14);
		contentPane.add(resPrix);
		
		JComboBox cboProduit = new JComboBox();
		cboProduit.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				int selectedIndex = cboProduit.getSelectedIndex();
				prixProduit = tablePrixProduits[selectedIndex];
				resPrix.setText(String.format("%.2f $", prixProduit));
			}
		});
		cboProduit.setModel(new DefaultComboBoxModel(new String[] {"Choisir un produit", "Ordinateur", "Imprimante", "Clavier", "\u00C9cran"}));
		cboProduit.setBounds(198, 37, 131, 20);
		contentPane.add(cboProduit);
		
		JButton btnNewButton = new JButton("Calculer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					int quantity = Integer.parseInt(txtQuantity.getText());
					
					double montantFacture = quantity * prixProduit;
					if(montantFacture<500) {
						resRabais.setText("Pas de Rabais");
						resTotal.setText(String.format("%.2f $", montantFacture));
					}else if(montantFacture>=500 &&  montantFacture<750) {
						double escompteFacture = montantFacture*0.98;
						resRabais.setText("2%");
						resTotal.setText(String.format("%.2f $", escompteFacture));
					}else if(montantFacture >=750 && montantFacture<1000) {
						double escompteFacture = montantFacture*0.96;
						resRabais.setText("4%");
						resTotal.setText(String.format("%.2f $", escompteFacture));
					}else if ( montantFacture>=1000) {
						double escompteFacture = montantFacture*0.95;
						resRabais.setText("5%");
						resTotal.setText(String.format("%.2f $", escompteFacture));
					}
					

				
			}
		});
		btnNewButton.setBounds(198, 228, 89, 23);
		contentPane.add(btnNewButton);
	}
}
