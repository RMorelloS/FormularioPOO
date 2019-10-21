import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
public class PanelNombresPaciente extends JPanel{
  static JLabel apellidoPaterno;
  static JLabel apellidoMaterno;
  static JLabel nombres;
  static JTextField nombrePaciente;
  static JTextField apellidoPaternoPaciente;
  static JTextField apellidoMaternoPaciente;
  PanelNombresPaciente(){
      setLayout(new GridLayout(2,3));
      nombrePaciente = new JTextField("",3);
      apellidoMaternoPaciente = new JTextField("",3);
      apellidoPaternoPaciente = new JTextField("",3);
      add(apellidoPaternoPaciente);
      add(apellidoMaternoPaciente);
      add(nombrePaciente);
      apellidoPaterno = new JLabel("Apellido paterno");
      apellidoMaterno = new JLabel("Apellido materno");
      nombres = new JLabel("Nombre(s)");
      add(apellidoPaterno);
      add(apellidoMaterno);
      add(nombres);

  }
}
