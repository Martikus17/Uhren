import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class GeekPanel extends JPanel {
  private Calendar cal;
  private int stunde, minute,sekunde;
  private String zeit;

  GeekUhr gu;
  Color l1;
  Color l2;
  Color l3;
  Color l4;
  Color l5;
  Color l6;
  Color l7;
  Color l8;
  Color l9;
  
  Color r1;
  Color r2;
  Color r3;
  Color r4;
  Color r5;
  Color r6;
  Color r7;
  Color r8;
  Color r9;
  
  Color led1;
  Color led2;

  public GeekPanel() {
    setBackground(Color.black);
    
    gu = new GeekUhr(this);
    
    l1 = Color.gray;
    l2 = Color.gray;
    l3 = Color.gray;
    l4 = Color.gray;
    l5 = Color.gray;
    l6 = Color.gray;
    l7 = Color.gray;
    l8 = Color.gray;
    l9 = Color.gray;
    
    r1 = Color.gray;
    r2 = Color.gray;
    r3 = Color.gray;
    r4 = Color.gray;
    r5 = Color.gray;
    r6 = Color.gray;
    r7 = Color.gray;
    r8 = Color.gray;
    r9 = Color.gray;
    
    led1 = Color.white;
    led2 = Color.blue;
    
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
    g.drawString(zeit, 180, 205);
    
    
    g.setColor(l1);
    g.fillOval(15,15,50,50);
    g.setColor(l2);
    g.fillOval(70,15,50,50);
    g.setColor(l3);
    g.fillOval(125,15,50,50);
    g.setColor(l4);
    g.fillOval(15,70,50,50);
    g.setColor(l5);
    g.fillOval(70,70,50,50);
    g.setColor(l6);
    g.fillOval(125,70,50,50);
    g.setColor(l7);
    g.fillOval(15,125,50,50);
    g.setColor(l8);
    g.fillOval(70,125,50,50);
    g.setColor(l9);
    g.fillOval(125,125,50,50);
    
    g.setColor(led1);
    g.fillOval(195,60,20,20);
    g.setColor(led2);
    g.fillOval(195,110,20,20);
    
    g.setColor(r1);
    g.fillOval(235,15,50,50);
    g.setColor(r2);
    g.fillOval(290,15,50,50);
    g.setColor(r3);
    g.fillOval(345,15,50,50);
    g.setColor(r4);
    g.fillOval(235,70,50,50);
    g.setColor(r5);
    g.fillOval(290,70,50,50);
    g.setColor(r6);
    g.fillOval(345,70,50,50);
    g.setColor(r7);
    g.fillOval(235,125,50,50);
    g.setColor(r8);
    g.fillOval(290,125,50,50);
    g.setColor(r9);
    g.fillOval(345,125,50,50);

  }


}