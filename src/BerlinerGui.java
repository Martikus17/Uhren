import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BerlinerGui extends JFrame {
  public Container c;
  BerlinerPanel zeichnen;

  public BerlinerGui() {
    c = getContentPane();
    zeichnen = new BerlinerPanel();

    c.add(zeichnen);
  }

}
