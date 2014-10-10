import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class KreisPanel extends JPanel {

  private Calendar cal;
  private int stunde, minute,sekunde;
  private String zeit;

  KreisUhr ku;


  public KreisPanel() {
    setBackground(Color.black);
    
    ku = new KreisUhr(this);
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
    g.drawString(zeit, 145, 340);
    
    
    int x,y;
    int laenge= 150;
    
    
    
    //sekundenkreis:
    g.setColor(Color.green);
    int sekArc = ((sekunde*360)/60);
    int sekStart = (sekArc*-1)+90;
    g.fillArc(20,20,300,300,sekStart, sekArc);
    
    //Überdeckungskreis
    g.setColor(Color.black);
    g.fillOval(45,45,250,250);
    
    //Minutenkreis:
    g.setColor(Color.red);
    int minArc = ((minute*360)/60);
    int minStart = minArc*-1+90;
    g.fillArc(45,45,250,250,minStart, minArc);
    
    
    g.setColor(Color.gray);
    for (int i= 0; i<360; i+= 6 ){
      x=170- (int) (Math.sin(Math.toRadians(i))*laenge);
      y=170- (int) (Math.cos(Math.toRadians(i))*laenge);
      g.drawLine(170,170,x,y);
    }
    
    //Überdeckungskreis
    g.setColor(Color.black);
    g.fillOval(70,70,200,200);
    
    


    g.setColor(Color.white);
    for (int i= 0; i<360; i+= 30 ){
      x=170- (int) (Math.sin(Math.toRadians(i))*laenge);
      y=170- (int) (Math.cos(Math.toRadians(i))*laenge);
      g.drawLine(170,170,x,y);
    }
    
    //Stundenkreis:
    g.setColor(Color.blue);
    int stArc = ((stunde*360)/24);
    int stStart = stArc*-1-90;
    g.fillArc(70,70,200,200,stStart, stArc);

    
    g.setColor(Color.gray);
    for (int i= 0; i<360; i+= 15 ){
      x=170- (int) (Math.sin(Math.toRadians(i))*100);
      y=170- (int) (Math.cos(Math.toRadians(i))*100);
      g.drawLine(170,170,x,y);
    }
    

    
    
     //Mittelkreis:
    g.setColor(Color.black);
    g.fillOval(95,95,150,150);
    
    //Abgrenzungskreise:
    g.setColor(Color.gray);
    g.drawOval(20,20,300,300);
    g.drawOval(45,45,250,250);
    g.drawOval(70,70,200,200);
    g.drawOval(95,95,150,150);

    
    
  }


}