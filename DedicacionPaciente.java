import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
public class DedicacionPaciente extends JPanel{
    static CheckboxGroup cbDedicacionPaciente;
    static JLabel dedica;
    
    DedicacionPaciente(){
      setLayout(new GridLayout(4,2));
      dedica = new JLabel("B.14 A que se dedica?");
      add(dedica);
      JLabel vacio = new JLabel("");
      add(vacio);
      
      cbDedicacionPaciente = new CheckboxGroup();
      add(new Checkbox("0. Desempleado", cbDedicacionPaciente, true));
      add(new Checkbox("7. Profesionista independiente", cbDedicacionPaciente, true));
      add(new Checkbox("1. Jubilado(a) sin pension", cbDedicacionPaciente, true));
      add(new Checkbox("8. Patron(a) jefe(a) o empresario(a)", cbDedicacionPaciente, true));
      add(new Checkbox("2. Jubilado(a) con pension", cbDedicacionPaciente, true));
      add(new Checkbox("9. Ama de casa", cbDedicacionPaciente, true));
    }

}
