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
    g.drawString("i",39,85);
    g.drawString("t",38,110);
    g.drawString("t",38,135);
    g.drawString("e",36,160);

    g.drawString("U",35,200);
    g.drawString("h",36,225);
    g.drawString("r",38,250);

    g.drawString("W",35,290);
    g.drawString("ä",36,315);
    g.drawString("h",36,340);
    g.drawString("l",39,365);
    g.drawString("e",36,390);
    g.drawString("n",36,415);


    g.drawString("B",460,60);
    g.drawString("i",464,85);
    g.drawString("t",463,110);
    g.drawString("t",463,135);
    g.drawString("e",461,160);

    g.drawString("U",460,200);
    g.drawString("h",461,225);
    g.drawString("r",463,250);

    g.drawString("W",460,290);
    g.drawString("ä",461,315);
    g.drawString("h",461,340);
    g.drawString("l",465,365);
    g.drawString("e",461,390);
    g.drawString("n",461,415);
    
  }
}
