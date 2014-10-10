import java.awt.*;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GeekUhr implements Runnable {
  GeekPanel zeichnen;
  private Calendar cal;
  private int stunde, minute,sekunde;
  private String zeit;
  int[] links = new int[9];
  int[] rechts = new int[9];
  boolean linksFeldFrei, rechtsFeldFrei;
  int random, minutenzaehler;
  int led=0;


  public GeekUhr (GeekPanel zeichnen){
    this.zeichnen = zeichnen;

    Thread th = new Thread(this);
    th.start();
    
    minutenzaehler=60;

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
       




      if (minutenzaehler>59){
        minutenzaehler=0;


        //linke Matrix


        //Orangeausnahmen

        //19
       
        if (stunde==19){
          random = (int) (Math.random()*9);
          links[random]=2;          //mit oragener Zehner/Einerstelle belegt
         
         
          for (int i=1; i<=9; i++){
            if(links[i-1]==2){
              switch (i-1) {
               case 0:
                zeichnen.l1 = Color.orange;
               break;
               case 1:
                zeichnen.l2 = Color.orange;
               break;
               case 2:
                zeichnen.l3 = Color.orange;
               break;
               case 3:
                zeichnen.l4 = Color.orange;
               break;
               case 4:
                zeichnen.l5 = Color.orange;
               break;
               case 5:
                zeichnen.l6 = Color.orange;
               break;
               case 6:
                zeichnen.l7 = Color.orange;
               break;
               case 7:
                zeichnen.l8 = Color.orange;
               break;
               case 8:
                zeichnen.l9 = Color.orange;
               break;
              // default:
              }
            } else{
              switch (i-1) {
               case 0:
                zeichnen.l1 = Color.green;
               break;
               case 1:
                zeichnen.l2 = Color.green;
               break;
               case 2:
                zeichnen.l3 = Color.green;
               break;
               case 3:
                zeichnen.l4 = Color.green;
               break;
               case 4:
                zeichnen.l5 = Color.green;
               break;
               case 5:
                zeichnen.l6 = Color.green;
               break;
               case 6:
                zeichnen.l7 = Color.green;
               break;
               case 7:
                zeichnen.l8 = Color.green;
               break;
               case 8:
                zeichnen.l9 = Color.green;
               break;
              // default:
              }
            }
          }  links[random]=0;
        }
       
       
        //Linke Matrix rot und grün!
       
       
        if (stunde!=19){

          for (int i=1; i<=stunde/10; i++){
            while (linksFeldFrei == false){
              random = (int) (Math.random()*9);
              if (links[random]==0){
                linksFeldFrei=true;
                links[random]=1;          //mit roter Zehnerstelle belegt

                switch (random) {
                  case 0:
                   zeichnen.l1 = Color.red;
                  break;
                  case 1:
                   zeichnen.l2 = Color.red;
                  break;
                  case 2:
                   zeichnen.l3 = Color.red;
                  break;
                  case 3:
                   zeichnen.l4 = Color.red;
                  break;
                  case 4:
                   zeichnen.l5 = Color.red;
                  break;
                  case 5:
                   zeichnen.l6 = Color.red;
                  break;
                  case 6:
                   zeichnen.l7 = Color.red;
                  break;
                  case 7:
                   zeichnen.l8 = Color.red;
                  break;
                  case 8:
                   zeichnen.l9 = Color.red;
                  break;
                 // default:
                }

              }
            }
            linksFeldFrei=false;
          }
          
          for (int i=1; i<=stunde%10; i++){
            while (linksFeldFrei == false){
              random = (int) (Math.random()*9);
              if (links[random]==0){
                linksFeldFrei=true;
                links[random]=3;          //mit grüner Einerstelle belegt

                switch (random) {
                  case 0:
                   zeichnen.l1 = Color.green;
                  break;
                  case 1:
                   zeichnen.l2 = Color.green;
                  break;
                  case 2:
                   zeichnen.l3 = Color.green;
                  break;
                  case 3:
                   zeichnen.l4 = Color.green;
                  break;
                  case 4:
                   zeichnen.l5 = Color.green;
                  break;
                  case 5:
                   zeichnen.l6 = Color.green;
                  break;
                  case 6:
                   zeichnen.l7 = Color.green;
                  break;
                  case 7:
                   zeichnen.l8 = Color.green;
                  break;
                  case 8:
                   zeichnen.l9 = Color.green;
                  break;
                 // default:
                }

              }
            }
            linksFeldFrei=false;
          }
          
          for (int i=1; i<=9; i++){
            if (links[i-1]==0){
              switch (i-1) {
                  case 0:
                   zeichnen.l1 = Color.gray;
                  break;
                  case 1:
                   zeichnen.l2 = Color.gray;
                  break;
                  case 2:
                   zeichnen.l3 = Color.gray;
                  break;
                  case 3:
                   zeichnen.l4 = Color.gray;
                  break;
                  case 4:
                   zeichnen.l5 = Color.gray;
                  break;
                  case 5:
                   zeichnen.l6 = Color.gray;
                  break;
                  case 6:
                   zeichnen.l7 = Color.gray;
                  break;
                  case 7:
                   zeichnen.l8 = Color.gray;
                  break;
                  case 8:
                   zeichnen.l9 = Color.gray;
                  break;
                 // default:
                }
            }
          }
        }

         // RECHTE MATRIX
         
         //Orangeausnamefälle!
         
          if ((minute/10) + (minute%10) >=10){
            for (int i=1; i<=minute/10; i++){
              while (rechtsFeldFrei == false){
                random = (int) (Math.random()*9);
                if (rechts[random]==0){
                  rechtsFeldFrei=true;
                  rechts[random]=2;          //mit orangener Zehner/einerstelle belegt

                  switch (random) {
                    case 0:
                     zeichnen.r1 = Color.orange;
                    break;
                    case 1:
                     zeichnen.r2 = Color.orange;
                    break;
                    case 2:
                     zeichnen.r3 = Color.orange;
                    break;
                    case 3:
                     zeichnen.r4 = Color.orange;
                    break;
                    case 4:
                     zeichnen.r5 = Color.orange;
                    break;
                    case 5:
                     zeichnen.r6 = Color.orange;
                    break;
                    case 6:
                     zeichnen.r7 = Color.orange;
                    break;
                    case 7:
                     zeichnen.r8 = Color.orange;
                    break;
                    case 8:
                     zeichnen.r9 = Color.orange;
                    break;
                   // default:
                  }
                }
              }  rechtsFeldFrei=false;
            }
            for (int i=1; i<=((minute%10) - (minute/10)); i++){
              while (rechtsFeldFrei == false){
                random = (int) (Math.random()*9);

              if (rechts[random]==0){
                rechtsFeldFrei = true;
                rechts[random]=3;           // mit grüner Einerstelle belegen
                switch (random) {
                  case 0:
                   zeichnen.r1 = Color.green;
                  break;
                  case 1:
                   zeichnen.r2 = Color.green;
                  break;
                  case 2:
                   zeichnen.r3 = Color.green;
                  break;
                  case 3:
                   zeichnen.r4 = Color.green;
                  break;
                  case 4:
                   zeichnen.r5 = Color.green;
                  break;
                  case 5:
                   zeichnen.r6 = Color.green;
                  break;
                  case 6:
                   zeichnen.r7 = Color.green;
                  break;
                  case 7:
                   zeichnen.r8 = Color.green;
                  break;
                  case 8:
                   zeichnen.r9 = Color.green;
                  break;
                 // default:
                }
              }
            } rechtsFeldFrei = false;
          }
            for (int i=1; i<=9; i++){
              if (rechts[i-1]==0){
                switch (i-1) {
                    case 0:
                     zeichnen.r1 = Color.gray;
                    break;
                    case 1:
                     zeichnen.r2 = Color.gray;
                    break;
                    case 2:
                     zeichnen.r3 = Color.gray;
                    break;
                    case 3:
                     zeichnen.r4 = Color.gray;
                    break;
                    case 4:
                     zeichnen.r5 = Color.gray;
                    break;
                    case 5:
                     zeichnen.r6 = Color.gray;
                    break;
                    case 6:
                     zeichnen.r7 = Color.gray;
                    break;
                    case 7:
                     zeichnen.r8 = Color.gray;
                    break;
                    case 8:
                     zeichnen.r9 = Color.gray;
                    break;
                   // default:
                  }
              }
            }
        } else {                                // Rechte Matrix rot & grün!
          
          for (int i=1; i<=minute/10; i++){
            while (rechtsFeldFrei == false){
              random = (int) (Math.random()*9);
              if (rechts[random]==0){
                rechtsFeldFrei=true;
                rechts[random]=1;          //mit roter Zehnerstelle belegt

                switch (random) {
                  case 0:
                   zeichnen.r1 = Color.red;
                  break;
                  case 1:
                   zeichnen.r2 = Color.red;
                  break;
                  case 2:
                   zeichnen.r3 = Color.red;
                  break;
                  case 3:
                   zeichnen.r4 = Color.red;
                  break;
                  case 4:
                   zeichnen.r5 = Color.red;
                  break;
                  case 5:
                   zeichnen.r6 = Color.red;
                  break;
                  case 6:
                   zeichnen.r7 = Color.red;
                  break;
                  case 7:
                   zeichnen.r8 = Color.red;
                  break;
                  case 8:
                   zeichnen.r9 = Color.red;
                  break;
                 // default:
                }

              }
            }
            rechtsFeldFrei=false;
          }

          for (int i=1; i<=minute%10; i++){
            while (rechtsFeldFrei == false){
              random = (int) (Math.random()*9);
              if (rechts[random]==0){
                rechtsFeldFrei=true;
                rechts[random]=3;          //mit grüner Einerstelle belegt

                switch (random) {
                  case 0:
                   zeichnen.r1 = Color.green;
                  break;
                  case 1:
                   zeichnen.r2 = Color.green;
                  break;
                  case 2:
                   zeichnen.r3 = Color.green;
                  break;
                  case 3:
                   zeichnen.r4 = Color.green;
                  break;
                  case 4:
                   zeichnen.r5 = Color.green;
                  break;
                  case 5:
                   zeichnen.r6 = Color.green;
                  break;
                  case 6:
                   zeichnen.r7 = Color.green;
                  break;
                  case 7:
                   zeichnen.r8 = Color.green;
                  break;
                  case 8:
                   zeichnen.r9 = Color.green;
                  break;
                 // default:
                }

              }
            }
            rechtsFeldFrei=false;
          }

          for (int i=1; i<=9; i++){
            if (rechts[i-1]==0){
              switch (i-1) {
                  case 0:
                   zeichnen.r1 = Color.gray;
                  break;
                  case 1:
                   zeichnen.r2 = Color.gray;
                  break;
                  case 2:
                   zeichnen.r3 = Color.gray;
                  break;
                  case 3:
                   zeichnen.r4 = Color.gray;
                  break;
                  case 4:
                   zeichnen.r5 = Color.gray;
                  break;
                  case 5:
                   zeichnen.r6 = Color.gray;
                  break;
                  case 6:
                   zeichnen.r7 = Color.gray;
                  break;
                  case 7:
                   zeichnen.r8 = Color.gray;
                  break;
                  case 8:
                   zeichnen.r9 = Color.gray;
                  break;
                 // default:
                }
            }
          }
        }




      }

      if (led%2==0){
        zeichnen.led1 = Color.white;
        zeichnen.led2 = Color.blue;
      } else{
        zeichnen.led2 = Color.white;
        zeichnen.led1 = Color.blue;
      }

       
      led++;

      if (led == 100000){
        led=0;
      }

      minutenzaehler=sekunde;
      minutenzaehler++;
      for (int i=1; i<=9; i++){
        links[i-1]=0;
        rechts[i-1]=0;
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
