import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UhrenSteuerung {
  public UhrenGui dieGui;
  public BerlinerGui berliner;
  public GeekGui geek;
  public KreisGui kreis;
  public WortGui wort;
  
  private boolean fensterBerliner, fensterGeek, fensterKreis, fensterWort;
  
  public UhrenSteuerung() {


    dieGui = new UhrenGui(this);

    dieGui.setTitle("Uhrdarstellung");
    dieGui.setSize(525,500);
    dieGui.setLocation(300,150);
    dieGui.setResizable(false);
    dieGui.setVisible(true);
    dieGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    
      berliner = new BerlinerGui();
      berliner.setTitle("Berliner Uhr");
      berliner.setSize(300,330);
      berliner.setLocation(350,200);
      berliner.setResizable(false);
      berliner.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      

      geek = new GeekGui();
      geek.setTitle("Geek Uhr");
      geek.setSize(420,245);
      geek.setLocation(350,200);
      geek.setResizable(false);
      geek.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    

      kreis = new KreisGui();
      kreis.setTitle("Kreis Uhr");
      kreis.setSize(350,390);
      kreis.setLocation(350,200);
      kreis.setResizable(false);
      kreis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    

      wort = new WortGui();
      wort.setTitle("Wort Uhr");
      wort.setSize(280,300);
      wort.setLocation(350,200);
      wort.setResizable(false);
      wort.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


  }


    public static void main(String[] args) {
    UhrenSteuerung fenster = new UhrenSteuerung();
  }
  
  public void setFensterBerliner(boolean fensterBerliner){
    this.fensterBerliner = fensterBerliner;
  }

  public boolean getFensterBerliner(){
    return fensterBerliner;
  }
  
  public void setFensterGeek(boolean fensterGeek){
    this.fensterGeek = fensterGeek;
  }

  public boolean getFensterGeek(){
    return fensterGeek;
  }
  
  public void setFensterKreis(boolean fensterKreis){
    this.fensterKreis = fensterKreis;
  }

  public boolean getFensterKreis(){
    return fensterKreis;
  }
  
  public void setFensterWort(boolean fensterWort){
    this.fensterWort = fensterWort;
  }

  public boolean getFensterWort(){
    return fensterWort;
  }
  
  
  
  
}
