import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WortGui extends JFrame {
  public Container c;
  WortPanel zeichnen;


  public WortGui() {
    c = getContentPane();
    zeichnen = new WortPanel();


    c.add(zeichnen);
  }

}