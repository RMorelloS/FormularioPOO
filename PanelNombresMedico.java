import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
public class PanelNombresMedico extends JPanel{
  static JLabel apellidoPaterno;
  static JLabel apellidoMaterno;
  static JLabel nombres;
  static JTextField nombreMedico;
  static JTextField apellidoPaternoMedico;
  static JTextField apellidoMaternoMedico;
  PanelNombresMedico(){
      setLayout(new GridLayout(2,3));
      nombreMedico = new JTextField("",3);
      apellidoMaternoMedico = new JTextField("",3);
      apellidoPaternoMedico = new JTextField("",3);
      add(apellidoPaternoMedico);
      add(apellidoMaternoMedico);
      add(nombreMedico);
      apellidoPaterno = new JLabel("Apellido paterno");
      apellidoMaterno = new JLabel("Apellido materno");
      nombres = new JLabel("Nombre(s)");
      add(apellidoPaterno);
      add(apellidoMaterno);
      add(nombres);

  }
}
