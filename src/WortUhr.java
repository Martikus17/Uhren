import java.awt.*;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class WortUhr implements Runnable {
  WortPanel zeichnen;
  private Calendar cal;
  private int stunde, minute,sekunde;
  private String zeit;

  public WortUhr (WortPanel zeichnen){
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

       if (stunde>=12){
         zeichnen.am=Color.white;
         zeichnen.pm=Color.white;
       } else{
         zeichnen.am=Color.white;
         zeichnen.pm=Color.gray;
       }

       if (minute<5){
         zeichnen.uhr=Color.white;
       } else{
         zeichnen.uhr=Color.gray;
       }
       
       if ((minute>=5 && minute<10) || (minute>=25 && minute<30) || (minute>=35 && minute<40) || (minute>=55 && minute <=59)){
         zeichnen.fuenfVorNach=Color.white;
       } else{
         zeichnen.fuenfVorNach=Color.gray;
       }
       
       if ((minute>=10 && minute<15) || (minute>=50 && minute<55)){
         zeichnen.zehnVorNach=Color.white;
       } else{
         zeichnen.zehnVorNach=Color.gray;
       }
       
       if ((minute>=20 && minute<25) || (minute>=40 && minute<45)){
         zeichnen.zwanzigVorNach=Color.white;
       } else{
         zeichnen.zwanzigVorNach=Color.gray;
       }

        if ((minute>=15 && minute<20) || (minute>=45 && minute<50)){
         zeichnen.viertelVorNach=Color.white;
       } else{
         zeichnen.viertelVorNach=Color.gray;
       }
       
       /*if (minute>=45 && minute<=50){
         zeichnen.dreiviertelVorNach=Color.white;
         zeichnen.viertelVorNach=Color.white;
       } else{
         zeichnen.dreiviertelVorNach=Color.gray;
         zeichnen.viertelVorNach=Color.gray;
       }*/
       
       if((minute>=5 && minute<10) || (minute>=35 && minute<40) || (minute>=10 && minute<15) || (minute>=20 && minute<25) || (minute>=15 && minute<=20)){
         zeichnen.nach=Color.white;
       } else{
         zeichnen.nach=Color.gray;
       }
       
       if((minute>=25 && minute<30) || (minute>=55 && minute <=59) ||  (minute>=50 && minute<55) || (minute>=40 && minute<45) || (minute>=45 && minute<=50)){
         zeichnen.vor=Color.white;
       } else{
         zeichnen.vor=Color.gray;
       }
       
       if (minute>=25 && minute<40){
         zeichnen.halb=Color.white;
       } else{
         zeichnen.halb=Color.gray;
       }
       
       if ((zeichnen.vor==Color.white && zeichnen.halb==Color.gray) || (zeichnen.vor==Color.white && zeichnen.halb==Color.white) || (zeichnen.halb==Color.white && zeichnen.nach==Color.white) || (zeichnen.vor==Color.white && zeichnen.viertelVorNach==Color.white) || zeichnen.halb==Color.white){
         stunde=stunde+1;
       }
       
       
       if (stunde==0 || stunde==12 || stunde == 24){
         zeichnen.zwoelf=Color.white;
       } else{
         zeichnen.zwoelf=Color.gray;
       }
       
        if (stunde==2 || stunde==14){
         zeichnen.zweiTeilEins=Color.white;
         zeichnen.zweiTeilZwei=Color.white;
         zeichnen.einsTeilZwei=Color.gray;
         zeichnen.einsTeilDrei=Color.gray;
         zeichnen.siebenTeilZwei=Color.gray;
       } else{
         if (stunde==1 || stunde==13){
           zeichnen.zweiTeilEins=Color.gray;
           zeichnen.zweiTeilZwei=Color.white;
           zeichnen.einsTeilZwei=Color.white;
           zeichnen.einsTeilDrei=Color.white;
           zeichnen.siebenTeilZwei=Color.gray;
         } else{
           if (stunde==7 || stunde==19){
             zeichnen.zweiTeilEins=Color.gray;
             zeichnen.zweiTeilZwei=Color.gray;
             zeichnen.einsTeilZwei=Color.gray;
             zeichnen.einsTeilDrei=Color.white;
             zeichnen.siebenTeilZwei=Color.white;
           }
         }
       }
       
       
       if (stunde==3 || stunde==15){
         zeichnen.drei=Color.white;
       } else{
         zeichnen.drei=Color.gray;
       }
       
       if (stunde==4 || stunde==16){
         zeichnen.vier=Color.white;
       } else{
         zeichnen.vier=Color.gray;
       }
       
       if (stunde==5 || stunde==17){
         zeichnen.fuenf=Color.white;
       } else{
         zeichnen.fuenf=Color.gray;
       }
       
       if (stunde==6 || stunde==18){
         zeichnen.sechs=Color.white;
       } else{
         zeichnen.sechs=Color.gray;
       }
       

       
       if (stunde==8 || stunde==20){
         zeichnen.acht=Color.white;
       } else{
         zeichnen.acht=Color.gray;
       }
       
       if (stunde==9 || stunde==21){
         zeichnen.neun=Color.white;
       } else{
         zeichnen.neun=Color.gray;
       }
       
       if (stunde==10 || stunde==22){
         zeichnen.zehn=Color.white;
       } else{
         zeichnen.zehn=Color.gray;
       }
       
       if (stunde==11 || stunde==23){
         zeichnen.elf=Color.white;
       } else{
         zeichnen.elf=Color.gray;
       }
       
       if ((minute%10==0 || minute%10==5)){
         zeichnen.min1=Color.gray;
         zeichnen.min2=Color.gray;
         zeichnen.min3=Color.gray;
         zeichnen.min4=Color.gray;
       } else{
          if (minute%10==1 || minute%10==6){
            zeichnen.min1=Color.white;
            zeichnen.min2=Color.gray;
            zeichnen.min3=Color.gray;
            zeichnen.min4=Color.gray;
          } else{
             if (minute%10==2 || minute%10==7){
               zeichnen.min1=Color.white;
               zeichnen.min2=Color.white;
               zeichnen.min3=Color.gray;
               zeichnen.min4=Color.gray;
             } else{
                if (minute%10==3 || minute%10==8){
                  zeichnen.min1=Color.white;
                  zeichnen.min2=Color.white;
                  zeichnen.min3=Color.white;
                  zeichnen.min4=Color.gray;
                } else{
                   if (minute%10==4 || minute%10==9){
                     zeichnen.min1=Color.white;
                     zeichnen.min2=Color.white;
                     zeichnen.min3=Color.white;
                     zeichnen.min4=Color.white;
                   }
                }
             }
          }

       }
       

       if (zeichnen.zweiTeilZwei==Color.white && zeichnen.einsTeilZwei==Color.white && zeichnen.einsTeilDrei==Color.white && zeichnen.uhr==Color.white){
           zeichnen.einsTeilDrei=Color.gray;
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
