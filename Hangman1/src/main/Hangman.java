package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hangman extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton speler1, speler2, spelerA, spelerB;
    private JPanel p, panelA;
    private JLabel lab1, lab2, lab3, lab4;
    private JTextField woord, letter;
    private String sWoord = "";
    private String sWoord2 = "";
    private String saveWoord = "";
    private String gWoord = "";
    private String gWoord2 = "";
    private int aantalVerloren = 0;
    private JTextField woordA;
    private JTextField textA;
    private JLabel labelB;
	private String sWoordA;
	private String saveWoordA;
	private Component btnA;
 	private String newsWoord2;
	private String newgWoord2;

    public Hangman() {

        p = new JPanel();
        p.setBounds(-3, 33, 490, 340);
        p.setPreferredSize(new Dimension(490, 340));
        p.setBackground(Color.WHITE);

        speler1 = new JButton("Player 1");
        speler1.setBounds(325, 5, 71, 23);
        speler1.addActionListener(this);

        speler2 = new JButton("Player 2");
        speler2.setBounds(253, 378, 71, 23);
        speler2.addActionListener(this);
        speler2.setEnabled(false);

        lab1 = new JLabel("Enter a word");
        lab1.setBounds(87, 9, 62, 14);
        lab2 = new JLabel("Give a letter");
        lab2.setBounds(98, 382, 59, 14);
        lab3 = new JLabel("Guessed: ");
        lab3.setBounds(329, 382, 48, 14);
        lab4 = new JLabel(" ");
        lab4.setBounds(382, 382, 105, 14);

        woord = new JTextField(20);
        woord.setBounds(154, 6, 166, 20);
        letter = new JTextField(10);
        letter.setBounds(162, 379, 86, 20);
        letter.setEnabled(false);
        getContentPane().setLayout(null);

        getContentPane().add(lab1);
        getContentPane().add(woord);
        getContentPane().add(speler1);
        getContentPane().add(p);
        getContentPane().add(lab2);
        getContentPane().add(letter);
        getContentPane().add(speler2);
        getContentPane().add(lab3);
        getContentPane().add(lab4);
        
        JLabel labA = new JLabel("Enter a word");
        labA.setBounds(603, 13, 62, 14);
        getContentPane().add(labA);
        
        woordA = new JTextField(20);
        woordA.setBounds(670, 10, 166, 20);
        getContentPane().add(woordA);
        
        JButton spelerA = new JButton("Player 2");
        spelerA.addActionListener(new ActionListener() {
       

			private Object what;

			public void actionPerformed(ActionEvent e) {
        		//JOptionPane.showMessageDialog(null,"clickMe!");


                if(e.getSource() == spelerA) {
                    String newsWoord2 = woordA.getText();
                    int woordLengte2 = newsWoord2.length();
                    if(woordLengte2 >= 3 && woordLengte2 <= 8) {
                        setsWoordA(newsWoord2.toLowerCase());
                        setSaveWoordA(newsWoord2.toLowerCase());
                        String newgWoord2 = "";

                        for (int i=0; i < woordLengte2; i++) {
                                newgWoord2 = newgWoord2 +  "_";
                        }

                        setgWoordA(newgWoord2 + "  " + woordLengte2 + " Long.");
                        woordA.setText("Saved!");
                        labelB.setText(gWoord2);   
                        enableSpeler4();
                        repaint();
                    }
                    else {
                        woordA.setText("Word does not fit the requirements.");
                    }
                }
                if(e.getSource() == btnA) {

                    Graphics g = p.getGraphics();
                    Graphics2D g2 = (Graphics2D)g;
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                    g2.setColor(Color.BLACK);
                    g2.setStroke(new BasicStroke(10));
                    
                    

                    String s = textA.getText();
                    s = s.toLowerCase();

                    if(s.length() == 1) {
                        if(sWoord2.contains(s)) {
                            char c = s.charAt(0);

                            int aantal = countMatches(sWoord2, c);

                            for(int i =0 ; i < aantal; i++) {
                                int index = sWoord2.indexOf(s);
                                setsWoord(sWoord2.replaceFirst(s, " "));
                                String newgWoord2 = gWoord2.substring(0,index) + s + gWoord2.substring(index + 1);
                                setgWoord(newgWoord2);
                            }

                            labelB.setText(gWoord2);
                            textA.setText("");
                        }
                        else {
                            textA.setText("");
                            aantalVerloren++;

                            switch (aantalVerloren) {
                                case 1: g2.drawLine(80, 320, 230, 320); break;
                                case 2: g2.drawLine(120, 100, 120, 320); break;
                                case 3: g2.drawLine(120, 100, 300, 100); break;
                                case 4: g2.drawLine(122, 270, 180, 315); break;
                                case 5: g2.drawLine(122, 130, 180, 102); break;
                                case 6: g2.setStroke(new BasicStroke(3)); g2.drawLine(280, 100, 280, 150); break;
                                case 7: g2.fillOval(260, 150, 40, 40); break;
                                case 8: g2.setStroke(new BasicStroke(3)); g2.drawLine(280, 190, 280, 240); break;
                                case 9: g2.setStroke(new BasicStroke(3)); g2.drawLine(280, 240, 300, 260); g2.drawLine(280, 240, 260, 260); break;
                                case 10: g2.setStroke(new BasicStroke(3)); g2.drawLine(280, 220, 300, 200); g2.drawLine(260, 200, 280, 220); break;
                            }

                        }
                    }
                    else {
                        textA.setText("One letter, please.");
                    }

                    if(aantalVerloren == 10) {
                        g.drawString("Game Over", 50, 50);
                        aantalVerloren = 0;
                        textA.setText("");
                        enableSpeler4();
                    }
                    else if (!gWoord.contains("_")) {
                        aantalVerloren = 0;
                        g.drawString("Gratz!! You won!!!", 50, 50);
                        textA.setText("");
                        enableSpeler4();
                    }
                }
            
        	}
        });

        spelerA.setBounds(841, 9, 71, 23);
        getContentPane().add(spelerA);
        
        JPanel panelA = new JPanel();
        panelA.setPreferredSize(new Dimension(490, 340));
        panelA.setBackground(Color.WHITE);
        panelA.setBounds(513, 37, 490, 340);
        getContentPane().add(panelA);
        
        JLabel downLabelA = new JLabel("Give a letter");
        downLabelA.setBounds(614, 386, 59, 14);
        getContentPane().add(downLabelA);
        
        textA = new JTextField(10);
        textA.setEnabled(false);
        textA.setBounds(678, 383, 86, 20);
        getContentPane().add(textA);
        
        JButton btnA = new JButton("Player 1");
        btnA.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        btnA.setEnabled(false);
        btnA.setBounds(769, 382, 71, 23);
        getContentPane().add(btnA);
        
        JLabel labelA = new JLabel("Guessed: ");
        labelA.setBounds(845, 386, 48, 14);
        getContentPane().add(labelA);
        
        labelB = new JLabel(" ");
        labelB.setBounds(903, 385, 100, 14);
        getContentPane().add(labelB);

        setTitle("Hangman game!");
        setSize(1136, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

	public void actionPerformed(ActionEvent e) {

        if(e.getSource() == speler1) {
            String newsWoord = woord.getText();
            int woordLengte = newsWoord.length();
            if(woordLengte >= 3 && woordLengte <= 8) {
                setsWoord(newsWoord.toLowerCase());
                setSaveWoord(newsWoord.toLowerCase());
                String newgWoord = "";

                for (int i=0; i < woordLengte; i++) {
                        newgWoord = newgWoord +  "_";
                }

                setgWoord(newgWoord + "  " + woordLengte + " Long.");
                woord.setText("Saved!");
                lab4.setText(gWoord);   
                enableSpeler2();
                repaint();
            }
            else {
                woord.setText("Word does not fit the requirements.");
            }
        }
        if(e.getSource() == speler2) {

            Graphics g = p.getGraphics();
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(10));

            String s = letter.getText();
            s = s.toLowerCase();

            if(s.length() == 1) {
                if(sWoord.contains(s)) {
                    char c = s.charAt(0);

                    int aantal = countMatches(sWoord, c);

                    for(int i =0 ; i < aantal; i++) {
                        int index = sWoord.indexOf(s);
                        setsWoord(sWoord.replaceFirst(s, " "));
                        String newgWoord = gWoord.substring(0,index) + s + gWoord.substring(index + 1);
                        setgWoord(newgWoord);
                    }

                    lab4.setText(gWoord);
                    letter.setText("");
                }
                else {
                    letter.setText("");
                    aantalVerloren++;

                    switch (aantalVerloren) {
                        case 1: g2.drawLine(80, 320, 230, 320); break;
                        case 2: g2.drawLine(120, 100, 120, 320); break;
                        case 3: g2.drawLine(120, 100, 300, 100); break;
                        case 4: g2.drawLine(122, 270, 180, 315); break;
                        case 5: g2.drawLine(122, 130, 180, 102); break;
                        case 6: g2.setStroke(new BasicStroke(3)); g2.drawLine(280, 100, 280, 150); break;
                        case 7: g2.fillOval(260, 150, 40, 40); break;
                        case 8: g2.setStroke(new BasicStroke(3)); g2.drawLine(280, 190, 280, 240); break;
                        case 9: g2.setStroke(new BasicStroke(3)); g2.drawLine(280, 240, 300, 260); g2.drawLine(280, 240, 260, 260); break;
                        case 10: g2.setStroke(new BasicStroke(3)); g2.drawLine(280, 220, 300, 200); g2.drawLine(260, 200, 280, 220); break;
                    }

                }
            }
            else {
                letter.setText("One letter, please.");
            }

            if(aantalVerloren == 10) {
                g.drawString("Game Over", 50, 50);
                aantalVerloren = 0;
                letter.setText("");
                enableSpeler1();
            }
            else if (!gWoord.contains("_")) {
                aantalVerloren = 0;
                g.drawString("Gratz!! You won!!!", 50, 50);
                letter.setText("");
                enableSpeler1();
            }
        }
    }

    /**
     * Count all matches for a char in a string.
     * @param woord
     * @param letter
     * @return count
     */
    public int countMatches(String woord, char letter) {
        int count = 0;
        for (int i=0; i < woord.length(); i++){
            if (woord.charAt(i) == letter) {
                 count++;
            }
        }
        return count;
    }

    /**
     * Enables player 1.
     */
    public void enableSpeler1() {
        letter.setEnabled(false);
        speler2.setEnabled(false);
        woord.setEnabled(true);
        speler1.setEnabled(true);
    }
    
    public void enableSpeler3() {
        textA.setEnabled(false);
        btnA.setEnabled(false);
        woordA.setEnabled(true);
        spelerA.setEnabled(true);
    }

    /**
     * Enables player 2
     */
    public void enableSpeler2() {
        letter.setEnabled(true);
        speler2.setEnabled(true);
        woord.setEnabled(false);
        speler1.setEnabled(false);
    }
    
    public void enableSpeler4() {
        textA.setEnabled(true);
        btnA.setEnabled(true);
        woordA.setEnabled(false);
        spelerA.setEnabled(false);
    }

    public String getsWoord() {
        return sWoord;
    }

    public void setsWoord(String sWoord) {
        this.sWoord = sWoord;
    }
    
    public void setsWoordA(String sWoord2) {
        this.sWoordA = sWoord2;
    }

    public String getgWoord() {
        return gWoord;
    }

    public void setgWoord(String gWoord) {
        this.gWoord = gWoord;
    }
    
    public void setgWoordA(String gWoord2) {
        this.gWoord = gWoord2;
    }

    public String getSaveWoord() {
        return saveWoord;
    }

    public void setSaveWoord(String saveWoord) {
        this.saveWoord = saveWoord;
    }
    
    public void setSaveWoordA(String saveWoord) {
        this.saveWoordA = saveWoord;
    }

    public static void main(String[] args) {
        JFrame Hangman = new Hangman();
    }
}