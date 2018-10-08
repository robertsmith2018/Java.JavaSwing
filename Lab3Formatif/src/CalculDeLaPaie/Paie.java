package CalculDeLaPaie;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Paie extends JFrame {

	private JPanel contentPane;
	private JTextField txtTauxHoraire;
	private JTextField txtNbreHS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paie frame = new Paie();
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
	public Paie() {
		setTitle("Calcul de la paie");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTauxHoraire = new JLabel("Taux horaire:");
		lblTauxHoraire.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTauxHoraire.setBounds(21, 11, 85, 14);
		contentPane.add(lblTauxHoraire);
		
		JLabel lblNombreDheureSemaine = new JLabel("Nombre d'heure Semaine :");
		lblNombreDheureSemaine.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombreDheureSemaine.setBounds(21, 36, 166, 14);
		contentPane.add(lblNombreDheureSemaine);
		
		JLabel lblSousTotalRegulier = new JLabel("Sous total regulier :");
		lblSousTotalRegulier.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSousTotalRegulier.setBounds(21, 61, 131, 14);
		contentPane.add(lblSousTotalRegulier);
		
		JLabel lblSousTotalSupplementaire = new JLabel("Sous total supplementaire:");
		lblSousTotalSupplementaire.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSousTotalSupplementaire.setBounds(21, 85, 180, 14);
		contentPane.add(lblSousTotalSupplementaire);
		
		JLabel lblGrandTotal = new JLabel("Grand total:");
		lblGrandTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGrandTotal.setBounds(21, 111, 85, 14);
		contentPane.add(lblGrandTotal);
		
		txtTauxHoraire = new JTextField();
		txtTauxHoraire.setBounds(211, 8, 86, 20);
		contentPane.add(txtTauxHoraire);
		txtTauxHoraire.setColumns(10);
		
		txtNbreHS = new JTextField();
		txtNbreHS.setColumns(10);
		txtNbreHS.setBounds(211, 33, 86, 20);
		contentPane.add(txtNbreHS);
		
		JLabel lblSousTR = new JLabel("0.00 $");
		lblSousTR.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSousTR.setForeground(Color.RED);
		lblSousTR.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSousTR.setBounds(211, 61, 86, 14);
		contentPane.add(lblSousTR);
		
		JLabel lblSousTS = new JLabel("0.00 $");
		lblSousTS.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSousTS.setForeground(Color.RED);
		lblSousTS.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSousTS.setBounds(211, 85, 86, 14);
		contentPane.add(lblSousTS);
		
		JLabel lblTotalPaie = new JLabel("0.00 $");
		lblTotalPaie.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalPaie.setForeground(Color.RED);
		lblTotalPaie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalPaie.setBounds(211, 111, 86, 14);
		contentPane.add(lblTotalPaie);
		
		JButton btnCalculer = new JButton("Calculer");
		btnCalculer.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				double tauxHoraire = Double.parseDouble(txtTauxHoraire.getText());
				String textNbreHeure = txtNbreHS.getText();
				double nbreHeure= Double.parseDouble(textNbreHeure);
				
				double heureSupplementaire =0;
				double totalSupplementaire =0;
				double totalRegulier =0;
				
				if(nbreHeure > 35 ){
					heureSupplementaire = nbreHeure - 35;
					totalSupplementaire = heureSupplementaire*2*tauxHoraire;
					totalRegulier = 35*tauxHoraire;
					
				}else{
					totalRegulier = nbreHeure * tauxHoraire;
				}
				double grandTotal = totalRegulier + totalSupplementaire;
				lblSousTR.setText(String.format("%.2f $", totalRegulier));
				lblSousTS.setText(String.format("%.2f $", totalSupplementaire));
				lblTotalPaie.setText(String.format("%.2f $", grandTotal));
									

			}
		});
		btnCalculer.setBounds(208, 150, 89, 23);
		contentPane.add(btnCalculer);
	}
}
