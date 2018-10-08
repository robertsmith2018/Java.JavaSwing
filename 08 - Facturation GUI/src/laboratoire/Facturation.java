package laboratoire;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Font;
import java.awt.Color;

public class Facturation extends JFrame {
	private final double TAUX_TPS = 0.05;
	private final double TAUX_TVQ = 0.0975;
	private JPanel contentPane;
	private JTextField txtPrixUnitaire;
	private JTextField txtQuantity;
	private JLabel lblSousTotalAvantTaxes;
	private JLabel lblTotalTPS;
	private JLabel lblTotalTVQ;
	private JLabel lblTotalApresTaxes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Facturation frame = new Facturation();
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
	public Facturation() {
		setTitle("Calcul Total apr\u00E8s taxes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prix Unitaire");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(39, 17, 89, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calculer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textPrixUnitaire = txtPrixUnitaire.getText();
				double prixUnitaire = Double.parseDouble(textPrixUnitaire);
				
				String textQuantity = txtQuantity.getText();
				int quantity = Integer.parseInt(textQuantity);
				
				double totalAvantTaxes = quantity*prixUnitaire;
				
				lblSousTotalAvantTaxes.setText(""+ String.format("%.2f", totalAvantTaxes)+"$");
				double totalTPS = totalAvantTaxes*TAUX_TPS;
				double totalTVQ = totalAvantTaxes*TAUX_TVQ;
				double totalApresTaxes = totalAvantTaxes + totalTPS +totalTVQ;
				lblTotalTPS.setText(String.format("%.2f $", totalTPS));
				lblTotalTVQ.setText(String.format("%.2f $", totalTVQ));
				lblTotalApresTaxes.setText(String.format("%.2f $", totalApresTaxes));	
				
				
				
			}
		});
		btnNewButton.setBounds(243, 46, 89, 23);
		contentPane.add(btnNewButton);
		
		txtPrixUnitaire = new JTextField();
		txtPrixUnitaire.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				String txtPrixUnit = txtPrixUnitaire.getText();
				float prixUnit = Float.parseFloat(txtPrixUnit);
				
			}
		});
		txtPrixUnitaire.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPrixUnitaire.setBounds(138, 13, 167, 23);
		contentPane.add(txtPrixUnitaire);
		txtPrixUnitaire.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Total avant Taxes:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(39, 80, 134, 14);
		contentPane.add(lblNewLabel_1);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(138, 47, 86, 20);
		contentPane.add(txtQuantity);
		txtQuantity.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantity.setBounds(39, 50, 62, 14);
		contentPane.add(lblQuantity);
		
		lblSousTotalAvantTaxes = new JLabel("0.00 $");
		lblSousTotalAvantTaxes.setForeground(Color.RED);
		lblSousTotalAvantTaxes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSousTotalAvantTaxes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSousTotalAvantTaxes.setBounds(157, 80, 170, 14);
		contentPane.add(lblSousTotalAvantTaxes);
		
		JLabel lblTps = new JLabel("TPS:");
		lblTps.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTps.setBounds(39, 105, 46, 14);
		contentPane.add(lblTps);
		
		JLabel lblTvq = new JLabel("TVQ:");
		lblTvq.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTvq.setBounds(39, 130, 46, 14);
		contentPane.add(lblTvq);
		
		lblTotalTPS = new JLabel("0.00 $");
		lblTotalTPS.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalTPS.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotalTPS.setForeground(Color.RED);
		lblTotalTPS.setBounds(274, 105, 53, 14);
		contentPane.add(lblTotalTPS);
		
		lblTotalTVQ = new JLabel("0.00 $");
		lblTotalTVQ.setForeground(Color.RED);
		lblTotalTVQ.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalTVQ.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotalTVQ.setBounds(248, 129, 79, 14);
		contentPane.add(lblTotalTVQ);
		
		JLabel Label5 = new JLabel("Total apr\u00E8s taxes:");
		Label5.setFont(new Font("Tahoma", Font.BOLD, 12));
		Label5.setBounds(39, 155, 159, 14);
		contentPane.add(Label5);
		
		lblTotalApresTaxes = new JLabel("0.00 $");
		lblTotalApresTaxes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalApresTaxes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotalApresTaxes.setForeground(Color.RED);
		lblTotalApresTaxes.setBounds(248, 156, 79, 14);
		contentPane.add(lblTotalApresTaxes);
	}

	public JLabel getLblSousTotalAvantTaxes() {
		return lblSousTotalAvantTaxes;
	}
	public JLabel getLblTotalTPS() {
		return lblTotalTPS;
	}
	public JLabel getLblTotalTVQ() {
		return lblTotalTVQ;
	}
	public JLabel getLblTotalApresTaxes() {
		return lblTotalApresTaxes;
	}
}
