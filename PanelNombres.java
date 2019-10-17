import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
public class PanelNombres extends JPanel{
  static JLabel apellidoPaterno;
  static JLabel apellidoMaterno;
  static JLabel nombres;
  PanelNombres(){
      setLayout(new GridLayout(1,3));
      apellidoPaterno = new JLabel("Apellido paterno");
      apellidoMaterno = new JLabel("Apellido materno");
      nombres = new JLabel("Nombre(s)");
      add(apellidoPaterno);
      add(apellidoMaterno);
      add(nombres);

  }
}
