import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
public class DedicacionReligionPaciente extends JPanel{
    
    DedicacionReligionPaciente(){
      setLayout(new GridLayout(1,3));
      
      DedicacionPaciente d1 = new DedicacionPaciente();
      add(d1);
      
      JLabel vacio = new JLabel("");
      add(vacio);
      ReligionPaciente r1 = new ReligionPaciente();
      add(r1);
      
      
    }

}
