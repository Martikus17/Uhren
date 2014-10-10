import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GeekGui extends JFrame {
  public Container c;
  GeekPanel zeichnen;


  public GeekGui() {
    c = getContentPane();
    zeichnen = new GeekPanel();


    c.add(zeichnen);
  }

}