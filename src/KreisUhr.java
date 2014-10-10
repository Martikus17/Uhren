import java.awt.*;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class KreisUhr implements Runnable {
  KreisPanel zeichnen;
  private Calendar cal;
  private int stunde, minute,sekunde;
  private String zeit;

  public KreisUhr (KreisPanel zeichnen){
    this.zeichnen = zeichnen;

    Thread th = new Thread(this);
    th.start();

  }

  public void run(){
    while(true){
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
        zeit=zeit+"0"+sekunde+":";
      } else{
        zeit=zeit+sekunde+":";
      }
       
       
       

      zeichnen.repaint();
      try{
        Thread.sleep(1000);
      }
      catch(InterruptedException e){

      }
    }
  }
}
