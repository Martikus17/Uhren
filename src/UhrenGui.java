import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class UhrenGui extends JFrame {
  public Container c;
  Uhrendarstellung zeichnen;
  UhrenSteuerung steuerung;
  JButton bBerliner, bGeek, bKreis, bWort;
  

  public UhrenGui(UhrenSteuerung steuerung) {
    c = getContentPane();
    this.steuerung = steuerung ;
    zeichnen = new Uhrendarstellung();


    BerlinerListener bL = new BerlinerListener();
    GeekListener gL = new GeekListener();
    KreisListener kL = new KreisListener();
    WortListener wL = new WortListener();

    bBerliner= new JButton ("");
    bGeek= new JButton ("");
    bKreis= new JButton ("");
    bWort= new JButton ("");
    
    bBerliner.addActionListener(bL);
    bGeek.addActionListener(gL);
    bKreis.addActionListener(kL);
    bWort.addActionListener(wL);
    
    bBerliner.setBounds(105,65,120,150);
    bGeek.setBounds(275,65,120,150);
    bKreis.setBounds(105,285,120,150);
    bWort.setBounds(275,285,120,150);
    
    bBerliner.setIcon (new ImageIcon ("berlineruhr.png"));
    bGeek.setIcon (new ImageIcon ("geekuhr.png"));
    bKreis.setIcon (new ImageIcon ("kreisuhr.png"));
    bWort.setIcon (new ImageIcon ("wortuhr.png"));
    
    bBerliner.setBackground(Color.WHITE);
    bGeek.setBackground(Color.WHITE);
    bKreis.setBackground(Color.WHITE);
    bWort.setBackground(Color.WHITE);

    c.add(bBerliner);
    c.add(bGeek);
    c.add(bKreis);
    c.add(bWort);
    c.add(zeichnen);
  }
  
  public class BerlinerListener implements ActionListener {
	  public void actionPerformed(ActionEvent e) {
		  steuerung.setFensterBerliner(true);
          steuerung.berliner.setVisible(true);
      }
  }
        
  public class GeekListener implements ActionListener {
	  public void actionPerformed(ActionEvent e) {
		  steuerung.setFensterGeek(true);
          steuerung.geek.setVisible(true);
      }
  }
        
  public class KreisListener implements ActionListener {
	  public void actionPerformed(ActionEvent e) {
		  steuerung.setFensterKreis(true);
          steuerung.kreis.setVisible(true);
      }
  }
        
  public class WortListener implements ActionListener {
	  public void actionPerformed(ActionEvent e) {
		  steuerung.setFensterWort(true);
          steuerung.wort.setVisible(true);
      }
  }
}