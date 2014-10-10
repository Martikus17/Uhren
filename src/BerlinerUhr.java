import java.awt.*;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BerlinerUhr implements Runnable {
  BerlinerPanel zeichnen;
  int i;
  private Calendar cal;
  private int stunde, minute,sekunde;
  private String zeit;


  public BerlinerUhr (BerlinerPanel zeichnen){
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
        zeit=zeit+"0"+sekunde;
      } else{
        zeit=zeit+sekunde;
      }
    
    
      if (i%2==0){
        zeichnen.zeile1 = Color.yellow;
      } else{
        zeichnen.zeile1 = Color.red;
      }
    

      if (stunde/5==0){
        zeichnen.zeile2a=Color.white;
        zeichnen.zeile2b=Color.white;
        zeichnen.zeile2c=Color.white;
        zeichnen.zeile2d=Color.white;
      }

      if (stunde/5==1){
        zeichnen.zeile2a=Color.red;
        zeichnen.zeile2b=Color.white;
        zeichnen.zeile2c=Color.white;
        zeichnen.zeile2d=Color.white;
      }
      
      if (stunde/5==2){
        zeichnen.zeile2a=Color.red;
        zeichnen.zeile2b=Color.red;
        zeichnen.zeile2c=Color.white;
        zeichnen.zeile2d=Color.white;
      }
      
      if (stunde/5==3){
        zeichnen.zeile2a=Color.red;
        zeichnen.zeile2b=Color.red;
        zeichnen.zeile2c=Color.red;
        zeichnen.zeile2d=Color.white;
      }
      
      if (stunde/5==4){
        zeichnen.zeile2a=Color.red;
        zeichnen.zeile2b=Color.red;
        zeichnen.zeile2c=Color.red;
        zeichnen.zeile2d=Color.red;
      }
      
      
      if (stunde%5==0){
        zeichnen.zeile3a=Color.white;
        zeichnen.zeile3b=Color.white;
        zeichnen.zeile3c=Color.white;
        zeichnen.zeile3d=Color.white;
      }
      
      if (stunde%5==1){
        zeichnen.zeile3a=Color.red;
        zeichnen.zeile3b=Color.white;
        zeichnen.zeile3c=Color.white;
        zeichnen.zeile3d=Color.white;
      }
      
      if (stunde%5==2){
        zeichnen.zeile3a=Color.red;
        zeichnen.zeile3b=Color.red;
        zeichnen.zeile3c=Color.white;
        zeichnen.zeile3d=Color.white;
      }
      
      if (stunde%5==3){
        zeichnen.zeile3a=Color.red;
        zeichnen.zeile3b=Color.red;
        zeichnen.zeile3c=Color.red;
        zeichnen.zeile3d=Color.white;
      }
      
      if (stunde%5==4){
        zeichnen.zeile3a=Color.red;
        zeichnen.zeile3b=Color.red;
        zeichnen.zeile3c=Color.red;
        zeichnen.zeile3d=Color.red;
      }
      
      if (minute/5==0){
        zeichnen.zeile4a=Color.white;
        zeichnen.zeile4b=Color.white;
        zeichnen.zeile4c=Color.white;
        zeichnen.zeile4d=Color.white;
        zeichnen.zeile4e=Color.white;
        zeichnen.zeile4f=Color.white;
        zeichnen.zeile4g=Color.white;
        zeichnen.zeile4h=Color.white;
        zeichnen.zeile4i=Color.white;
        zeichnen.zeile4j=Color.white;
        zeichnen.zeile4k=Color.white;
      }
      
      if (minute/5==1){
        zeichnen.zeile4a=Color.yellow;
        zeichnen.zeile4b=Color.white;
        zeichnen.zeile4c=Color.white;
        zeichnen.zeile4d=Color.white;
        zeichnen.zeile4e=Color.white;
        zeichnen.zeile4f=Color.white;
        zeichnen.zeile4g=Color.white;
        zeichnen.zeile4h=Color.white;
        zeichnen.zeile4i=Color.white;
        zeichnen.zeile4j=Color.white;
        zeichnen.zeile4k=Color.white;
      }
      
      if (minute/5==2){
        zeichnen.zeile4a=Color.yellow;
        zeichnen.zeile4b=Color.yellow;
        zeichnen.zeile4c=Color.white;
        zeichnen.zeile4d=Color.white;
        zeichnen.zeile4e=Color.white;
        zeichnen.zeile4f=Color.white;
        zeichnen.zeile4g=Color.white;
        zeichnen.zeile4h=Color.white;
        zeichnen.zeile4i=Color.white;
        zeichnen.zeile4j=Color.white;
        zeichnen.zeile4k=Color.white;
      }
      
      if (minute/5==3){
        zeichnen.zeile4a=Color.yellow;
        zeichnen.zeile4b=Color.yellow;
        zeichnen.zeile4c=Color.red;
        zeichnen.zeile4d=Color.white;
        zeichnen.zeile4e=Color.white;
        zeichnen.zeile4f=Color.white;
        zeichnen.zeile4g=Color.white;
        zeichnen.zeile4h=Color.white;
        zeichnen.zeile4i=Color.white;
        zeichnen.zeile4j=Color.white;
        zeichnen.zeile4k=Color.white;
      }
      
      if (minute/5==4){
        zeichnen.zeile4a=Color.yellow;
        zeichnen.zeile4b=Color.yellow;
        zeichnen.zeile4c=Color.red;
        zeichnen.zeile4d=Color.yellow;
        zeichnen.zeile4e=Color.white;
        zeichnen.zeile4f=Color.white;
        zeichnen.zeile4g=Color.white;
        zeichnen.zeile4h=Color.white;
        zeichnen.zeile4i=Color.white;
        zeichnen.zeile4j=Color.white;
        zeichnen.zeile4k=Color.white;
      }
      
      if (minute/5==5){
        zeichnen.zeile4a=Color.yellow;
        zeichnen.zeile4b=Color.yellow;
        zeichnen.zeile4c=Color.red;
        zeichnen.zeile4d=Color.yellow;
        zeichnen.zeile4e=Color.yellow;
        zeichnen.zeile4f=Color.white;
        zeichnen.zeile4g=Color.white;
        zeichnen.zeile4h=Color.white;
        zeichnen.zeile4i=Color.white;
        zeichnen.zeile4j=Color.white;
        zeichnen.zeile4k=Color.white;
      }
      
      if (minute/5==6){
        zeichnen.zeile4a=Color.yellow;
        zeichnen.zeile4b=Color.yellow;
        zeichnen.zeile4c=Color.red;
        zeichnen.zeile4d=Color.yellow;
        zeichnen.zeile4e=Color.yellow;
        zeichnen.zeile4f=Color.red;
        zeichnen.zeile4g=Color.white;
        zeichnen.zeile4h=Color.white;
        zeichnen.zeile4i=Color.white;
        zeichnen.zeile4j=Color.white;
        zeichnen.zeile4k=Color.white;
      }
      
      if (minute/5==7){
        zeichnen.zeile4a=Color.yellow;
        zeichnen.zeile4b=Color.yellow;
        zeichnen.zeile4c=Color.red;
        zeichnen.zeile4d=Color.yellow;
        zeichnen.zeile4e=Color.yellow;
        zeichnen.zeile4f=Color.red;
        zeichnen.zeile4g=Color.yellow;
        zeichnen.zeile4g=Color.white;
        zeichnen.zeile4h=Color.white;
        zeichnen.zeile4i=Color.white;
        zeichnen.zeile4j=Color.white;
        zeichnen.zeile4k=Color.white;
      }
      
      if (minute/5==8){
        zeichnen.zeile4a=Color.yellow;
        zeichnen.zeile4b=Color.yellow;
        zeichnen.zeile4c=Color.red;
        zeichnen.zeile4d=Color.yellow;
        zeichnen.zeile4e=Color.yellow;
        zeichnen.zeile4f=Color.red;
        zeichnen.zeile4g=Color.yellow;
        zeichnen.zeile4h=Color.yellow;
        zeichnen.zeile4i=Color.white;
        zeichnen.zeile4j=Color.white;
        zeichnen.zeile4k=Color.white;
      }
      
      if (minute/5==9){
        zeichnen.zeile4a=Color.yellow;
        zeichnen.zeile4b=Color.yellow;
        zeichnen.zeile4c=Color.red;
        zeichnen.zeile4d=Color.yellow;
        zeichnen.zeile4e=Color.yellow;
        zeichnen.zeile4f=Color.red;
        zeichnen.zeile4g=Color.yellow;
        zeichnen.zeile4h=Color.yellow;
        zeichnen.zeile4i=Color.red;
        zeichnen.zeile4j=Color.white;
        zeichnen.zeile4k=Color.white;
      }
      
      if (minute/5==10){
        zeichnen.zeile4a=Color.yellow;
        zeichnen.zeile4b=Color.yellow;
        zeichnen.zeile4c=Color.red;
        zeichnen.zeile4d=Color.yellow;
        zeichnen.zeile4e=Color.yellow;
        zeichnen.zeile4f=Color.red;
        zeichnen.zeile4g=Color.yellow;
        zeichnen.zeile4h=Color.yellow;
        zeichnen.zeile4i=Color.red;
        zeichnen.zeile4j=Color.yellow;
        zeichnen.zeile4k=Color.white;
      }
      
      if (minute/5==11){
        zeichnen.zeile4a=Color.yellow;
        zeichnen.zeile4b=Color.yellow;
        zeichnen.zeile4c=Color.red;
        zeichnen.zeile4d=Color.yellow;
        zeichnen.zeile4e=Color.yellow;
        zeichnen.zeile4f=Color.red;
        zeichnen.zeile4g=Color.yellow;
        zeichnen.zeile4h=Color.yellow;
        zeichnen.zeile4i=Color.red;
        zeichnen.zeile4j=Color.yellow;
        zeichnen.zeile4k=Color.yellow;
      }
      
      if (minute%5==0){
        zeichnen.zeile5a=Color.white;
        zeichnen.zeile5b=Color.white;
        zeichnen.zeile5c=Color.white;
        zeichnen.zeile5d=Color.white;
      }
      
      if (minute%5==1){
        zeichnen.zeile5a=Color.yellow;
        zeichnen.zeile5b=Color.white;
        zeichnen.zeile5c=Color.white;
        zeichnen.zeile5d=Color.white;
      }
      
      if (minute%5==2){
        zeichnen.zeile5a=Color.yellow;
        zeichnen.zeile5b=Color.yellow;
        zeichnen.zeile5c=Color.white;
        zeichnen.zeile5d=Color.white;
      }
      
      if (minute%5==3){
        zeichnen.zeile5a=Color.yellow;
        zeichnen.zeile5b=Color.yellow;
        zeichnen.zeile5c=Color.yellow;
        zeichnen.zeile5d=Color.white;
      }
      
      if (minute%5==4){
        zeichnen.zeile5a=Color.yellow;
        zeichnen.zeile5b=Color.yellow;
        zeichnen.zeile5c=Color.yellow;
        zeichnen.zeile5d=Color.yellow;
      }
      
      zeichnen.repaint();
      try{
        Thread.sleep(1000);
      }
      catch(InterruptedException e){

      }
      i++;
    }
  }
}
