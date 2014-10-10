import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BerlinerPanel extends JPanel {

  private Calendar cal;
  private int stunde, minute,sekunde;
  private String zeit;
  
  BerlinerUhr bu;   // neu
  Color zeile1;     // neu
  
  Color zeile2a;     // neu
  Color zeile2b;     // neu
  Color zeile2c;     // neu
  Color zeile2d;     // neu
  
  Color zeile3a;     // neu
  Color zeile3b;     // neu
  Color zeile3c;     // neu
  Color zeile3d;     // neu
  
  Color zeile4a;     // neu
  Color zeile4b;     // neu
  Color zeile4c;     // neu
  Color zeile4d;     // neu
  Color zeile4e;     // neu
  Color zeile4f;     // neu
  Color zeile4g;     // neu
  Color zeile4h;     // neu
  Color zeile4i;     // neu
  Color zeile4j;     // neu
  Color zeile4k;     // neu
  
  Color zeile5a;     // neu
  Color zeile5b;     // neu
  Color zeile5c;     // neu
  Color zeile5d;     // neu




  public BerlinerPanel() {
    setBackground(Color.black);
    
    bu = new BerlinerUhr(this);  // neu

    zeile1 = Color.white;   // neu
    
    zeile2a = Color.white;   // neu
    zeile2b = Color.white;   // neu
    zeile2c = Color.white;   // neu
    zeile2d = Color.white;   // neu
    
    zeile3a = Color.white;   // neu
    zeile3b = Color.white;   // neu
    zeile3c = Color.white;   // neu
    zeile3d = Color.white;   // neu
    
    zeile4a = Color.white;   // neu
    zeile4b = Color.white;   // neu
    zeile4c = Color.white;   // neu
    zeile4d = Color.white;   // neu
    zeile4e = Color.white;   // neu
    zeile4f = Color.white;   // neu
    zeile4g = Color.white;   // neu
    zeile4h = Color.white;   // neu
    zeile4i = Color.white;   // neu
    zeile4j = Color.white;   // neu
    zeile4k = Color.white;   // neu
    
    zeile5a = Color.white;   // neu
    zeile5b = Color.white;   // neu
    zeile5c = Color.white;   // neu
    zeile5d = Color.white;   // neu


  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);


    this.cal = new GregorianCalendar();
    stunde = cal.get(Calendar.HOUR_OF_DAY);
    minute = cal.get(Calendar.MINUTE);
    sekunde = cal.get(Calendar.SECOND);

    if (stunde < 10){
      zeit="0"+stunde+":";
    } else{
      zeit=""+stunde+":";
    }
    if (minute < 10){
      zeit=zeit+"0"+minute+":";
    } else{
      zeit=zeit+minute+":";
    }
    if (sekunde <10 ){
      zeit=zeit+"0"+sekunde;
    } else{
      zeit=zeit+sekunde;
    }

    g.setColor(Color.white);
    g.drawString(zeit, 115, 280);
    
    

    g.setColor(zeile1);           // abgeaendert
    g.fillOval(124,15,40,40);
    
    g.setColor(zeile2a);           // abgeaendert
    g.fillRect(10,70,60,40);
    g.setColor(zeile2b);           // abgeaendert
    g.fillRect(80,70,60,40);
    g.setColor(zeile2c);           // abgeaendert
    g.fillRect(150,70,60,40);
    g.setColor(zeile2d);           // abgeaendert
    g.fillRect(220,70,60,40);
    
    g.setColor(zeile3a);           // abgeaendert
    g.fillRect(10,120,60,40);
    g.setColor(zeile3b);           // abgeaendert
    g.fillRect(80,120,60,40);
    g.setColor(zeile3c);           // abgeaendert
    g.fillRect(150,120,60,40);
    g.setColor(zeile3d);           // abgeaendert
    g.fillRect(220,120,60,40);
    
    g.setColor(zeile4a);           // abgeaendert
    g.fillRect(11,170,15,40);
    g.setColor(zeile4b);           // abgeaendert
    g.fillRect(36,170,15,40);
    g.setColor(zeile4c);           // abgeaendert
    g.fillRect(61,170,15,40);
    g.setColor(zeile4d);           // abgeaendert
    g.fillRect(86,170,15,40);
    g.setColor(zeile4e);           // abgeaendert
    g.fillRect(111,170,15,40);
    g.setColor(zeile4f);           // abgeaendert
    g.fillRect(136,170,15,40);
    g.setColor(zeile4g);           // abgeaendert
    g.fillRect(161,170,15,40);
    g.setColor(zeile4h);           // abgeaendert
    g.fillRect(186,170,15,40);
    g.setColor(zeile4i);           // abgeaendert
    g.fillRect(211,170,15,40);
    g.setColor(zeile4j);           // abgeaendert
    g.fillRect(236,170,15,40);
    g.setColor(zeile4k);           // abgeaendert
    g.fillRect(261,170,15,40);
    
    g.setColor(zeile5a);           // abgeaendert
    g.fillRect(10,220,60,40);
    g.setColor(zeile5b);           // abgeaendert
    g.fillRect(80,220,60,40);
    g.setColor(zeile5c);           // abgeaendert
    g.fillRect(150,220,60,40);
    g.setColor(zeile5d);           // abgeaendert
    g.fillRect(220,220,60,40);



  }


}
