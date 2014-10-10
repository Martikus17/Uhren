import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class WortPanel extends JPanel {

  private Calendar cal;
  private int stunde, minute,sekunde;
  private String zeit;
  
  WortUhr wu;
  
  Color fuenfVorNach;
  Color zehnVorNach;
  Color zwanzigVorNach;
  Color dreiviertelVorNach;
  Color viertelVorNach;
  Color nach;
  Color vor;
  Color halb;
  Color zwoelf;
  Color zweiTeilEins;
  Color zweiTeilZwei;
  Color einsTeilZwei;
  Color einsTeilDrei;
  Color siebenTeilZwei;
  Color drei;
  Color fuenf;
  Color elf;
  Color neun;
  Color vier;
  Color acht;
  Color zehn;
  Color sechs;
  Color uhr;
  Color min1;
  Color min2;
  Color min3;
  Color min4;
  Color am;
  Color pm;
  
  
  
  public WortPanel() {
    setBackground(Color.black);

    wu = new WortUhr(this);
    
    fuenfVorNach = Color.gray;
    zehnVorNach = Color.gray;
    zwanzigVorNach = Color.gray;
    dreiviertelVorNach = Color.gray;
    viertelVorNach = Color.gray;
    nach = Color.gray;
    vor = Color.gray;
    halb = Color.gray;
    zwoelf = Color.gray;
    zweiTeilEins = Color.gray;
    zweiTeilZwei = Color.gray;
    einsTeilZwei = Color.gray;
    einsTeilDrei = Color.gray;
    siebenTeilZwei = Color.gray;
    drei = Color.gray;
    fuenf = Color.gray;
    elf = Color.gray;
    neun = Color.gray;
    vier = Color.gray;
    acht = Color.gray;
    zehn = Color.gray;
    sechs = Color.gray;
    uhr = Color.gray;
    min1 = Color.gray;
    min2 = Color.gray;
    min3 = Color.gray;
    min4 = Color.gray;
    am = Color.gray;
    pm = Color.gray;

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
    g.drawString(zeit, 108, 260);
    
    
    
    
    g.setColor(Color.white);
    g.drawString("E",30,40);
    g.drawString("S",50,40);
    g.setColor(Color.gray);
    g.drawString("K",70,40);
    g.setColor(Color.white);
    g.drawString(" I",90,40);
    g.drawString("S",110,40);
    g.drawString("T",130,40);
    g.setColor(Color.gray);
    g.drawString("L",150,40);
    g.setColor(fuenfVorNach);
    g.drawString("F",170,40);
    g.drawString("Ü",190,40);
    g.drawString("N",210,40);
    g.drawString("F",230,40);
    
    g.setColor(zehnVorNach);
    g.drawString("Z",30,60);
    g.drawString("E",50,60);
    g.drawString("H",70,60);
    g.drawString("N",90,60);
    g.setColor(zwanzigVorNach);
    g.drawString("Z",110,60);
    g.drawString("W",130,60);
    g.drawString("A",150,60);
    g.drawString("N",170,60);
    g.drawString("Z",190,60);
    g.drawString(" I",210,60);
    g.drawString("G",230,60);
    
    g.setColor(dreiviertelVorNach);
    g.drawString("D",30,80);
    g.drawString("R",50,80);
    g.drawString("E",70,80);
    g.drawString(" I",90,80);
    g.setColor(viertelVorNach);
    g.drawString("V",110,80);
    g.drawString(" I",130,80);
    g.drawString("E",150,80);
    g.drawString("R",170,80);
    g.drawString("T",190,80);
    g.drawString("E",210,80);
    g.drawString("L",230,80);
    
    g.setColor(Color.gray);
    g.drawString("T",30,100);
    g.drawString("G",50,100);
    g.setColor(nach);
    g.drawString("N",70,100);
    g.drawString("A",90,100);
    g.drawString("C",110,100);
    g.drawString("H",130,100);
    g.setColor(vor);
    g.drawString("V",150,100);
    g.drawString("O",170,100);
    g.drawString("R",190,100);
    g.setColor(Color.gray);
    g.drawString("J",210,100);
    g.drawString("M",230,100);
    
    g.setColor(halb);
    g.drawString("H",30,120);
    g.drawString("A",50,120);
    g.drawString("L",70,120);
    g.drawString("B",90,120);
    g.setColor(Color.gray);
    g.drawString("Q",110,120);
    g.setColor(zwoelf);
    g.drawString("Z",130,120);
    g.drawString("W",150,120);
    g.drawString("Ö",170,120);
    g.drawString("L",190,120);
    g.drawString("F",210,120);
    g.setColor(Color.gray);
    g.drawString("P",230,120);
    
    g.setColor(zweiTeilEins);
    g.drawString("Z",30,140);
    g.drawString("W",50,140);
    g.setColor(zweiTeilZwei);
    g.drawString("E",70,140);
    g.drawString(" I",90,140);
    g.setColor(einsTeilZwei);
    g.drawString("N",110,140);
    g.setColor(einsTeilDrei);
    g.drawString("S",130,140);
    g.setColor(siebenTeilZwei);
    g.drawString(" I",150,140);
    g.drawString("E",170,140);
    g.drawString("B",190,140);
    g.drawString("E",210,140);
    g.drawString("N",230,140);
    
    g.setColor(Color.gray);
    g.drawString("K",30,160);
    g.setColor(drei);
    g.drawString("D",50,160);
    g.drawString("R",70,160);
    g.drawString("E",90,160);
    g.drawString(" I",110,160);
    g.setColor(Color.gray);
    g.drawString("R",130,160);
    g.drawString("H",150,160);
    g.setColor(fuenf);
    g.drawString("F",170,160);
    g.drawString("Ü",190,160);
    g.drawString("N",210,160);
    g.drawString("F",230,160);
    
    g.setColor(elf);
    g.drawString("E",30,180);
    g.drawString("L",50,180);
    g.drawString("F",70,180);
    g.setColor(neun);
    g.drawString("N",90,180);
    g.drawString("E",110,180);
    g.drawString("U",130,180);
    g.drawString("N",150,180);
    g.setColor(vier);
    g.drawString("V",170,180);
    g.drawString(" I",190,180);
    g.drawString("E",210,180);
    g.drawString("R",230,180);
    
    g.setColor(Color.gray);
    g.drawString("W",30,200);
    g.setColor(acht);
    g.drawString("A",50,200);
    g.drawString("C",70,200);
    g.drawString("H",90,200);
    g.drawString("T",110,200);
    g.setColor(zehn);
    g.drawString("Z",130,200);
    g.drawString("E",150,200);
    g.drawString("H",170,200);
    g.drawString("N",190,200);
    g.setColor(Color.gray);
    g.drawString("R",210,200);
    g.drawString("S",230,200);
    
    g.setColor(Color.gray);
    g.drawString("B",30,220);
    g.setColor(sechs);
    g.drawString("S",50,220);
    g.drawString("E",70,220);
    g.drawString("C",90,220);
    g.drawString("H",110,220);
    g.drawString("S",130,220);
    g.setColor(Color.gray);
    g.drawString("F",150,220);
    g.drawString("M",170,220);
    g.setColor(uhr);
    g.drawString("U",190,220);
    g.drawString("H",210,220);
    g.drawString("R",230,220);
    
    
    g.setColor(min1);
    g.drawString("*",31,240);
    g.setColor(min2);
    g.drawString("*",51,240);
    g.setColor(min3);
    g.drawString("*",71,240);
    g.setColor(min4);
    g.drawString("*",91,240);
    
    g.setColor(am);
    g.drawString("*",211,240);
    g.setColor(pm);
    g.drawString("*",231,240);

    
    
    
    
  }


}