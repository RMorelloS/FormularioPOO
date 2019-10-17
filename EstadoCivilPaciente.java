import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
public class EstadoCivilPaciente extends JPanel{
    static JLabel estadoCivil;


    EstadoCivilPaciente(){
      setLayout(new GridLayout(1,2));
      this.setBackground(Color.white);
      estadoCivil = new JLabel("B.10 Estado Civil:", SwingConstants.CENTER);
      add(estadoCivil);
      CBEstadoCivilPaciente cbEstadoCivilPaciente = new CBEstadoCivilPaciente();
      add(cbEstadoCivilPaciente);
    }

}
