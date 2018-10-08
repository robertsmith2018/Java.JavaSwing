package SalaireEmployer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class SalaireHoraire extends JFrame {

	private JPanel contentPane;
	private JTextField textNbreHeure;
	private double[] tableTauxHoraire = {0,13.25, 15.30, 32.50};
	private JComboBox cboPoste;
	private JLabel lblTaux;
	
	double tauxHoraireChoisi=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalaireHoraire frame = new SalaireHoraire();
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
	public SalaireHoraire() {
		setTitle("Paie Multi-Choix");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPoste = new JLabel("Poste :");
		lblPoste.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblPoste.setBounds(20, 22, 138, 14);
		contentPane.add(lblPoste);
		
		JLabel lblTauxHoraire = new JLabel("Taux horaire :");
		lblTauxHoraire.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblTauxHoraire.setBounds(20, 47, 138, 14);
		contentPane.add(lblTauxHoraire);
		
		JLabel lblNombresDheures = new JLabel("Nombres d'heures :");
		lblNombresDheures.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNombresDheures.setBounds(20, 72, 138, 14);
		contentPane.add(lblNombresDheures);
		
		cboPoste = new JComboBox();
		cboPoste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int selectedIndex = cboPoste.getSelectedIndex();
				tauxHoraireChoisi = tableTauxHoraire[selectedIndex];
				lblTaux.setText(String.format("%.2f $", tauxHoraireChoisi));
			}
		});
		cboPoste.setModel(new DefaultComboBoxModel(new String[] {"Choisir Le taux", "Caissier", "Vendeur", "G\u00E9rant"}));
		cboPoste.setBounds(206, 19, 171, 20);
		contentPane.add(cboPoste);
		
		JLabel lblSalaireBrut = new JLabel("Salaire brut :");
		lblSalaireBrut.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblSalaireBrut.setBounds(20, 100, 138, 14);
		contentPane.add(lblSalaireBrut);
		
		textNbreHeure = new JTextField();
		textNbreHeure.setBounds(206, 69, 86, 20);
		contentPane.add(textNbreHeure);
		textNbreHeure.setColumns(10);
		
		lblTaux = new JLabel("0.00 $");
		lblTaux.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTaux.setForeground(Color.RED);
		lblTaux.setBounds(206, 47, 171, 14);
		contentPane.add(lblTaux);
		
		JLabel lblSalaireTotal = new JLabel("0.00 $");
		lblSalaireTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSalaireTotal.setForeground(Color.RED);
		lblSalaireTotal.setBounds(206, 100, 65, 14);
		contentPane.add(lblSalaireTotal);
		
		JButton btnCalculer = new JButton("Calculer");
		btnCalculer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double nbreHeure = Double.parseDouble(textNbreHeure.getText());
				
				double heureSupplementaire =0;

				double totalSupplementaire =0;
				double totalRegulier =0;
				
				if(nbreHeure > 35 ){
					heureSupplementaire = nbreHeure - 35;
					totalSupplementaire = heureSupplementaire*2*tauxHoraireChoisi;
					totalRegulier = 35*tauxHoraireChoisi;
					
				}else{
					totalRegulier = nbreHeure * tauxHoraireChoisi;
				}
				double grandTotal = totalRegulier + totalSupplementaire;
				lblSalaireTotal.setText(String.format("%.2f $", grandTotal));
				
				
				
				
			}
		});
		btnCalculer.setBounds(288, 145, 89, 23);
		contentPane.add(btnCalculer);
	}
	public JComboBox getCboPoste() {
		return cboPoste;
	}
	public JLabel getLblTaux() {
		return lblTaux;
	}
	public JTextField getTextNbreHeure() {
		return textNbreHeure;
	}
}
