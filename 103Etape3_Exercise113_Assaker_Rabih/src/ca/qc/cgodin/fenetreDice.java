package ca.qc.cgodin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class fenetreDice extends JFrame {

	private JPanel contentPane;
	private JTextField txtMax;
	private JTextField txtQte;
	private JTextArea textArea;
	private De[] tblDe;
	private int qte;
	private int max;
	private JTextArea textArea_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fenetreDice frame = new fenetreDice();
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
	public fenetreDice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaximum = new JLabel("Maximum Face");
		lblMaximum.setBounds(28, 74, 89, 14);
		contentPane.add(lblMaximum);
		
		JLabel lblNewLabel = new JLabel("Quantite");
		lblNewLabel.setBounds(258, 74, 87, 14);
		contentPane.add(lblNewLabel);
		
		txtMax = new JTextField();
		txtMax.setBounds(127, 71, 121, 20);
		contentPane.add(txtMax);
		txtMax.setColumns(10);
		
		txtQte = new JTextField();
		txtQte.setBounds(356, 71, 144, 20);
		contentPane.add(txtQte);
		txtQte.setColumns(10);
		
		JButton btnGo = new JButton("go");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				qte=Integer.parseInt(txtQte.getText());
				 max=Integer.parseInt(txtMax.getText());
				double moyenne=0.0;
				double sum = 0;
				tblDe=new De[qte];
				for(int i=0; i<tblDe.length; i++){
					 tblDe[i]= new De(max);					
					 textArea_1.append("Dé # " + i + ": "+  tblDe[i].getChiffre() + "\n");
					 sum+=tblDe[i].getChiffre();
				}
				moyenne=sum/qte;
				textArea_1.append("\n\nLa moyenne de "+ qte + "Dés est " +  String.format("%.2f", moyenne ));
				txtQte.setEnabled(false);
				txtMax.setEnabled(false);
				
			}
		});
		btnGo.setBounds(184, 119, 62, 23);
		contentPane.add(btnGo);
		
		JButton btnRecalculer = new JButton("Recalculer");
		btnRecalculer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double moyenne=0.0;
				double sum = 0;
				 textArea_1.setText("");
				for(int i=0; i<tblDe.length; i++){					 
					 tblDe[i].tire();
					 textArea_1.append("Dé # " + i + ": "+  tblDe[i].getChiffre() + "\n");
					 sum+=tblDe[i].getChiffre();
				}
				moyenne= sum/qte;
				textArea_1.append("\nLa moyenne de "+ qte + " Dés est " + String.format("%.2f", moyenne) );
				
			}
		});
		btnRecalculer.setBounds(342, 119, 89, 23);
		contentPane.add(btnRecalculer);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(98, 169, 381, 165);
		contentPane.add(scrollPane);
		
		textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		
		
	}
	public JTextArea getTextArea_1() {
		return textArea_1;
	}
}
