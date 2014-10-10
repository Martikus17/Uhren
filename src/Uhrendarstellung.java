import java.awt.*;
import javax.swing.*;

public class Uhrendarstellung extends JPanel{

  public Uhrendarstellung (){
    setBackground(Color.black);

  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    //Grünen Rechtecke

    g.setColor(Color.green);
    g.fillRect(90,25,150,200);
    g.fillRect(260,25,150,200);
    g.fillRect(90,245,150,200);
    g.fillRect(260,245,150,200);
    
    
    //Uhrbezeichnungen
    g.setColor(Color.black);
    g.drawString("Berliner-Uhr",130,50);
    g.drawString("Geek-Uhr",305,50);
    g.drawString("Kreis-Uhr",135,270);
    g.drawString("Wort-Uhr",310,270);
    
    //Schriftzüge

    g.setColor(Color.white);
    g.setFont( new Font( "Arial", Font.BOLD, 23 ) );
    g.drawString("B",35,60);
    g.drawString("i",35,85);
    g.drawString("t",35,110);
    g.drawString("t",35,135);
    g.drawString("e",33,160);

    g.drawString("U",35,200);
    g.drawString("h",35,225);
    g.drawString("r",35,250);

    g.drawString("W",35,290);
    g.drawString("ä",35,315);
    g.drawString("h",35,340);
    g.drawString("l",35,365);
    g.drawString("e",35,390);
    g.drawString("n",35,415);


    g.drawString("B",460,60);
    g.drawString("i",460,85);
    g.drawString("t",460,110);
    g.drawString("t",460,135);
    g.drawString("e",460,160);

    g.drawString("U",460,200);
    g.drawString("h",460,225);
    g.drawString("r",460,250);

    g.drawString("W",460,290);
    g.drawString("ä",460,315);
    g.drawString("h",460,340);
    g.drawString("l",460,365);
    g.drawString("e",460,390);
    g.drawString("n",460,415);
    
  }
}
