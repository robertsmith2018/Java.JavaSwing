package Calculatrice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalculatriceCmPouce extends JFrame {

	private JPanel contentPane;
	private JTextField txtInputUnit;
	String [] cboUnits  = {" ","cm", "pouce"};
	private JLabel lblPrimaryUnit;
	private JLabel lblConvertedUnit;
	private JComboBox cboInputUnits;
	private String cboValue = null;
	private JLabel lblHidden;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatriceCmPouce frame = new CalculatriceCmPouce();
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
	public CalculatriceCmPouce() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDimension = new JLabel("Dimension :");
		lblDimension.setBounds(10, 11, 82, 14);
		contentPane.add(lblDimension);
		
		txtInputUnit = new JTextField();
		txtInputUnit.setBounds(114, 8, 86, 20);
		contentPane.add(txtInputUnit);
		txtInputUnit.setColumns(10);
		

		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			float inputUnit = Float.parseFloat(txtInputUnit.getText());
			cboValue = lblHidden.getText();
			//tauxHoraireChoisi = tableTauxHoraire[selectedIndex];
			if( cboValue =="cm"){
				float cm = inputUnit * 2.54f;
				lblConvertedUnit.setText(String.format("%.2f ", cm)+cboUnits[2]);	
				lblPrimaryUnit.setText(String.format("%.2f ", inputUnit)+cboUnits[1]+" 		=");
				}else if(cboValue=="pouce"){
					float pouce = inputUnit /2.54f;
					lblConvertedUnit.setText(String.format("%.2f ", pouce)+cboUnits[1]);	
					lblPrimaryUnit.setText(String.format("%.2f ", inputUnit)+cboUnits[2]+" 		=");	
				}
			
			}
				
		});
		btnConvertir.setBounds(111, 71, 89, 23);
		contentPane.add(btnConvertir);
		
		lblPrimaryUnit = new JLabel("");
		lblPrimaryUnit.setBounds(32, 137, 58, 14);
		contentPane.add(lblPrimaryUnit);
		
		lblConvertedUnit = new JLabel("");
		lblConvertedUnit.setHorizontalAlignment(SwingConstants.LEFT);
		lblConvertedUnit.setBounds(100, 137, 64, 14);
		contentPane.add(lblConvertedUnit);
		
		cboInputUnits = new JComboBox();
		cboInputUnits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = cboInputUnits.getSelectedIndex();
				String cboValue = cboUnits[selectedIndex];
				lblHidden.setText(cboValue);
			}
		
		});
		cboInputUnits.setModel(new DefaultComboBoxModel(new String[] {"Unit\u00E9", "cm ", "pouce"}));
		cboInputUnits.setBounds(256, 8, 86, 20);
		contentPane.add(cboInputUnits);
		
		lblHidden = new JLabel("New label");
		lblHidden.setBounds(296, 75, 46, 14);
		contentPane.add(lblHidden);
	}

	public JLabel getLblPrimaryUnit() {
		return lblPrimaryUnit;
	}

	public JLabel getLblConvertedUnit() {
		return lblConvertedUnit;
	}
	public JComboBox getCboInputUnits() {
		return cboInputUnits;
	}
}
