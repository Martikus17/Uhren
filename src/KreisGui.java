import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KreisGui extends JFrame {
  public Container c;
  KreisPanel zeichnen;


  public KreisGui() {
    c = getContentPane();
    zeichnen = new KreisPanel();


    c.add(zeichnen);
  }

}