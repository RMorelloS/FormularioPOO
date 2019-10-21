import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
public class LecturaPaciente extends JPanel{
    static CheckboxGroup cbSabeLeerPaciente;
    static JLabel sabeEscribir;
    
    LecturaPaciente(){
      setLayout(new GridLayout(1,3));
      this.setBackground(Color.white);
      sabeEscribir = new JLabel("Sabe leer?");
      add(sabeEscribir);
      cbSabeLeerPaciente = new CheckboxGroup();
      add(new Checkbox("0. Si", cbSabeLeerPaciente, true));
      add(new Checkbox("1. No", cbSabeLeerPaciente, true));
      
      
    }

}
