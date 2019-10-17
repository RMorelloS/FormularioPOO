import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;

public class FechaNacimientoPaciente extends JPanel{
    static JTextField txtfechaNacimientoPaciente;
    static JLabel fechaNacimientoPaciente;

    FechaNacimientoPaciente(){
      setLayout(new GridLayout(1,2));
      this.setBackground(Color.white);
      fechaNacimientoPaciente = new JLabel("B.3 Fecha de nacimiento (dd/mm/aaaa):", SwingConstants.CENTER);
      fechaNacimientoPaciente.setBounds(200,22,150,10);
      add(fechaNacimientoPaciente);
      txtfechaNacimientoPaciente = new JTextField("",3);
      add(txtfechaNacimientoPaciente);


    }

}
